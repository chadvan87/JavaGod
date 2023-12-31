import java.util.HashSet;
import java.util.Set;

public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> check = new HashSet<>(); //Step 1: Add to Hash Set
    for (int i = 0; i < nums.length; i++){
        check.add(nums[i]); //Hash set prevent the duplicate value
    }

    if(check.size() < nums.length){
        return true; //Compare the length of the hash set and the array nums
    }
    return false;

}

public void main() {
    int[] nums = {1,2,3,4,1};
    System.out.println(containsDuplicate(nums));
}