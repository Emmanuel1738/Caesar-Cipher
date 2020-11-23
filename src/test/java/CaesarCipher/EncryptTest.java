package CaesarCipher;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void testEncryptionClass(){
        Encrypt classUnderTest = new Encrypt();
        assertNotNull("app should convert Greetings to Juhhwlqjv when shift is 3", classUnderTest.encryptionClass("Greetings", 3));

    }
}