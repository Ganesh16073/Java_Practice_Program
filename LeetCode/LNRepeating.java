import java.util.HashSet;

public class LNRepeating {
    public static void main(String[] args) {
        String str="abcabcbba";
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int maxLength=0;
        for(int j=0;j<str.length();j++)
        {
            while(set.contains(str.charAt(j)))
            {
                set.remove(str.charAt(i));
                i++;
            }
            set.add(str.charAt(j));
            maxLength=Math.max(maxLength,j-i+1);
        }
        System.out.println("THe Max Length is "+ maxLength);

    }
}
