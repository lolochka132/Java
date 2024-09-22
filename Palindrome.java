public class Palindrome {
    public static void main(String[] args) {
        for (String s : args) {
            if (isPalindrome(s)) {
                System.out.println(s + " - это палиндром.");
            } else {
                System.out.println(s + " - это не палиндром.");
            }
        }
    }

  public static String reverseString(String s) {
        String sNew = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sNew += s.charAt(i);
        }
        return sNew;
    }

    public static boolean isPalindrome(String s) {
        String reversed = reverseString(s);
        return s.equals(reversed);
    }
}