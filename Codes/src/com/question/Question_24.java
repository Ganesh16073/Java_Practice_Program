package com.question;
import java.util.*;
public class Question_24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of interior wall");
		int iw=sc.nextInt();
		System.out.println("Enter the number of Exterior Wall");
		int ew=sc.nextInt();
		System.out.println("Enter the Surface Area of each interior in sqfeet");
		float sai[]=new float[iw];
		for(int i=0;i<sai.length;i++)
		{
			sai[i]=sc.nextFloat();
		}
		System.out.println("Enter the Surface Area of each extrior in sqfeet");
		float sae[]=new float[ew];
		for(int i=0;i<sae.length;i++)
		{
			sae[i]=sc.nextFloat();
		}
		float sum=1;
		float tsum=0;
		for(int i=0;i<sai.length;i++)
		{
			sum=1;
			sum=sai[i]*18;
			tsum=tsum+sum;
		}
		for(int i=0;i<sae.length;i++)
		{
			sum=1;
			sum=sae[i]*12;
			tsum=tsum+sum;
		}
		
		System.out.println("The Total cost of Painting is "+tsum);
		
	}
}
