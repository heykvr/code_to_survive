package Arrays.ArraysNdHashing.ProductOfArrayExceptItself;
public class ProductOfArrayExceptItself {
    public static int [] productOfArrayExceptItself(int[] nums){
        int n = nums.length;
        int [] pref = new int [n];
        int [] suff = new int [n];
        pref[0] = 1; suff[n-1] =1;
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1] * nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suff[i] = suff[i+1] * nums[i+1];
        }
        for(int i=0; i<nums.length;i++){
            nums[i] = pref[i] * suff[i];
        }
        return nums;
    }

    public static void main(String [] args){
        int [] nums = {1,2,3,4};
        int [] ans = productOfArrayExceptItself(nums);
        for(int i = 0;i < ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
