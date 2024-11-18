class LinkedListApp
{
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(60);
		System.out.println("The Nodes are =>");
		
		l.show();
	}
}

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}	

class LinkedList
{
	Node head;
	
	LinkedList()
	{
		head=null;
	}
	
	void add(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node p=head;
			while(p.next!=null)
			{
				p=p.next;
				
			}
			p.next=newNode;
		}
	}
	
	void show()
	{
		Node pr=head;
		while(pr!=null)
		{
			System.out.println(pr.data);
			pr=pr.next;
		}
	}
	
}