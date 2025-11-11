package Arrays.ArraysNdHashing.TopKFrequentElementsUsingMinHeap;
import java.util.*;
public class TopKFrequentElementsUsingMinHeap {
    public static int [] topKFrequentElementsUsingMinHeap(int [] nums, int k){
        int [] res = new int [k];
        // frequencyMap
        HashMap<Integer,Integer> frequentMap = new HashMap<>();
        for(int item : nums){
            frequentMap.put(item,frequentMap.getOrDefault(item,0)+1);
        }
        // start a PriorityQueue which holds map entries
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());
        // add map entries to minheap of k size
        for(Map.Entry<Integer,Integer> item : frequentMap.entrySet()){
            minHeap.add(item);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        // get most k frequesnt elements from minheap
        int ind =0;
        for(Map.Entry<Integer,Integer> item : minHeap){
            int key = item.getKey();
            res[ind++] = key;
        }
        return res;
    }
   public static void main(String [] args){
        int [] nums = {1,1,2,2,3};
        int k =2;
        int [] ans = topKFrequentElementsUsingMinHeap(nums,k);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    } 
}