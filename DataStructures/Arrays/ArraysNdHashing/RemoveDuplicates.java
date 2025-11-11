package Arrays.ArraysNdHashing;
public class RemoveDuplicates{
    public static int[] removeDuplicates(int[] arr){
        if(arr.length == 0) return new int[0];
        int uniqueCount = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                uniqueCount++;
            }
        }
        int[] result = new int[uniqueCount];
        result[0] = arr[0];
        int index = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                result[index++] = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,5,5,6,7,7,8};
        int [] result = removeDuplicates(arr);
        for(int num: result){
            System.out.print(num + " ");
        }
    }
}