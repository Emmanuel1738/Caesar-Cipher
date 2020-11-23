package CaesarCipher;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
public class DecryptTest {
    @Test
    public void testDecryptClass(){
        CaesarCipher.Decrypt classUnderTest = new CaesarCipher.Decrypt();
        assertNotNull("app should convert Juhhwlqjv to Greetings when shift is 3", classUnderTest.decryptClass("Juhhwlqjv", 3));
    }

}