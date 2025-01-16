import java.util.ArrayList;

public class Prtmutation {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> list=new ArrayList<>();
        list=Solution.fundPermutation("", str, list);
        list.forEach(System.out::println);

    }
    
}
class Solution
{
    public static ArrayList<String> fundPermutation(String pro,String up,ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            list.add(pro);
            return list;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=pro.length();i++)
        {
            String first=pro.substring(0,i);
            String second=pro.substring(i, pro.length());
            fundPermutation(first+ch+second,up.substring(1),list);
        }
        return list;
    }
}