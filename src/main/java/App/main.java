package App;

import backend.CeaserLogic;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter message to be encrypted:");
        String word=scan.nextLine();
        System.out.println("Please enter shift key");
        int shiftKey= scan.nextInt();
        CeaserLogic encryption= new CeaserLogic(word,shiftKey);//backend class
        String encrypted_message= encryption.getEncoded();//encryption
        String decrypted_message= encryption.getDecord();//decryption
        printMessage(encrypted_message,decrypted_message);


    }

    private static void printMessage(String encrypted_message, String decrypted_message) {
        System.out.println("Encrypted message: " + encrypted_message);
        System.out.println("Decrypted message: "+ decrypted_message);
    }

}
