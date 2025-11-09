package Arrays.Two_Pointers.ThreeSum;
import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> Threesum(int [] arr){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0) return res; 
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j =i+1;
            int k = arr.length-1;
            while(j<k){
                int cur_sum = arr[i] + arr[j] + arr[k];
                if(cur_sum == 0){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(arr[i]);
                    ls.add(arr[j]);
                    ls.add(arr[k]);
                    res.add(ls);
                    j++;
                    k--;
                    while(j<k && arr[j] == arr[j+1] ) j++;
                    while(j<k && arr[k] == arr[k-1] ) k--;
                }else if(cur_sum < 0) {
                    j++;
                }else{
                    k--;
                }
            }
        }
        return res;
    }
    public static void main(String [] args){
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ls = Threesum(arr);
        System.out.println(ls);
    }
}