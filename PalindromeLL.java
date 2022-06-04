//Java File 
public class PalindromeLL {
	private Node head;

	public PalindromeLL() {
		this.head = null;
	}

	public PalindromeLL(Node head) {
		this.head = head;
	}


	public  void insert(int val)
	{
		Node newnode=new Node(val);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.setNext(head);
			head=newnode;
		}
	}


	private static Node reverse(Node ref) {
		Node it=ref;
		Node itn=ref;
		Node  itp=null;
		while(it!=null)
		{
			itn=it.getNext();
			it.setNext(itp);
			itp=it;
			it=itn;
		}
		ref=itp;
		return ref;	
	}

	public boolean Ispalindrome()
	{
		Node slow_p,fast_p,prev_slowp,sec_start;
		boolean result;

		if(head!=null&&head.getNext()!=null)
			return true;
		else
		{
			prev_slowp=slow_p=fast_p=head;
			while(fast_p.getNext()!=null&&fast_p.getNext().getNext()!=null)
			{
				prev_slowp=slow_p;
				slow_p=slow_p.getNext();
				fast_p=fast_p.getNext().getNext();
			}
			System.out.println("Middle Node"+slow_p.getData());
		}
		sec_start=slow_p.getNext();
		if(fast_p.getNext()==null)
		{
			sec_start=reverse(sec_start);
			prev_slowp.setNext(null);
			result=isIdentical(head,sec_start);
			sec_start=reverse(sec_start);
			prev_slowp.setNext(sec_start);
		}
		else
		{
			sec_start=reverse(sec_start);
			slow_p.setNext(null);
			result=isIdentical(head,sec_start);
			sec_start=reverse(sec_start);
			slow_p.setNext(sec_start);
		}
		return result;
	}

	private boolean isIdentical(Node head, Node sec_start) {
		Node it=head;
		while(true)
		{
			if(head==null&&sec_start==null)
				return true;
			if(head==null||sec_start==null)
				return false;

			if(head.getData()!=sec_start.getData())
				return false;
			it=it.getNext();
			sec_start=sec_start.getNext();

		}

	}

	public String toString()
	{
		Node it=head;
		String str="";

		if(head==null)
		{
			System.out.println("Linkdlist Empty");
		}
		else
		{

			while(it!=null)
			{
				str=str+it.getData()+" ";
				it=it.getNext();
			}
		}
		return str;
	}







}
