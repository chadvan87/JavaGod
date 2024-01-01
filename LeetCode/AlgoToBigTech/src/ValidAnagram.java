import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        isAnagram("anagram","nagaram");
        System.out.println(isAnagram("anagram","nagaram"));
    }


    public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Check if lengths are equal
        if (sArray.length != tArray.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare the sorted arrays
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }

        return true;
    }
}


