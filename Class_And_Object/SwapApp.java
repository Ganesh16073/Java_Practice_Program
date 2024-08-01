import java.util.*;
public class SwapApp
  {
      public static void main(String x[])
	  { 
	     Scanner xyz=new Scanner(System.in);
		 
		 int no,firstdigit=1,lastdigit,diviser=1,originalnum,digitcount=0,i,swappednum;
		 System.out.println("Enter the no");
		 no=xyz.nextInt(); //123
		 originalnum=no;
		 lastdigit=no%10; //lastdigit
		 
		 while(no>0)
		  {
		     digitcount++;
			 firstdigit=no; //firstdigit
             no=no/10;
		  }
		  for(i=1;i<digitcount;i++) // <3 (Coutnt)
		   {
		     diviser=diviser*10; // count=3 :: 100
			}
			originalnum=originalnum%diviser; // 123=123%100 =>23
			originalnum=originalnum/10; //23/10==> 2
  			 
		   swappednum=lastdigit *diviser +originalnum*10+firstdigit;
		   System.out.println("Swapped Number:"+swappednum);
		  }
}
		 
		 