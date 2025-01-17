public class CountVoulve {
    public static void main(String[] args) {
        String str="GaneshKulkarni";
        int vcount=0;
        int ccount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u'|| str.charAt(i)=='i'||
            str.charAt(i)=='A'|| str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='U'|| str.charAt(i)=='I')
            {
                vcount++;
            }
            else if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122) )
            {
                ccount++;
            }
        }
        System.out.println("The Vouvle Count is "+vcount);
        System.out.println("The consonent Count is "+ccount);
    }
}
