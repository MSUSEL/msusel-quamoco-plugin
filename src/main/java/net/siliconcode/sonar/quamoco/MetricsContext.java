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

    private final Map<String, Integer> fileLoC;
    private final Map<String, Integer> typeLoC;
    private final Map<String, Integer> methodLoC;
    private final Map<String, Integer> fileNoF;
    private final Map<String, Integer> typeNoF;
    private final Map<String, Integer> fileNOT;
    private final Map<String, Integer> fileNOC;
    private final Map<String, Integer> fileNOS;
    private final Map<String, Integer> typeNOS;
    private final Map<String, Integer> methodNOS;
    private final Map<String, Integer> fileNOV;
    private final Map<String, Integer> typeNOV;
    private final Map<String, Integer> fileNOM;
    private final Map<String, Integer> typeNOM;
    private int                        totalLOC;
    private int                        totalNOF;
    private int                        totalNOV;
    private int                        totalNOM;
    private int                        totalNOC;
    private int                        totalNOT;
    private int                        totalNOS;

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

    public int getFileLOC(final String fileName)
    {
        if (fileName != null && fileLoC.containsKey(fileName))
        {
            return fileLoC.get(fileName);
        }
        else
        {
            return -1;
        }
    }

    public int getFileNOC(final String file)
    {
        if (file != null && fileNOC.containsKey(file))
        {
            return fileNOC.get(file);
        }
        else
        {
            return -1;
        }
    }

    public int getFileNOF(final String fileName)
    {
        if (fileName != null && fileNoF.containsKey(fileName))
        {
            return fileNoF.get(fileName);
        }
        else
        {
            return -1;
        }
    }

    public int getFileNOM(final String file)
    {
        if (file != null && fileNOM.containsKey(file))
        {
            return fileNOM.get(file);
        }
        else
        {
            return -1;
        }
    }

    public int getFileNOS(final String file)
    {
        if (file != null && fileNOS.containsKey(file))
        {
            return fileNOS.get(file);
        }
        else
        {
            return -1;
        }
    }

    public int getFileNOT(final String file)
    {
        if (file != null && fileNOT.containsKey(file))
        {
            return fileNOT.get(file);
        }
        else
        {
            return -1;
        }
    }

    public int getFileNOV(final String file)
    {
        if (file != null && fileNOV.containsKey(file))
        {
            return fileNOV.get(file);
        }
        else
        {
            return -1;
        }
    }

    public int getMethodLOC(final String method)
    {
        if (method != null && methodLoC.containsKey(method))
        {
            return methodLoC.get(method);
        }
        else
        {
            return -1;
        }
    }

    public int getMethodNOS(final String method)
    {
        if (method != null && methodNOS.containsKey(method))
        {
            return methodNOS.get(method);
        }
        else
        {
            return -1;
        }
    }

    public int getTotalLOC()
    {
        return totalLOC;
    }

    public int getTotalNOC()
    {
        return totalNOC;
    }

    public int getTotalNOF()
    {
        return totalNOF;
    }

    public int getTotalNOM()
    {
        return totalNOM;
    }

    public int getTotalNOS()
    {
        return totalNOS;
    }

    public int getTotalNOT()
    {
        return totalNOT;
    }

    public int getTotalNOV()
    {
        return totalNOV;
    }

    public int getTypeLOC(final String type)
    {
        if (type != null && typeLoC.containsKey(type))
        {
            return typeLoC.get(type);
        }
        else
        {
            return -1;
        }
    }

    public int getTypeNOF(final String type)
    {
        if (type != null && typeNoF.containsKey(type))
        {
            return typeNoF.get(type);
        }
        else
        {
            return -1;
        }
    }

    public int getTypeNOM(final String type)
    {
        if (type != null && typeNOM.containsKey(type))
        {
            return typeNOM.get(type);
        }
        else
        {
            return -1;
        }
    }

    public int getTypeNOS(final String type)
    {
        if (type != null && typeNOS.containsKey(type))
        {
            return typeNOS.get(type);
        }
        else
        {
            return -1;
        }
    }

    public int getTypeNOV(final String type)
    {
        if (type != null && typeNOV.containsKey(type))
        {
            return typeNOV.get(type);
        }
        else
        {
            return -1;
        }
    }

    public void setFileLOC(final String fileName, final int loc)
    {
        if (fileName != null && loc >= 0)
        {
            fileLoC.put(fileName, loc);
        }
    }

    public void setFileNOC(final String file, final int noc)
    {
        if (file != null && noc >= 0)
        {
            fileNOC.put(file, noc);
        }
    }

    public void setFileNOF(final String fileName, final int nof)
    {
        if (fileName != null && nof >= 0)
        {
            fileNoF.put(fileName, nof);
        }
    }

    public void setFileNOM(final String file, final int nom)
    {
        if (file != null && nom >= 0)
        {
            fileNOM.put(file, nom);
        }
    }

    public void setFileNOS(final String file, final int nos)
    {
        if (file != null && nos >= 0)
        {
            fileNOS.put(file, nos);
        }
    }

    public void setFileNOT(final String file, final int not)
    {
        if (file != null && not >= 0)
        {
            fileNOT.put(file, not);
        }
    }

    public void setFileNOV(final String file, final int nov)
    {
        if (file != null && nov >= 0)
        {
            fileNOV.put(file, nov);
        }
    }

    public void setMethodLOC(final String method, final int loc)
    {
        if (method != null && loc >= 0)
        {
            methodLoC.put(method, loc);
        }
    }

    public void setMethodNOS(final String method, final int nos)
    {
        if (method != null && nos >= 0)
        {
            methodNOS.put(method, nos);
        }
    }

    public void setTotalLOC(final int loc)
    {
        if (loc >= 0)
        {
            totalLOC = loc;
        }
        else
        {
            totalLOC = 0;
        }
    }

    public void setTotalNOC(final int noc)
    {
        if (noc >= 0)
        {
            totalNOC = noc;
        }
        else
        {
            totalNOC = 0;
        }
    }

    public void setTotalNOF(final int nof)
    {
        if (nof >= 0)
        {
            totalNOF = nof;
        }
        else
        {
            totalNOF = 0;
        }
    }

    public void setTotalNOM(final int nom)
    {
        if (nom >= 0)
        {
            totalNOM = nom;
        }
        else
        {
            totalNOM = 0;
        }
    }

    public void setTotalNOS(final int nos)
    {
        if (nos >= 0)
        {
            totalNOS = nos;
        }
        else
        {
            totalNOS = 0;
        }
    }

    public void setTotalNOT(final int not)
    {
        if (not >= 0)
        {
            totalNOT = not;
        }
        else
        {
            totalNOT = 0;
        }
    }

    public void setTotalNOV(final int nov)
    {
        if (nov >= 0)
        {
            totalNOV = nov;
        }
        else
        {
            totalNOV = 0;
        }
    }

    public void setTypeLOC(final String type, final int loc)
    {
        if (type != null && loc >= 0)
        {
            typeLoC.put(type, loc);
        }
    }

    public void setTypeNOF(final String type, final int nof)
    {
        if (type != null && nof >= 0)
        {
            typeNoF.put(type, nof);
        }
    }

    public void setTypeNOM(final String type, final int nom)
    {
        if (type != null && nom >= 0)
        {
            typeNOM.put(type, nom);
        }
    }

    public void setTypeNOS(final String type, final int nos)
    {
        if (type != null && nos >= 0)
        {
            typeNOS.put(type, nos);
        }
    }

    public void setTypeNOV(final String type, final int nov)
    {
        if (type != null && nov >= 0)
        {
            typeNOV.put(type, nov);
        }
    }
}
