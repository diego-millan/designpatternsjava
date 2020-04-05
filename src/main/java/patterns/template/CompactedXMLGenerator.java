package patterns.template;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompactedXMLGenerator extends FileGenerator {

    @Override
    protected byte[] proccess(byte[] bytes) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);

        zipOutputStream.putNextEntry(new ZipEntry("internal"));
        zipOutputStream.write(bytes);
        zipOutputStream.closeEntry();
        zipOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    protected String generateContent(Map<String, Object> properties) {

        StringBuilder propertiesFileBuilder = new StringBuilder();

        propertiesFileBuilder.append("<properties>");

        for (String property : properties.keySet()) {
            propertiesFileBuilder.append("<" + property + ">" + properties.get(property) + "</" + property + ">");
        }

        propertiesFileBuilder.append("</properties>");

        return propertiesFileBuilder.toString();

    }
}
