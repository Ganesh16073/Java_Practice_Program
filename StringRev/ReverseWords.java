public class ReverseWords {
    public static void main(String[] args) {
        String str="Write a JAVA program to convert lowercase string to uppercase Reverse EveyWord";
        String s[]=str.split(" ");
        StringBuffer b=new StringBuffer();
        for(int i=0;i<s.length;i++)
        {
            b.append(s[i]);
            for(int j=0,k=b.length()-1;j<b.length()/2;j++,k--)
            {
                char temp=b.charAt(j);
                b.setCharAt(j, b.charAt(k));
                b.setCharAt(k, temp);
            }
            s[i]=b.toString();
            b.delete(0, b.length());
        }

        StringBuffer newS=new StringBuffer();
        for(int i=0;i<s.length;i++)
        {
            newS.append(s[i]+" ");
        }
        System.out.println("The Word Reversed String is "+newS);



    }
    
}
