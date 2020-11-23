package CaesarCipher;

public class Encrypt {
    public static StringBuffer encryptionClass(String text, int shift) {
        StringBuffer result = new StringBuffer();

        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char character = (char) (((int) text.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(character);
            } else {
                char character = (char) (((int) text.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(character);
            }

        }
        return result;
    }

}