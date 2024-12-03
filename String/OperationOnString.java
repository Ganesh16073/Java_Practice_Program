import java.util.*;
public class OperationOnString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice");
		System.out.println("1: Revers String");
		System.out.println("2: Remove Duplicate");
		System.out.println("3: Check Panindrome");
		System.out.println("4: Replace SubString");
		System.out.println("5: Remeove Voules");
		System.out.println("6: Insert SubString at specific position");
		System.out.println("7: Convert the Case Upp to Low And Low To Upp");
		System.out.println("8: Find the First Non-Repeating Character");
		System.out.println("9: Shift Characters alphabets by n Positions ");
		System.out.println("10: Count the Frequency of Characters  ");
		System.out.println("11 Shuffel String  ");
		System.out.println("12: WAP to input the string and reverse the words of string  ");
		System.out.println("13: WAP to check Longest Palindrome");
		System.out.println("14: Enter the String to Find Multiple Of Number example: abc 123 mno 123 ==> 15129 ");
		System.out.println("15: Find the Longest Word in a Sentence");
		System.out.println("16: Removing the digit and  symbols in String " );
		System.out.println("17: Method Chaining " );
		
		
		
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter the The String to Reverse");
				StringBuffer str=new StringBuffer();
				str.append(sc.next());
				for(int i=0;i<str.length();i++)
				{
					char temp=str.charAt(str.length()-1);
					str.deleteCharAt(str.length()-1);
					str.insert(i,temp);
					// System.out.println("String update ==>>  "+str);
				}
				System.out.println("The Revers String Using logic is ==> "+str);
				System.out.println("The Reversing String Using .reverse() method is ==> "+(str.reverse()));
				break;
			
			case 2:
				System.out.println("enter the String to Remove Duplicate");
				StringBuffer st=new StringBuffer();
				st.append(sc.next());
				for(int i=0;i<st.length();i++)
				{
					for(int j=i+1;j<st.length();j++)
					{
						if(st.charAt(i)==st.charAt(j))
						{
							st.deleteCharAt(j);
							j--;
							
						}
						// else if(st.charAt(i)==st.charAt(j) && i!=0) just do it...........
						// {
							// st.deleteCharAt(j);
							// j--;
						// }
					}
				}
				System.out.println("The Duplicatre Remeoved String Is =>>"+st);
				break;
			
			case 3:
				System.out.println("Enter the String to  Check Palindrome");
				StringBuffer cp=new StringBuffer();
				sc.nextLine();
				cp.append(sc.nextLine());
				boolean flag=true;
				for(int i=0,j=cp.length()-1;i<cp.length()/2 && flag==true;i++,j--)
				{
					System.out.println(cp.charAt(i)+" "+ cp.charAt(j));
					if(cp.charAt(i)!=cp.charAt(j))
					{
						System.out.println("The Given String is Not a Palindrome");
						flag=false;
					}
				}
				if(flag==true)
				{
					System.out.println("The Given String is Palindrome ==>> "+cp);
				}
				break;
			
			case 4:
				System.out.println("Enter the String to replace the String at specific index");
				StringBuffer rs=new StringBuffer();
				sc.nextLine();
				rs.append(sc.nextLine());
				System.out.println("Enter the String to replace");
				String ars=sc.nextLine();
				System.out.println("Enter the Start Index and End Index to replace");
				int s=sc.nextInt();
				int e=sc.nextInt();
				rs.replace(s,e,ars); // start index , end index-1, string(Only String)  :> StringBuffer not allowed in Function, if end value is greater than length then no error
				System.out.println("The Replaced String is ==>> "+rs);
				break;
				
			case 5:
				System.out.println("Enter the String to Remove Vowels");
				StringBuffer rv=new StringBuffer();
				sc.nextLine();
				rv.append(sc.nextLine());
				for(int i=0;i<rv.length();i++)
				{
					if(rv.charAt(i)=='a' || rv.charAt(i)=='e' || rv.charAt(i)=='i' || rv.charAt(i)=='o' || rv.charAt(i)=='u'
					|| rv.charAt(i)=='A' || rv.charAt(i)=='E' || rv.charAt(i)=='I' || rv.charAt(i)=='O' || rv.charAt(i)=='U')
					{
						rv.deleteCharAt(i);
						i--;
					}
				}
				System.out.println("The Removed Voules is ==>>  "+rv);
				break;
			
			case 6:
				System.out.println("Enter the String to Insert SubString at specific position");
				StringBuffer ins=new StringBuffer();
				sc.nextLine();
				ins.append(sc.nextLine());
				System.out.println("Enter the String to insert");
				String in=sc.nextLine();
				System.out.println("Enter the index to insert");
				int ler=sc.nextInt();
				ins.insert(ler,in);
				
				System.out.println("the output is ==>> "+ins);
				break;
			
			case 7:
				System.out.println("Enter the String to Convert the Case Upp to Low And Low To Upp");
				StringBuffer ulc=new StringBuffer();
				sc.nextLine();
				ulc.append(sc.nextLine());
				for(int i=0;i<ulc.length();i++)
				{
					char ch;
					if(ulc.charAt(i)>=65 && ulc.charAt(i)<=90)
					{
						ch=ulc.charAt(i);
						ch=(char)((int)ch+32);
						ulc.deleteCharAt(i);
						ulc.insert(i,ch);
					}
					else if(ulc.charAt(i)>=97 && ulc.charAt(i)<=122)
					{
						ch=ulc.charAt(i);
						ch=(char)((int)ch-32);
						ulc.deleteCharAt(i);
						ulc.insert(i,ch);
					}
				}
				System.out.println("the Converted String is ==>  "+ulc);
				break;
				
			case 8:
				System.out.println("Enter String to find the First Non-Repeating Character");
				StringBuffer ffn=new StringBuffer();
				sc.nextLine();
				ffn.append(sc.nextLine());
				int count;
				for(int i=0;i<ffn.length();i++)
				{
					count=0;
					for(int j=0;j<ffn.length();j++)
					{
						if(i==j)
						{
							continue;
						}
						if(ffn.charAt(i)==ffn.charAt(j))
						{
							++count;
							
						}
						// System.out.println(ffn.charAt(i)+" "+ffn.charAt(j)+" "+count);
					}
					if(count==0)
					{
						System.out.println("The First Non Repeating Characer is ==>> "+ffn.charAt(i));
						break;
					}
				}
				break;
				
			case 9:
				System.out.println("Enter String to Shift Characters by n Positions ");
				String scp=sc.next();
				System.out.println("Enter the n shift character");
				int n=sc.nextInt();
				StringBuffer shift=new StringBuffer();
				System.out.println(shift);
				
				for(int i=0;i<scp.length();i++)
				{
					char currChar=scp.charAt(i);
					char addd;
					if(currChar>=65 && currChar<=90)
					{
						addd=(char)((currChar-'A'+n) % 26 +'A');
					}
					else if(currChar>=97 && currChar<=122)
					{
						addd=(char)((currChar-'a'+n) % 26 +'a');
					}
					else
					{
						addd=currChar;
					}
					shift.append(addd);
				}
				System.out.println("The Shifted String is ==> "+shift);
				break;
			
			case 10:
				System.out.println("Enter the The String to count the Frequency of character");
				StringBuffer cf=new StringBuffer();
				sc.nextLine();
				cf.append(sc.nextLine());
				int cout=0;
				for(int i=0;i<cf.length();i++)
				{
					cout=1;
					for(int j=0;j<cf.length();j++)
					{
						if(i==j)
						{
							continue;
						}
						if(cf.charAt(i)==cf.charAt(j))
						{
							cout++;
							//System.out.println("Char At before "+(cf.charAt(j)));
							cf.deleteCharAt(j);
							j--;
							//System.out.println("Char At  after"+(cf.charAt(j)));
						}
					}
					System.out.println("Count of "+cf.charAt(i)+" is ==>> "+cout);
				}
				break;
				
			case 11:
				System.out.println("Enter the first String to Shuffe");
				StringBuffer sbf=new StringBuffer();
				sc.nextLine();
				sbf.append(sc.nextLine());
				
				System.out.println("Enter the Second String to Shuffe");
				StringBuffer sbs=new StringBuffer();
				// sc.nextLine();
				sbs.append(sc.nextLine());
				StringBuffer output=new StringBuffer();
				int limit;
				int max;
				StringBuffer store=new StringBuffer();
				if(sbf.length()<sbs.length())
				{
					limit=sbf.length();
					max=sbs.length();
					store.append(sbs);
				}
				else
				{
					limit=sbs.length();
					max=sbf.length();
					store.append(sbf);
				}
				int g=0;
				for(g=0;g<limit;g++)
				{
					output.append(sbf.charAt(g));
					output.append(sbs.charAt(g));
				}
				for(;g<max;g++)
				{
					output.append(store.charAt(g));
				}
				System.out.println("The Shuffeld Strin Is ==>> "+output);
				break;
				
			case 12:
				System.out.println("Enter The String to reverse the words of string ");
				sc.nextLine();
				String rvw=sc.nextLine();
				String words[]=rvw.split(" ");
				StringBuffer sb=new StringBuffer();
				
				for(String word:words)
				{
					StringBuffer scc=new StringBuffer();
					for(int i=(word.length()-1);i>=0;i--)
					{ 
						scc=scc.append(word.charAt(i));
					}
					scc=scc.append(" ");
					sb.append(scc);
				}
				System.out.println(sb);
				break;
				
			case 13:
				System.out.println("Enter the The String to Check Longest Palindrome ");
				String lp;
				sc.nextLine();
				lp=sc.nextLine();
				int startInd=0;
				int maxLength=1;
				for(int i=0;i<lp.length();i++)
				{
					for(int j=i;j<lp.length();j++)
					{
						if(ABC.checkPal(lp,i,j) && (j-i+1)>maxLength)
						{
							startInd=i;
							maxLength=j-i+1;
						}
					}
				}
				System.out.println("Longrst Palindrome is ==>>  "+lp.substring(startInd,(startInd+maxLength)));
				
				break;
				
			case 14:
				System.out.println("Enter the String to Find Multiple Of Number example: abc 123 mno 123 ==> 15129 ");
				StringBuffer findmul=new StringBuffer();
				sc.nextLine();
				findmul.append(sc.nextLine());
				int sum=1,temp=0;
				for(int i=0;i<findmul.length();i++)
				{
					if(findmul.charAt(i)>=48 && findmul.charAt(i)<=57)
					{
						temp=temp*10+(int)(findmul.charAt(i)-48);
					}
					else if(temp!=0)
					{
						sum*=temp;
						temp=0;
					}
				}
				sum*=temp;
				System.out.println("the Multiplication of Number in String is ==> "+sum);
				break;
				
			case 15:
				System.out.println("Enter the String to Find the Longest Word in a Sentence");
				StringBuffer lws=new StringBuffer();
				sc.nextLine();
				lws.append(sc.nextLine());
				count=0;int precount=0;
				int prestart=0;
				int start=0,end=0;
				int innit;
				for(int i=0;i<lws.length();i++)
				{
					count++;
					if(lws.charAt(i)==32)
					{
						if(count>precount)
						{
							precount=count;
							start=prestart;
							end=i;
							count=0;
						}
						prestart=end+1;
						
							
					}
				}
				System.out.println("the Longest Word in String is ==>> "+(lws.substring(start,(end+1))));
				break;
				
			case 16:
				System.out.println("Enter the String to  Removing the digit and  symbols in String " );
				StringBuffer rds=new StringBuffer();
				sc.nextLine();
				rds.append(sc.nextLine());
				for(int i=0;i<rds.length();i++)
				{
					char ch=rds.charAt(i);
					if((ch>=65 &&  ch<=90) || (ch>=97 && ch<=122) || ch==32 )
					{
						continue;
				
					}
					else
					{
						rds.deleteCharAt(i);
						i--;
					}
				}
				System.out.println("After Removing the degit and  symbols is " );
				System.out.println(rds);
				break;
				
			case 17:
				System.out.println("Enter the String to Perform Constructor");
				sc.nextLine();
				String name=sc.nextLine();
				new ABC().setName(name).display();
				break;
				
			default:
				System.out.println("Invalid Choice");

		}
		
	}
}
class ABC
{
	String name;
	ABC setName(String name)
	{
		this.name=name;
		return this;
	}
	void display()
	{
		System.out.println("Printing thiough method Chaining");
	}
	
	
	public static boolean checkPal(String str,int i,int j)
	{
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}

