package Arrays.ArraysNdHashing.TopKFrequentElements;
import java.util.*;
public class TopKFrequentElements {

    public static int [] topKFrequentElements(int [] nums, int k){
        int n = nums.length;
        int [] res = new int[k];
        // frequency map
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums) hm.put(i,hm.getOrDefault(i,0)+1);
        // frequency list of length 
        @SuppressWarnings("unchecked")
        List<Integer>[] freq = new List[n + 1];
        for(int item : hm.keySet()){
            // get frequency of item 
            int cur = hm.get(item);
            if(freq[cur]==null){
                freq[cur] = new ArrayList<>();
            }
            // add item to that frequency bucket
            freq[cur].add(item);
        }

        // iterate from last to first until you get k elemnets
        int j=0;
        for(int i= freq.length-1;i>=0 && j < k ;i--){
            if(freq[i] != null){
                for(int z : freq[i]){
                    res[j++] = z;
                }
            }
        }
        return res;
    }



    public static void main(String [] args){
        int [] nums = {1,1,1,2,2,3};
        int k =2;
        int [] ans = topKFrequentElements(nums,k);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}