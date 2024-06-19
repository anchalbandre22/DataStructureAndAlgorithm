package linkedlist;

public class Linkedlist {
	
	private Node head;

	public Node getHead() {
		return head;
	}
	
	public Linkedlist(){
		head=null;
		
	}
  
	
	// add at first position
	public void addAtFirstPosition(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
		}
		
		else {
	       newNode.setNext(head); 
	       head=newNode;
		}
		
		
	}
	
	// add sequentially 
	    public void add(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp = head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(newNode);
		}
		
		
		
		}
	    
	    
	    
	 // add at particular position
	    public void addAtParticularPosition(int data,int position){
	    	Node newNode = new Node(data);
	    	if(position<=0) {
	    		return;
	    	}
	    	
	    	if(position==1){
	    		newNode.setNext(head);
	    		head=newNode;
	    	}
	    	
	         Node temp = head;
	         for(int i=1;i<position-1;i++){
	        	 temp=temp.getNext();
	        	 
	        }
	         newNode.setNext(temp.getNext());
	         temp.setNext(newNode);
	    	 return;
	    	
	    }
	    
	    
	    
	    // addLast
	    public void addLast(int data) {
	    	Node newNode = new Node(data);
	    	if(head==null){
	    	   head=newNode;
	    	   return;
	    	}
	    	Node temp = head;
	    	while(temp.getNext()!=null) {
	    		temp=temp.getNext();
	    	}
	    	temp.setNext(newNode);
	       	
	    }
	    
	    
	    // delete first
	    public void deleteFirst(){
	    	if(head==null) {
	    		System.out.println("List is empty");
	    		return;
	    	}
	    	head=head.getNext();
	    	
	    	
	    }
	    
	    //delete last 
	    public void deleteLast(){
	    	if(head==null) {
	    		System.out.println("List is empty");
	    		return;
	    	}
	    	Node prev = head , del=head;
	    	while(del.getNext()!=null) {
	    		 prev = del;
	    		del=del.getNext();
	    		
	    	}
	    	prev.setNext(null);
	    	
	    	return;
	    	
	    	
	    	
	    }
	    
	    // delete at particular position
	    public void deleteAtParticularPosition(int position){
	    	if(head==null) {
	    		System.out.println("List is empty");
	    		return;
	    	}
	    	
	    	if(position==1) {
	    		head=head.getNext();
	    		return;
	    	}
	        Node prev = head ;
	         for(int i = 1 ;i<position-1;i++) {
	        	 prev=prev.getNext();

	         }
	         Node del = prev.getNext();
	         prev.setNext(del.getNext());
              return;	    	
	    	
	    }
	
	 public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
}
