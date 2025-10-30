package santhoshhhhhh;

import java.util.Scanner;

public class Stringoperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: String Concatenation
        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();
        String concatenated = str1 + " " + str2; // Concatenated two strings with a space

        // Example 2: String length
        System.out.println("\nLength of the first string: " + str1.length());
        System.out.println("Length of the second string: " + str2.length());

        // Example 3: String comparison
        System.out.print("\nEnter another string to compare with the first string: ");
        String str3 = scanner.nextLine();
        if (str1.equals(str3)) {
            System.out.println("The first string and third strings are equal.");
        } else {
            System.out.println("The first string and third strings are not equal.");
        }

        // Example 4: Convert to upper case and lower case
        System.out.println("\nUppercase version of the first string: " + str1.toUpperCase());
        System.out.println("Lowercase version of the second string: " + str2.toLowerCase());

        // Example 5: String Trim (removes leading and trailing spaces)
        System.out.println("\nTrimmed first string: " + str1.trim());

        // Example 6: Character at a specific position
        System.out.print("\nEnter the position to get the character (1-based index): ");
        int position = scanner.nextInt();
        if (position > 0 && position <= str1.length()) {
            char charAtPosition = str1.charAt(position - 1); // Convert to 0-based index
            System.out.println("Character at position " + position + " in the first string: " + charAtPosition);
        } else {
            System.out.println("Invalid position");
        }

        // Example 7: Substring of strings
        System.out.print("\nEnter starting position for substring (1-based index): ");
        int start = scanner.nextInt();
        System.out.print("Enter ending position for substring (1-based index): ");
        int end = scanner.nextInt();
        if (start > 0 && end <= str1.length() && start <= end) {
            String substring = str1.substring(start - 1, end); // Convert to 0-based index
            System.out.println("Substring of the first string: " + substring);
        } else {
            System.out.println("Invalid range for substring");
        }

        // Example 8: Check if a string contains a substring
        scanner.nextLine(); // Clear the buffer
        System.out.print("\nEnter a substring to check if it's contained in the first string: ");
        String subStr = scanner.nextLine();
        if (str1.contains(subStr)) {
            System.out.println("The first string contains the substring.");
        } else {
            System.out.println("The first string does not contain the substring.");
        }

        scanner.close();
    }
}
