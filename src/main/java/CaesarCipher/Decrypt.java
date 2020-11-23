
package CaesarCipher;
public class Decrypt {
    public static StringBuffer decryptClass(String decryptMessage, int decryptShift) {
        StringBuffer result = new StringBuffer();
        if (decryptShift > 26) {
            decryptShift = decryptShift % 26;
        } else if (decryptShift < 0) {
            decryptShift = (decryptShift % 26) + 26;
        }
        for (int i = 0; i < decryptMessage.length(); i++) {
            if (Character.isUpperCase(decryptMessage.charAt(i))) {
                char character = (char) (((int) decryptMessage.charAt(i) -
                        decryptShift - 65) % 26 + 65);
                result.append(character);
            } else {
                char character = (char) (((int) decryptMessage.charAt(i) -
                        decryptShift - 97) % 26 + 97);
                result.append(character);
            }
        }
        return result;
    }

}