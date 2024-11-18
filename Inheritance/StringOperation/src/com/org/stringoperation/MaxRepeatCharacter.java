package com.org.stringoperation;

public class MaxRepeatCharacter extends StringOperation {
	public void performOperation(String str)
	{
		
		char[] ch=str.toCharArray();
		int count=0,maxCount=0;
		char max=ch[0];
		for(int i=1;i<ch.length;i++)
		{
			count=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					++count;
				}
			}
			if(count>maxCount)
			{
				maxCount=count;
				max=ch[i];
			}
		}
		System.out.println("The Maximum Repeatin Character is "+max+" and it Repeats "+maxCount+" times");
	}
}
