package Arrays.Two_Pointers.ContainerWithMostWater;
public class ContainerWithMostWater {
    public static int containerWithMostWater(int[] heights){
        int i = 0;
        int j = heights.length -1 ;
        int max = 0;
        while(i<j){
            int width = j-i;
            int min_height = Math.min(heights[i],heights[j]);
            max = Math.max(width*min_height,max);
            if(heights[i]<heights[j]) i++;
            else if (heights[i]>heights[j]) j--;
            else {
                i++;
                j--;
            }
        }
        return max;
    }
    public static void main(String [] args){
        int [] height = {1,8,6,2,5,4,8,3,7};
        int ans = containerWithMostWater(height);
        System.out.println(ans);
    }
}