import java.util.HashSet;

public class LongestNonRepeatingSubString {
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println(Solution.length(str));
    }
    
}
class Solution
{
    public static int length(String s)
    {
        HashSet<Character> set=new HashSet<>();
        int left=0, maxLength=0;
        for(int right=0;right<s.length();right++)
        {
            while (set.contains(s.charAt(right))) {
                System.out.println(s.charAt(right));
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength=Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}