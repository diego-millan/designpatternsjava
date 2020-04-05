package patterns.template;

import java.io.IOException;
import java.util.Map;

public class EncryptedPropertiesGenerator extends FileGenerator {

    private int delay;

    public EncryptedPropertiesGenerator(int delay) {
        this.delay = delay;
    }

    @Override
    protected String generateContent(Map<String, Object> properties) {

        StringBuilder propFileBuilder = new StringBuilder();

        for (String prop : properties.keySet()) {
            propFileBuilder.append(prop + "=" + properties.get(prop) + "\n");
        }

        return propFileBuilder.toString();
    }

    @Override
    protected byte[] proccess(byte[] bytes) throws IOException {

        byte[] newBytes = new byte[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            newBytes[i] = (byte) ((bytes[i] + delay) % Byte.MAX_VALUE);
        }

        return newBytes;
    }

}
