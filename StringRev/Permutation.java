import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> list=new ArrayList<>();
        Solution.findPer("", str, list);
        System.out.println("The PERMUTATION OF String is ::");
        list.forEach(System.out::println);
    }
}
class Solution
{
    public static void findPer(String p,String up,ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0, i);
            String last=p.substring(i,(p.length()));
            findPer(first+ch+last, up.substring(1), list);
        }
    }
}
