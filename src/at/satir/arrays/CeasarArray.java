package at.satir.arrays;

public class CeasarArray {

    public static void main(String[] args) {
        String test = "Paul";
        int key = 2;


        String ciphertext = encrypt(test, key);
        System.out.println(test + " -> " + ciphertext);

        String decoded = decrypt(ciphertext, key);
        System.out.println(ciphertext + " -> " + decoded);
    }

    public static char shift(char letter, int shift){
        if(letter>='a' && letter <='z'){
            letter += shift;
            while(letter > 'z'){
                letter -= 26;
            }
        }
        return letter;
    }

    public static String encrypt(String test, int key) {
        String ciphertext = "";
        test = test.toLowerCase();

        for (int i = 0; i < test.length(); i++) {
            char next = test.charAt(i);
            ciphertext = ciphertext + shift(next, key);
        }
        return ciphertext;
    }


    public static String decrypt(String ciphertext, int key) {
        String decoded = "";
        ciphertext = ciphertext.toLowerCase();

        for (int i = 0; i < ciphertext.length(); i++) {
            char next = ciphertext.charAt(i);
            decoded = decoded + shift(next, 26 - key);
        }
        return decoded;
    }

}
