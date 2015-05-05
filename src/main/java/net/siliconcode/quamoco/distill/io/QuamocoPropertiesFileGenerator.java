/**
 * 
 */
package net.siliconcode.quamoco.distill.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import net.siliconcode.sonar.quamoco.QuamocoSettings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * QuamocoPropertiesFileGenerator -
 * 
 * @author Isaac Griffith
 */
public class QuamocoPropertiesFileGenerator {

    private static final Logger LOG = LoggerFactory.getLogger(QuamocoSettings.class);
    private Path                file;

    public QuamocoPropertiesFileGenerator(String file)
    {

    }

    public void write()
    {

    }

    public void delete()
    {
        try
        {
            Files.deleteIfExists(file);
        }
        catch (IOException e)
        {
            LOG.warn("Could not delete quamoco properties file, %s, due to lack of permissions or another error.",
                    file.toString());
        }
    }
}
