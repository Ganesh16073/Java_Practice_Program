import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindOccurenceOfElement {
    public static void main(String[] args) {
        Map<Character,List<Integer>> l=new LinkedHashMap<>();
        String org="Ganesh Kulkarni";
        String str=org.toLowerCase();
        for(int i=0;i<org.length();i++)
        {
            if(l.containsKey(str.charAt(i)))
            {
                List<Integer> ge=l.get(str.charAt(i));
                ge.add(i);
                l.put(str.charAt(i),ge);
            }
            else{
                List<Integer> list=new ArrayList<Integer>();
                list.add(i);
                l.put(str.charAt(i), list);
            }
        }
        System.out.println("The Character and their occurencc is");
        l.forEach((a,b)->{
            System.out.println("The Key is :: "+a);
            List<Integer> list=b;
            System.out.println("The Index are :: "+list);
            System.out.println();
        });
    }   
}
