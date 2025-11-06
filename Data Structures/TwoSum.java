import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement),i};
            } else {
                hm.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target =9;
        int[] result = twoSum(nums,target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    } 
}
