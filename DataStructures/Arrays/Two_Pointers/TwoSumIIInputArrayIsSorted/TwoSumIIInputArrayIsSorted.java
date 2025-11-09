package Arrays.Two_Pointers.TwoSumIIInputArrayIsSorted;
public class TwoSumIIInputArrayIsSorted {
    public static int [] TwoSumTwo(int [] arr , int target){
        int [] res = new int [2];
        int i=0;
        int j = arr.length -1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                res[0] = i+1;
                res[1] = j+1;
                break;
            }else if(sum > target ){
                j--;

            }else{
               i++;
            }
        }
        return res;
    }

    public static void main(String [] args){
        int [] arr = {2,7,11,15};
        int target = 9;
        int [] res = TwoSumTwo(arr,target);
        for(int i=0;i<res.length;i++) System.out.print(res[i]+" ");
    }
}
