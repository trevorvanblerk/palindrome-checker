import java.util.Scanner;
public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
		    System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
		    String word = input.next();

		
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
