public class Findlength {
    public static void main(String[] args) {
        String str="Ganesh";
        int i=0;

        while(str.charAt(i)>='\0')
        {
            i++;
        }
        System.out.println("the Sizeof Striing is ::"+(i+1));
    }
    
}
