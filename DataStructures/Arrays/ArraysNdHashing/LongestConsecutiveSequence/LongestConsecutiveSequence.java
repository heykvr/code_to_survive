package Arrays.ArraysNdHashing.LongestConsecutiveSequence;
import java.util.*;
public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int [] nums){
        int max =0;
        int Long =0;
        HashSet<Integer> hs = new HashSet<>();
        for(int h : nums){
            hs.add(h);
        }
        for(int i : hs){
            if(!hs.contains(i-1)){
                int cur = i;
                Long = 1;
                while(hs.contains(cur+1)){
                    Long+=1;
                    cur+=1;
                }
            }
            max = Math.max(max,Long);
        }
        return max;
    }
    public static void main(String [] args){
        int [] nums = {100,4,200,1,3,2};
        int ans = longestConsecutiveSequence(nums);
        System.out.println(ans);
    }
}