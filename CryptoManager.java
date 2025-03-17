/*
 * Class: CMSC203 31843
 * Instructor: Prof Ashique Tanveer
 * Description: This class contains methods for encryption and decryption and checking if the plainText are in range
 * Due: 03/19/25
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently.
 *  I have not copied the code from a student or any source.
 *  I have not given my code to any student.
 *  Print your Name here: Bervelyn Tetteh
 */

package cryptomanager;

public class CryptoManager {
    private static final char LOWER_BOUND = ' ';
    private static final char UPPER_BOUND = '_';
    private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

    /**
     * Checks if a string is within the allowable bounds of ASCII codes.
     * @param plainText a string to be encrypted.
     * @return true if all characters are within bounds, false otherwise.
     */
    public static boolean isStringInBounds(String plainText) {
        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) < LOWER_BOUND || plainText.charAt(i) > UPPER_BOUND) {
                return false;
            }
        }
        return true;
    }

    /**
     * Encrypts a string using Caesar Cipher.
     * @param plainText a string to be encrypted.
     * @param key an integer that specifies the offset.
     * @return the encrypted string.
     */
    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) {
            return "Text is not in bounds.";
        }

        char[] textArray = new char[plainText.length()];
        for (int i = 0; i < plainText.length(); i++) {
            textArray[i] = (char) (plainText.charAt(i) + key);

            // Wrap around if out of bounds
            while (textArray[i] > UPPER_BOUND) {
                textArray[i] = (char) (textArray[i] - RANGE);
            }
            while (textArray[i] < LOWER_BOUND) {
                textArray[i] = (char) (textArray[i] + RANGE);
            }
        }
        return String.valueOf(textArray);
    }

    /**
     * Decrypts a string using Caesar Cipher.
     * @param encryptedText the encrypted string.
     * @param key an integer that specifies the offset.
     * @return the decrypted string.
     */
    public static String caesarDecryption(String encryptedText, int key) {
        if (!isStringInBounds(encryptedText)) {
            return "Text is not in bounds.";
        }

        char[] textArray = new char[encryptedText.length()];
        for (int i = 0; i < encryptedText.length(); i++) {
            textArray[i] = (char) (encryptedText.charAt(i) - key);

            // Wrap around if out of bounds
            while (textArray[i] > UPPER_BOUND) {
                textArray[i] = (char) (textArray[i] - RANGE);
            }
            while (textArray[i] < LOWER_BOUND) {
                textArray[i] = (char) (textArray[i] + RANGE);
            }
        }
        return String.valueOf(textArray);
    }

    /**
     * Encrypts a string using Bellaso Cipher.
     * @param plainText a string to be encrypted.
     * @param bellasoStr a string that specifies the key.
     * @return the encrypted string.
     */
    public static String bellasoEncryption(String plainText, String bellasoStr) {
        if (!isStringInBounds(plainText)) {
            return "Text is not in bounds.";
        }

        char[] textArray = new char[plainText.length()];
        for (int i = 0; i < plainText.length(); i++) {
            // Adjust character using Bellaso key
            textArray[i] = (char) (plainText.charAt(i) + bellasoStr.charAt(i % bellasoStr.length()));

            // Wrap around if out of bounds
            while (textArray[i] > UPPER_BOUND) {
                textArray[i] = (char) (textArray[i] - RANGE);
            }
            while (textArray[i] < LOWER_BOUND) {
                textArray[i] = (char) (textArray[i] + RANGE);
            }
        }
        return String.valueOf(textArray);
    }

    /**
     * Decrypts a string using Bellaso Cipher.
     * @param encryptedText the encrypted string.
     * @param bellasoStr the key used for encryption.
     * @return the decrypted string.
     */
    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
        if (!isStringInBounds(encryptedText)) {
            return "Text is not in bounds.";
        }

        char[] textArray = new char[encryptedText.length()];
        for (int i = 0; i < encryptedText.length(); i++) {
            // Adjust character using Bellaso key
            textArray[i] = (char) (encryptedText.charAt(i) - bellasoStr.charAt(i % bellasoStr.length()));

            // Wrap around if out of bounds
            while (textArray[i] > UPPER_BOUND) {
                textArray[i] = (char) (textArray[i] - RANGE);
            }
            while (textArray[i] < LOWER_BOUND) {
                textArray[i] = (char) (textArray[i] + RANGE);
            }
        }
        return String.valueOf(textArray);
    }
}
