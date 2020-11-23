package CaesarCipher;
import java.util.Scanner;

import static CaesarCipher.Decrypt.decryptClass;
import static CaesarCipher.Encrypt.encryptionClass;

public class App {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to the simplest encryption system");
        System.out.println("Let's get started \n");

        System.out.println(">| Enter Message you want encrypted");
        String text = myScanner.nextLine();

        System.out.println(">| Enter Key to encrypt");
        int shift = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println(">| Encrypted text is : " + encryptionClass(text, shift));

        System.out.println("<<<<< >>>>>");

        System.out.println(">| Enter encrypted message");
        String decryptMessage = myScanner.nextLine();

        System.out.println(">| Enter key you used to encrypt");
        int decryptShift = myScanner.nextInt();
        myScanner.nextLine();


        System.out.println("Decrypted text is : \n" + decryptClass(decryptMessage, decryptShift));
        System.out.println("Thank you, please come back again");


    }

}