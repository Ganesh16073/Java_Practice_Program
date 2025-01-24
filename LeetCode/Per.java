import java.util.*;
public class Per {
    public static void main(String[] args) {
        String str="abc";
        List<String> list=new ArrayList<>();
        Solution.fun("", str, list);
        list.forEach(System.out::println);
    }
    
}
class Solution
{
    public static void fun(String p,String up, List<String> list)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return ;
        }

        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            fun(first+ch+second, up.substring(1), list);
        }
    } 
}