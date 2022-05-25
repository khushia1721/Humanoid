
public class Main
{
    private ListNode head;
    private ListNode tail;
    //private int length;
    
    private static class ListNode
    {
        private int data;
        private ListNode previous;
        private ListNode next;
        
        public ListNode(int data)
        {
            this.data=data;
            //this.next=null;
        }
        
    }
    public Main()
    {
            this.head=null;
            this.tail=null;
    }
    
    public void displayForward()
    {
        if(head==null)
        {
            return;
            
        }
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }
    
    public void displayBackward()
    {
        if(tail==null)
        {
            return;
        }
        ListNode temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
        }
    }
	public static void main(String[] args) {
		Main dll=new Main();
		dll.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		
		dll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		dll.displayForward();
	}
}

