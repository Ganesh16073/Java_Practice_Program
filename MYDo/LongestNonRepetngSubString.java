import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class LongestNonRepetngSubString {
    public static void main(String[] args) {
        String str="abcabcbba";
        int ind[]=Solution.find(str);
        for(int i=ind[0];i<=ind[1];i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}
class Solution
{
    public static int[] find(String str)
    {
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int maxLength=0;
        int start=0;
        for(int j=0;j<str.length();j++)
        {
            while(set.contains(str.charAt(j)))
            {
                set.remove(str.charAt(i));
                i++;
            }
            set.add(str.charAt(j));
            maxLength=Math.max(maxLength, j-i+1);
        }

        return new int[]{start,start+maxLength};

    } 
}
