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
package net.siliconcode.quamoco.cli;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * LineFixer -
 * 
 * @author Isaac Griffith
 *
 */
public class LineFixer {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        readAndReplace("/home/fate/Dropbox/Business/models/csharp.qm");
    }

    public static void readAndReplace(String loc) throws IOException {
        Path path = Paths.get(loc);

        List<String> lines = Files.readAllLines(path);

        List<String> otherLines = Lists.newArrayList();

        for (String s : lines) {
            if (s.contains("<measurementMethods") && s.contains("tool=\"_MVSFAAJ1EeWbMo4DEKuBTw")) {
                int t = s.indexOf("metric=\"");
                String temp = s.substring(t);
                String toReplace = temp.substring(temp.indexOf("\"") + 1, temp.lastIndexOf("\""));

                String replacement = toReplace;
                if (toReplace.contains(":")) {
                    temp = toReplace.substring(toReplace.indexOf(" "));
                    String[] words = temp.split(" ");

                    StringBuilder builder = new StringBuilder();
                    for (String word : words) {
                        if (word.isEmpty())
                            continue;
                        char x = word.charAt(0);
                        String newWord = word;
                        if (Character.isLowerCase(x)) {
                            newWord = newWord.replace(x, Character.toUpperCase(x));
                        }

                        builder.append(newWord);
                    }

                    replacement = builder.toString();
                }

                System.out.println(toReplace + " -> " + replacement);
                otherLines.add(s.replace(toReplace, replacement));
            }
            else {
                otherLines.add(s);
            }
        }

        Path path2 = Paths.get(path.getParent().toString() + "/" + "temp.qm");
        Files.deleteIfExists(path2);
        Files.createFile(path2);
        System.out.println(path2.toString());
        PrintWriter pw = new PrintWriter(Files.newBufferedWriter(path2, StandardOpenOption.WRITE));

        for (String line : otherLines) {
            pw.println(line);
        }
        
        pw.flush();
    }

}
