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
package net.siliconcode.sonar.quamoco;

import java.util.Map;
import java.util.TreeMap;

import org.sonar.api.BatchExtension;

/**
 * JavaMetricsContext -
 * 
 * @author Isaac Griffith
 */
public class MetricsContext implements BatchExtension {

    private Map<String, Integer> fileLoC;
    private Map<String, Integer> typeLoC;
    private Map<String, Integer> methodLoC;
    private Map<String, Integer> fileNoF;
    private Map<String, Integer> typeNoF;
    private Map<String, Integer> fileNOT;
    private Map<String, Integer> fileNOC;
    private Map<String, Integer> fileNOS;
    private Map<String, Integer> typeNOS;
    private Map<String, Integer> methodNOS;
    private Map<String, Integer> fileNOV;
    private Map<String, Integer> typeNOV;
    private Map<String, Integer> fileNOM;
    private Map<String, Integer> typeNOM;
    private int                  totalLOC;
    private int                  totalNOF;
    private int                  totalNOV;
    private int                  totalNOM;
    private int                  totalNOC;
    private int                  totalNOT;
    private int                  totalNOS;

    public MetricsContext()
    {
        fileLoC = new TreeMap<>();
        typeLoC = new TreeMap<>();
        methodLoC = new TreeMap<>();
        fileNoF = new TreeMap<>();
        typeNoF = new TreeMap<>();
        fileNOT = new TreeMap<>();
        fileNOC = new TreeMap<>();
        fileNOS = new TreeMap<>();
        typeNOS = new TreeMap<>();
        methodNOS = new TreeMap<>();
        fileNOV = new TreeMap<>();
        typeNOV = new TreeMap<>();
        fileNOM = new TreeMap<>();
        typeNOM = new TreeMap<>();
    }

    public int getFileLOC(String fileName)
    {
        if (fileLoC.containsKey(fileName))
            return fileLoC.get(fileName);
        else
            return -1;
    }

    public void setFileLOC(String fileName, int loc)
    {
        if (fileName != null && loc >= 0)
            fileLoC.put(fileName, loc);
    }

    public int getTypeLOC(String type)
    {
        if (typeLoC.containsKey(type))
            return typeLoC.get(type);
        else
            return -1;
    }

    public void setTypeLOC(String type, int loc)
    {
        if (type != null && loc >= 0)
            typeLoC.put(type, loc);
    }

    public int getMethodLOC(String method, int loc)
    {
        if (methodLoC.containsKey(method))
            return methodLoC.get(method);
        else
            return -1;
    }

    public void setMethodLOC(String method, int loc)
    {
        if (method != null && loc >= 0)
            methodLoC.put(method, loc);
    }

    public int getTotalLOC()
    {
        return totalLOC;
    }

    public void setTotalLOC(int loc)
    {
        if (loc >= 0)
            totalLOC = loc;
        else
            totalLOC = 0;
    }

    public int getFileNOF(String fileName)
    {
        if (fileNoF.containsKey(fileName))
            return fileNoF.get(fileName);
        else
            return -1;
    }

    public void setFileNOF(String fileName, int nof)
    {
        if (fileName != null && nof >= 0)
            fileNoF.put(fileName, nof);
    }

    public int getTypeNOF(String type)
    {
        if (typeNoF.containsKey(type))
            return typeNoF.get(type);
        else
            return -1;
    }

    public void setTypeNOF(String type, int nof)
    {
        if (type != null && nof >= 0)
            typeNoF.put(type, nof);
    }

    public int getTotalNOF()
    {
        return totalNOF;
    }

    public void setTotalNOF(int nof)
    {
        if (nof >= 0)
            totalNOF = nof;
        else
            totalNOF = 0;
    }

    public int getFileNOT(String file)
    {
        if (fileNOT.containsKey(file))
            return fileNOT.get(file);
        else
            return -1;
    }

    public void setFileNOT(String file, int not)
    {
        if (file != null && not >= 0)
            fileNOT.put(file, not);
    }

    public int getTotalNOT()
    {
        return totalNOT;
    }

    public void setTotalNOT(int not)
    {
        if (not >= 0)
            totalNOT = not;
        else
            totalNOT = 0;
    }

    public int getFileNOC(String file)
    {
        if (fileNOC.containsKey(file))
            return fileNOC.get(file);
        else
            return -1;
    }

    public void setFileNOC(String file, int noc)
    {
        if (file != null && noc >= 0)
            fileNOC.put(file, noc);
    }

    public int getTotalNOC()
    {
        return totalNOC;
    }

    public void setTotalNOC(int noc)
    {
        if (noc >= 0)
            totalNOC = noc;
        else
            totalNOC = 0;
    }

    public int getFileNOS(String file)
    {
        if (fileNOS.containsKey(file))
            return fileNOS.get(file);
        else
            return -1;
    }

    public void setFileNOS(String file, int nos)
    {
        if (file != null && nos >= 0)
            fileNOS.put(file, nos);
    }

    public int getTypeNOS(String type)
    {
        if (typeNOS.containsKey(type))
            return typeNOS.get(type);
        else
            return -1;
    }

    public void setTypeNOS(String type, int nos)
    {
        if (type != null && nos >= 0)
            typeNOS.put(type, nos);
    }

    public int getMethodNOS(String method)
    {
        if (methodNOS.containsKey(method))
            return methodNOS.get(method);
        else
            return -1;
    }

    public void setMethodNOS(String method, int nos)
    {
        if (method != null && nos >= 0)
            methodNOS.put(method, nos);
    }

    public int getTotalNOS()
    {
        return totalNOS;
    }

    public void setTotalNOS(int nos)
    {
        if (nos >= 0)
            totalNOS = nos;
        else
            totalNOS = 0;
    }

    public int getFileNOV(String file)
    {
        if (fileNOV.containsKey(file))
            return fileNOV.get(file);
        else
            return -1;
    }

    public void setFileNOV(String file, int nov)
    {
        if (file != null && nov >= 0)
            fileNOV.put(file, nov);
    }

    public int getTypeNOV(String type)
    {
        if (typeNOV.containsKey(type))
            return typeNOV.get(type);
        else
            return -1;
    }

    public void setTypeNOV(String type, int nov)
    {
        if (type != null && nov >= 0)
            typeNOV.put(type, nov);
    }

    public int getTotalNOV()
    {
        return totalNOV;
    }

    public void setTotalNOV(int nov)
    {
        if (nov >= 0)
            totalNOV = nov;
        else
            totalNOV = 0;
    }

    public int getFileNOM(String file)
    {
        if (fileNOM.containsKey(file))
            return fileNOM.get(file);
        else
            return 0;
    }

    public void setFileNOM(String file, int nom)
    {
        if (file != null && nom >= 0)
            fileNOM.put(file, nom);
    }

    public int getTypeNOM(String type)
    {
        if (typeNOM.containsKey(type))
            return typeNOM.get(type);
        else
            return 0;
    }

    public void setTypeNOM(String type, int nom)
    {
        if (type != null && nom >= 0)
            typeNOM.put(type, nom);
    }

    public int getTotalNOM()
    {
        return totalNOM;
    }

    public void setTotalNOM(int nom)
    {
        if (nom >= 0)
            totalNOM = nom;
        else
            totalNOM = 0;
    }
}
