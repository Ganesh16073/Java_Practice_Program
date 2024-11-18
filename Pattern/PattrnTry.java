public class PattrnTry
{
	public static void main(String arg[])
	{
        for (int i = 1; i <=9 ; i++) {
            int num = i <= 4 ? i : 8- i;
            for (int j = 1; j <= num; j++) {
                System.out.print(num);
                if (j < num) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
	}
}
// C:\Program Files\Java\jdk-21\bin\Java_program\Pattern>java PattrnTry.java
// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 3*3*3
// 2*2
// 1