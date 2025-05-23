package ciphertext;
import java.util.Scanner;
public class AffineCipher{
    // Driver code
    public static void main(String[]Args){
        // Input block
        Scanner input_paraphrase = new Scanner(System.in);
        System.out.println("Enter your plaintext: ");
        String input_string = input_paraphrase.nextLine();
        input_paraphrase.close();
        String plaintext = input_string;
        
        // Output block
        String ciphertext = encrypt(plaintext);
        String decrypted = decrypt(ciphertext);
        System.out.println("Ciphertext: " + ciphertext);
        System.out.println("Decrypted text: " + decrypted);

    }
    
    //Function for encryption block
    public static String encrypt(String plaintext) {
        int k1 = 7; // Multiplicative key
        int k2 = 2; // Additive key
        char[] ciphertext = new char[plaintext.length()];
        // Compute block for encryption of key
        for (int i = 0; i < plaintext.length(); i++) {
          char character_check = plaintext.charAt(i); // Use a temprary variable (character_check) for identification of character type
          if (Character.isUpperCase(character_check)){
            int k3 = plaintext.charAt(i) - 'A'; // Use k3 variable to hold value of characters in integer
            int encrypted = (k3 * k1 +k2) % 26; //  Formula according to question "C = (P × k1 + k2) mod 26  k1 + k2) mod 26"
            ciphertext[i] = (char)(encrypted + 'A');

          } else {
            int k3 = plaintext.charAt(i) - 'a';
            int encrypted = (k3 * k1 +k2) % 26; //  Formula according to question "C = (P × k1 + k2) mod 26  k1 + k2) mod 26"
            ciphertext[i] = (char)(encrypted + 'a');
          }
        }
        return new String(ciphertext);
      }

    //Function for decryption block
    public static String decrypt(String ciphertext) {
        int k1 = 7; // Multiplicative key
        int k2 = 2; // Additive key
        char[] plaintext = new char[ciphertext.length()];
        // Compute block for k1_inverse
        int k1_inverse = 0; 
        for (int i = 0; i < 26; i++) {
          if ((k1 * i) % 26 == 1) {
            k1_inverse = i;
            break;
          }
        }
        // Compute block for decryption of key
        for (int i = 0; i < ciphertext.length(); i++) {
          char character_check = ciphertext.charAt(i); // Use a temprary variable (character_check) for identification of character type
          if (Character.isUpperCase(character_check)){
            int k3 = ciphertext.charAt(i) - 'A'; // Use k3 variable to hold value of characters in integer
            int decrypted = ((k3 - k2 + 26)* k1_inverse) % 26; //  Formula according to question "P = ((C − k2) × k1 k2) × k1 + k2) mod 26  k1− k2) × k1^-1) mod 26"
            plaintext[i] = (char)(decrypted + 'A');

          } else {
            int k3 = ciphertext.charAt(i) - 'a';
            int decrypted = ((k3 - k2 + 26)* k1_inverse) % 26; //  Formula according to question "P = ((C − k2) × k1 k2) × k1 + k2) mod 26  k1− k2) × k1^-1) mod 26"
            plaintext[i] = (char)(decrypted + 'a');
          }
        }
        return new String(plaintext);
      }
}