public class strongPassword {

    public static int strongPasswordChecker(String password) {
        int n = password.length();
        boolean hasLower = false, hasUpper = false, hasDigit = false;

        // Check character types
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Calculate missing character types
        int missingTypes = 0;
        if (!hasLower) {
            missingTypes++;
        }
        if (!hasUpper) {
            missingTypes++;
        }
        if (!hasDigit) {
            missingTypes++;
        }

        // Calculate required length adjustments
        int addLength = Math.max(0, 6 - n);
        int overLength = Math.max(n - 20, 0);

        // Calculate changes needed to fix repeating sequences
        int changesNeeded = 0;
        int repeatCount = 0;
        for (int i = 2; i < n; i++) {
            if (password.charAt(i) == password.charAt(i - 1) && password.charAt(i) == password.charAt(i - 2)) {
                repeatCount++;
                i++; // Skip to the next character after the sequence
            }
        }
        changesNeeded = Math.max(0, repeatCount - overLength);

        // Calculate the minimum steps required
        int minChanges = Math.max(addLength, Math.max(missingTypes, changesNeeded));
        return minChanges;
    }

    public static void main(String[] args) {
        String password1 = "a";
        String password2 = "aA1";
        String password3 = "1337C0d3";

        System.out.println(strongPasswordChecker(password1)); // Output: 5
        System.out.println(strongPasswordChecker(password2)); // Output: 3
        System.out.println(strongPasswordChecker(password3)); // Output: 0
    }

}
