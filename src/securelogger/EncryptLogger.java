package securelogger;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

public class EncryptLogger implements SecureLogger {
    private static final String ALGORITHM = "AES";
    private static final String SECRET_KEY = "your_secret_key";

    @Override
    public void log(String message) {
        try {
            byte[] keyBytes = MessageDigest.getInstance("SHA-256").digest(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
            SecretKeySpec secretKey = new SecretKeySpec(keyBytes,ALGORITHM);

            Cipher cipher =  Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE,secretKey);

            var encryptedBytes =  cipher.doFinal(message.getBytes(StandardCharsets.UTF_8));
            var encryptedMessage = Base64.getEncoder().encodeToString(encryptedBytes);
            System.out.println("Encrypted message: "+encryptedMessage);

            FileWriter writer = new FileWriter("C:\\Users\\Ahmed\\Koleya\\5th Term\\Software Security\\Milestone 2\\test\\test.txt",true);
            writer.write(encryptedMessage + "\n");
            writer.close();

            System.out.println("Encrypted message written to " + "C:\\Users\\Ahmed\\Koleya\\5th Term\\Software Security\\Milestone 2\\test\\test.txt");
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
