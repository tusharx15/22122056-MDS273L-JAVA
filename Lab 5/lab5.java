import java.util.*;
import javax.swing.text.PlainDocument;

public class lab5 {
    
    static String message = "ABCDEFGHIJKLMNOPQRSTUVXYZ"; // static is used so that the variables defined
    static String cypher =  "XYZABCDEFGHIJKLMNOPQRSTUVW"; // can be accessed further in the code.

    private static String encrypt(String plainText) { // function for encrypring a message
        // what happens here is that the function runs and checks the conditions defined below
        // then if the encryption is to be done, the message variable is taken into consideration
        // and the alphabets are then matched accordingly to the cypher variable as defined avove.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (Character.isLetter(c)) {
                int index = message.indexOf(c);
                char encryptedChar = cypher.charAt(index);
                result.append(encryptedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    
    private static String decrypt(String cypherText) { // function for decrypting a message
        // what happens here is that the function runs and checks the conditions defined below
        // then if the decryption is to be done, the cypher variable is taken into consideration
        // and the alphabets are then matched accordingly to the message variable as defined avove.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cypherText.length(); i++) {
            char c = cypherText.charAt(i);
            if (Character.isLetter(c)) {
                int index = cypher.indexOf(c);
                char decryptedChar = message.charAt(index);
                result.append(decryptedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    
}
    public static void main(String[] args){ // this is the main method
    Scanner scan = new Scanner(System.in); // for taking user inputs
    System.out.println("Welcome To The Programme! ");
    boolean running = true;
    while(running){ // while loop to make the program run until the user wishes to exit
        System.out.println("Please enter your choice: ");
        System.out.println("1. Encrypt A Message! ");
        System.out.println("2. Decrpyt A Message! ");
        System.out.println("3. Exit! ");
        int choice = Integer.parseInt(scan.nextLine());
        switch(choice){
            case 1: // if the user wishes to encrypt a message
                System.out.println("---------------------------");
                System.out.println("Please enter the messsage you wish to encrypt: ");
                System.out.println("---------------------------");
                String plainText = scan.nextLine().toUpperCase();
                String encryptedText = encrypt(plainText);
                System.out.println("---------------------------");
                System.out.println("Encrypted message: " + encryptedText);
                System.out.println("---------------------------");
                break;
             case 2: // if the user wishes to decrypt a message
                System.out.println("-----------------------------------");
                System.out.println("Please enter the message you wish to decrpyt: ");
                System.out.println("--------------------------------------");
                String cypherText = scan.nextLine().toUpperCase();
                String decryptedText = decrypt(cypherText);
                System.out.println("---------------------------");
                System.out.println("Decrypted message: " + decryptedText);
                System.out.println("---------------------------");
                break;
            case 3: // if the user wishes to exit the program
                System.out.println("------------------------------");
                System.out.println("SUCCESSFULLY EXIT THE PROGRAMME! ");
                System.out.println("------------------------------");
                running = false;
                break;
            default: // if an invalid choice of options is made by the user
                System.out.println("____OOPS!!!____");
                System.out.println("Invalid choice! Please try again.");
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        }
    }
    }
    

}