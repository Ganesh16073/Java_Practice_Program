import java.util.ArrayList;

public class CountWords {
    public static void main(String[] args) {
        String str="Write a JAVA program to convert lowercase string to uppercase";
        ArrayList<StringBuffer> list=new ArrayList<>(); 
        StringBuffer b=new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==32|| i==str.length()-1)
            {
                list.add(b);
                b.delete(0,b.length());
                // System.out.println(b+" :: Buffer");
            }
            else
            {
                b.append(str.charAt(i));
            }
        }
        System.out.println("The Number of Words in String is "+list.size());
        
    }
}
