package patterns.template;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class FileGenerator {

    public final void generateFile(String name, Map<String, Object> properties) throws IOException {

        String content = generateContent(properties);

        byte[] bytes = content.getBytes();
        bytes = proccess(bytes);

        FileOutputStream fileout = new FileOutputStream(name);
        fileout.write(bytes);
        fileout.close();
    }

    protected byte[] proccess(byte[] bytes)  throws IOException{
        return bytes;
    }

    protected abstract String generateContent(Map<String, Object> properties);

}
