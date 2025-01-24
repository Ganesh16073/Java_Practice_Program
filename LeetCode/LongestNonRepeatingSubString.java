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
        int i=0, maxLength=0;
        for(int j=0;j<s.length();j++)
        {
            while (set.contains(s.charAt(j))) {
                System.out.println(s.charAt(j));
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            maxLength=Math.max(maxLength, j-i+1);
        }

        return maxLength;
    }
}