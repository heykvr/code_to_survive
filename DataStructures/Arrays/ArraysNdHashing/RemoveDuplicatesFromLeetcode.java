package Arrays.ArraysNdHashing;
public class RemoveDuplicatesFromLeetcode {

    public static int removeDuplicates(int[] nums){

        if(nums.length ==0 ) return 0;
        int index = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i]){
                index++;
                nums[index] = nums[i];
            }

        }

        return index + 1;






    }
    public static void  main(String[] args){
        int [] arr = {1,1,2,3,4,4,5,6};

        // 1,1,2,3,4,4,5,6 ; index =0 i=1 -> index = 0 
        // 1,1,2,3,4,4,5,6 ; index =0 i=2 -> index = 1
        // 1,2,2,3,4,4,5,6 ; index =1 i=3 -> index = 2
        // 1,2,3,3,4,4,5,6 ; index =2 i=4 -> index = 3
        // 1,2,3,4,4,4,5,6 ; index =3 i=5 -> index = 3
        // 1,2,3,4,4,4,5,6 ; index =3 i=6 -> index = 4
        // 1,2,3,4,5,4,5,6 ; index =4 i=7 -> index = 5
        // 1,2,3,4,5,6,5,6 ;

        int result = removeDuplicates(arr);
        System.out.println(result);
    }
    
}
