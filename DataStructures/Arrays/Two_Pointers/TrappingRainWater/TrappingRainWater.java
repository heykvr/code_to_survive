package Arrays.Two_Pointers.TrappingRainWater;

public class TrappingRainWater {
    public static int trappingRainWater(int [] arr){
        int ans = 0;
        int i=0;
        int j=arr.length - 1 ;
        int lmax=arr[i];
        int rmax =arr[j];
        while(i<j){
            if(arr[i]<arr[j]){
                if(lmax> arr[i]){
                    ans+= lmax - arr[i];
                }else{
                    lmax = arr[i];
                }
                i++;
            }else{
                if(rmax > arr[j]){
                    ans += rmax - arr[j];
                }else{
                    rmax = arr[j];
                }
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int [] arr ={0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = trappingRainWater(arr);
        System.out.println(ans);
    }
}