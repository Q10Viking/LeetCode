import java.util.Scanner;
import java.util.*;

class Solution{
    public static int lengthOfLongestSubString(String s){
        Map<Character,Integer> map = new HashMap();
        int n = s.length(),ans=0;
        for(int i=0,j=0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            ans = Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }
}


public class Main2{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        String s = stdin.next();
        int result = Solution.lengthOfLongestSubString(s);
        System.out.println(result);
    }
}
