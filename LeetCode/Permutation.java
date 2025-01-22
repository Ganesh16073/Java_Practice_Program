import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str="ganesh";
        ArrayList<String> list= new ArrayList<>();
        Solution.findPer("", str, list);
        System.out.println("The Permutations are");
        list.forEach(System.out::println);
        System.err.println(list);
        System.out.println("Count is "+Solution.count);
    }
    
}
class Solution
{
    public static int count=0;
    public static void findPer(String p, String up,List<String> list)
    {
        if(up.isEmpty())
        {
            count++;
            list.add(p);
            return ;
        }

        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            findPer(first+ch+second, up.substring(1), list);
        }
    }
}
