import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] inputArray = new int[] {3,2,4};
        System.out.println(Arrays.toString(twoSum(inputArray, 10)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2]; //Tao 1 empty int array co size la 2
        int p2, p1; //2 pointer int p2,p1
        for (p1 = 0; p1 < nums.length; p1++) { 
            int numberToFind = target - nums[p1];
            for (p2 = p1 + 1; p2 < nums.length; p2++) {
                if (nums[p2] == numberToFind) {
                    ans[0] = p1;
                    ans[1] = p2;
                    return ans;
                }
               ans = null;
            }
        }
        return ans;
    }
}
