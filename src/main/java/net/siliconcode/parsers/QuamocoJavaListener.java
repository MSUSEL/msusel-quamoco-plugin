/**
 * The MIT License (MIT)
 * 
 * Sonar Quamoco Plugin
 * Copyright (c) 2015 Isaac Griffith, SiliconCode, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.siliconcode.parsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.tree.TerminalNode;

import net.siliconcode.parsers.java.Java8BaseListener;
import net.siliconcode.parsers.java.Java8Parser.ClassDeclarationContext;
import net.siliconcode.parsers.java.Java8Parser.ConstructorDeclarationContext;
import net.siliconcode.parsers.java.Java8Parser.EnumDeclarationContext;
import net.siliconcode.parsers.java.Java8Parser.InterfaceDeclarationContext;
import net.siliconcode.parsers.java.Java8Parser.MethodDeclaratorContext;
import net.siliconcode.parsers.java.Java8Parser.NormalInterfaceDeclarationContext;
import net.siliconcode.parsers.java.Java8Parser.PackageDeclarationContext;
import net.siliconcode.parsers.java.Java8Parser.UnannTypeContext;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.codetree.MethodNode;
import net.siliconcode.quamoco.codetree.TypeNode;

/**
 * QuamocoJavaListener -
 * 
 * @author Isaac Griffith
 */
public class QuamocoJavaListener extends Java8BaseListener {

	List<String> params = new ArrayList<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.siliconcode.parsers.java.Java8BaseListener#enterUnannType(net.
	 * siliconcode.parsers.java.Java8Parser.UnannTypeContext)
	 */
	@Override
	public void enterUnannType(UnannTypeContext ctx) {
		params.add(ctx.getText());
		super.enterUnannType(ctx);
	}

	private Stack<TypeNode> classes;
	private String packageName;
	private FileNode file;

	/**
	 * @param file
	 */
	public QuamocoJavaListener(FileNode file) {
		this.file = file;
		packageName = null;
		classes = new Stack<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.siliconcode.parsers.java.Java8BaseListener#enterClassDeclaration(net.
	 * siliconcode.parsers.java.Java8Parser.ClassDeclarationContext)
	 */
	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		int start = ctx.getStart().getLine();
		int end = ctx.getStop().getLine();

		String name = ctx.normalClassDeclaration().Identifier().getText();
		String fullName = packageName == null ? name : packageName + "." + name;
		TypeNode node = new TypeNode(file, fullName, name, true, start, end);
		classes.add(node);
		file.addType(node);

		super.enterClassDeclaration(ctx);
	}

	@Override
	public void enterMethodDeclarator(MethodDeclaratorContext ctx) {
		params.clear();

		super.enterMethodDeclarator(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.siliconcode.parsers.java.Java8BaseListener#enterMethodDeclaration(net
	 * .siliconcode.parsers.java.Java8Parser.MethodDeclarationContext)
	 */
	@Override
	public void exitMethodDeclarator(MethodDeclaratorContext ctx) {
		int start = ctx.getStart().getLine();
		int end = ctx.getStop().getLine();

		StringBuilder methodName = new StringBuilder();
		methodName.append(classes.peek().getIdentifier());
		String name = ctx.Identifier().getText();
		methodName.append(name + "(");

		boolean first = true;
		for (String px : params) {
			if (!first) {
				methodName.append(" ,");
			}
			methodName.append(px);
			first = false;
		}

		methodName.append(")");
		name = methodName.toString();
		String fullName = classes.peek().getQIdentifier() + "." + name;
		MethodNode node = new MethodNode(classes.peek(), name, false, start, end);
		classes.peek().addMethod(node);

		super.exitMethodDeclarator(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.siliconcode.parsers.java.Java8BaseListener#
	 * enterConstructorDeclaration(net.siliconcode.parsers.java.Java8Parser.
	 * ConstructorDeclarationContext)
	 */
	@Override
	public void enterConstructorDeclaration(ConstructorDeclarationContext ctx) {
		params.clear();

		super.enterConstructorDeclaration(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.siliconcode.parsers.java.Java8BaseListener#exitConstructorDeclaration
	 * (net.siliconcode.parsers.java.Java8Parser.ConstructorDeclarationContext)
	 */
	@Override
	public void exitConstructorDeclaration(ConstructorDeclarationContext ctx) {
		int start = ctx.getStart().getLine();
		int end = ctx.getStart().getLine();

		StringBuilder methodName = new StringBuilder();
		methodName.append(classes.peek().getIdentifier());
		String name = classes.peek().getIdentifier().getShortKey();
		name = name.substring(name.lastIndexOf(".") + 1);
		methodName.append(name + "(");

		boolean first = true;
		for (String px : params) {
			if (!first) {
				methodName.append(" ,");
			}
			methodName.append(px);
			first = false;
		}

		methodName.append(")");
		name = methodName.toString();
		String fullName = classes.peek().getQIdentifier() + "." + name;
		MethodNode node = new MethodNode(classes.peek(), name, true, start, end);
		classes.peek().addMethod(node);

		super.exitConstructorDeclaration(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.siliconcode.parsers.java.Java8BaseListener#enterEnumDeclaration(net.
	 * siliconcode.parsers.java.Java8Parser.EnumDeclarationContext)
	 */
	@Override
	public void enterEnumDeclaration(EnumDeclarationContext ctx) {
		int start = ctx.getStart().getLine();
		int end = ctx.getStop().getLine();

		String name = ctx.Identifier().getText();
		String fullName = packageName == null ? name : packageName + "." + name;
		TypeNode node = new TypeNode(file, fullName, name, true, start, end);
		classes.add(node);
		file.addType(node);

		super.enterEnumDeclaration(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.siliconcode.parsers.java.Java8BaseListener#enterInterfaceDeclaration(
	 * net.siliconcode.parsers.java.Java8Parser.InterfaceDeclarationContext)
	 */
	@Override
	public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		int start = ctx.getStart().getLine();
		int end = ctx.getStop().getLine();

		NormalInterfaceDeclarationContext nidx = ctx.normalInterfaceDeclaration();
		String name = nidx.Identifier().getText();
		String fullName = packageName == null ? name : packageName + "." + name;

		TypeNode node = new TypeNode(file, fullName, name, false, start, end);
		classes.push(node);
		file.addType(node);

		super.enterInterfaceDeclaration(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.siliconcode.parsers.java.Java8BaseListener#enterPackageDeclaration(
	 * net.siliconcode.parsers.java.Java8Parser.PackageDeclarationContext)
	 */
	@Override
	public void enterPackageDeclaration(PackageDeclarationContext ctx) {
		List<TerminalNode> idx = ctx.Identifier();

		StringBuilder pkg = new StringBuilder();
		boolean first = true;
		for (TerminalNode n : idx) {
			if (!first)
				pkg.append(".");
			pkg.append(n.getText());
			first = false;
		}

		packageName = pkg.toString();

		super.enterPackageDeclaration(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.siliconcode.parsers.java.Java8BaseListener#exitClassDeclaration(net.
	 * siliconcode.parsers.java.Java8Parser.ClassDeclarationContext)
	 */
	@Override
	public void exitClassDeclaration(ClassDeclarationContext ctx) {
		classes.pop();

		super.exitClassDeclaration(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.siliconcode.parsers.java.Java8BaseListener#exitEnumDeclaration(net.
	 * siliconcode.parsers.java.Java8Parser.EnumDeclarationContext)
	 */
	@Override
	public void exitEnumDeclaration(EnumDeclarationContext ctx) {
		classes.pop();

		super.exitEnumDeclaration(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.siliconcode.parsers.java.Java8BaseListener#exitInterfaceDeclaration(
	 * net.siliconcode.parsers.java.Java8Parser.InterfaceDeclarationContext)
	 */
	@Override
	public void exitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		classes.pop();

		super.exitInterfaceDeclaration(ctx);
	}
}