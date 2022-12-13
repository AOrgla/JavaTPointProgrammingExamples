public class ReverseString {

    public static String reverseString(String stringToReverse) {
        String reversedString = "";
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedString = reversedString + stringToReverse.charAt(i);
        }
        return reversedString;
    }

}
