public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) { //Solution 1: Using String Builder
        // Remove non-alphanumeric characters and spaces
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); //Cach xoa het space va khoang trong

        // Use StringBuilder to reverse the cleaned string
        StringBuilder reversedString = new StringBuilder(cleanedString).reverse();

        // Compare the cleaned string with its reversed version
        return cleanedString.contentEquals(reversedString);
    }

    public static boolean isPalindrome2(String s) { //Solution2: 2 pointers at the end and beginning
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); //Cach xoa het space va khoang trong

        int n = cleanedString.length();
        // Compare characters from beginning and end
        for (int i = 0; i < n/2; i++) //Go half of the String
            if (cleanedString.charAt(i) != cleanedString.charAt(n-i-1))
                return false;
        return true;
    }
}
