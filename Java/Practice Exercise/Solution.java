import java.util.Stack;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder newString = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newString.append(c);
            }
        }

        Stack<Character> stack = new Stack<>();
        
        for (char c : newString.toString().toCharArray()) {
            stack.push(c);
        }

        for (char c : newString.toString().toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "A man, a plan, a canal: Panama";
        String ss = "A1@# 2man, a plan, a canal: Panam21a";
        String sss = "#$*@kdahsd#&#(#&)";

        System.out.println("Palindrome: " + solution.isPalindrome(s));
        System.out.println("Palindrome: " + solution.isPalindrome(ss));
        System.out.println("Palindrome: " + solution.isPalindrome(sss));
    }
}