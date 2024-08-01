import java.util.*;
class Ward
{
	private int wardId;
	private String wardName;
	Voter[] vt;
	public void setWardId(int wardId)
	{
		this.wardId=wardId;
	}
	public int getWardId()
	{
		return wardId;
	}
	public void setWardName(String wardName)
	{
		this.wardName=wardName;
	}
	public String getWardName()
	{
		return wardName;
	}
	public void setVoter(Voter ...v)
	{
		vt=v;
	}
	public Voter[] getVoter()
	{
		return vt;
	}
}
class Voter
{
	private int vid;
	private String vname;
	private int vage;
	public void setId(int vid)
	{
		this.vid=vid;
	}
	public int getId()
	{
		return vid;
	}
	public void setName(String vname)
	{
		this.vname=vname;
	}
	public String getName()
	{
		return vname;
	}
	public void setAge(int vage)
	{
		this.vage=vage;
	}
	public int getAge()
	{
		return vage;
	}
}
class VotingMachine
{
	Ward[] wd;
	void setWard(Ward ...w)
	{
		wd=w;
	}
	void showVotingCount()
	{
		int count=0;
		for(int i=0;i<wd.length;i++)
		{	
			System.out.println("Ward Id: "+wd[i].getWardId()+"\tWardName: "+wd[i].getWardName());
			System.out.println("------------------------------------------------------------");
			System.out.println();
			System.out.println("VoterId\tVoterName\tAge");
			Voter[] v=wd[i].getVoter();
			for(int k=0;k<v.length;k++)
			{
				System.out.println(""+v[k].getId()+"\t"+v[k].getName()+"\t\t"+v[k].getAge());
				if((v[k].getAge())>18)
				{
					count++;
				}
			}
			System.out.println("The Voter Above 18 Age is : "+count);
			count=0;
			System.out.println();
		}
	}
}
public class VotingMachineApplication
{
	public static void main(String args[])
	{
		Voter v=new Voter();
		v.setId(1);
		v.setName("ganesh");
		v.setAge(21);
		
		Voter v1 = new Voter();
		v1.setId(2);
		v1.setName("Abhhi");
		v1.setAge(20);
		
		Voter v2 = new Voter();
		v2.setId(3);
		v2.setName("Akash");
		v2.setAge(20);
		
		Voter v3 = new Voter();
		v3.setId(4);
		v3.setName("Rahul");
		v3.setAge(20);
			
		Voter v4 = new Voter();
		v4.setId(5);
		v4.setName("sangram");
		v4.setAge(20);


		
		Ward w=new Ward();
		w.setWardId(1);
		w.setWardName("ABC");
		w.setVoter(v,v1,v2,v3,v4);
		
		Ward w1 = new Ward();
		w1.setWardId(2);
		w1.setWardName("SF Colony");
		w1.setVoter(v,v1,v2,v3,v4);

		
		VotingMachine vm=new VotingMachine();
		vm.setWard(w,w1);
		
		vm.showVotingCount();
		
	}
}
