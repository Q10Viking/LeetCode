//Remove-Duplicates-from-Sorted-Array.java
//http://www.lisite.top/2018/02/21/leetcode-26-remove-duplicates-from-sorted-array-leetcode-java/106.html
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int slowPoint = 0;
        for(int quickPoint=1;quickPoint<nums.length;quickPoint++){
            if(nums[quickPoint] != nums[slowPoint])
                nums[++slowPoint]=nums[quickPoint];
        }
        return slowPoint+1;
    }
}

public class Main1{
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,2,3,4};
        Solution s = new Solution();
        int length = s.removeDuplicates(nums);
        for(int i=0;i<length;i++)
            System.out.print(nums[i]+" ");

    }
}

/*

java Main1
0 1 2 3 4

*/
