import java.util.Scanner;
import java.util.*;

class Solution{
    public static int lengthOfLongestSubString(String s){
        Set<Character> set = new HashSet<Character>();
        int n = s.length(),ans=0,i=0,j=0;
        while(i<n && j<n){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }else{
                set.add(s.charAt(j++));
                ans = Math.max(ans,set.size());
            }
        }
        return ans;
    }
}


public class Main{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        String s = stdin.next();
        int result = Solution.lengthOfLongestSubString(s);
        System.out.println(result);
    }
}
