package Arrays.ArraysNdHashing;
import java.util.*;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int wanted_num = target - nums[i];
            if(!hm.containsKey(wanted_num)){
                hm.put(nums[i],i);
            }else{
                res[0]=i;
                res[1]=hm.get(wanted_num);
                break;
            }
        }
        return res;  
    }
}
