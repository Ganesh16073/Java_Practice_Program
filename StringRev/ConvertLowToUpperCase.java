public class ConvertLowToUpperCase {
    public static void main(String[] args) {
        String str="GAnesh";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>=97 && ch<=122)
            {
                ch=(char)(ch-32);
            }
            sb.append(ch);
        }
        System.out.println("The String to upper case is :: "+sb);
    }
}
