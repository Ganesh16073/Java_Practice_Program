import java.util.*;
public class CheckProfitLossEmploye
{
public static void main(String args[])
{
 Scanner obj=new Scanner(System.in);
 int SPrice,MPrice,dif;
 System.out.println("Enter THe Manufacturing cost");
 MPrice=obj.nextInt();
 System.out.println("Enter THe Selling price");
 SPrice=obj.nextInt();
 dif=SPrice-MPrice;
 String result=(dif<0)?("It is loss "+dif):("It is Profit "+dif);
  System.out.println(result);
}
}
 
 
 