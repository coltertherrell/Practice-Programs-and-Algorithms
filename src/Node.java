
public class Node 
{
	
	Node next = null;
	int data;
	
	public Node(int d)
	{
		data = d;
	}
	void append(int d)
	{
		Node end = new Node(d);
		Node n = this;
		while(n.next != null)
		{
			n = n.next;
		}
		n.next = end;
	}
	Node delete(Node head, int d)
	{
		Node n = head;
		
		if(n.data == d)
		{
			return head.next;
		}
		while(n.next != null)
		{
			if(n.next.data == d)
			{
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	
	public static void main(String[] args)
	{
		Node one = new Node(1);
		one.append(2);
		one.append(3);
		
		one.delete(one, 1);
	}

}
