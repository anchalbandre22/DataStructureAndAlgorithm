package linkedlist;

public class Tester {

	
	public static void main(String[] args) {
     Linkedlist list = new Linkedlist();
   //  list.addAtFirstPosition(10);
   //  list.addAtFirstPosition(20);
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
     list.add(50);
     list.display();
     list.addAtParticularPosition(35, 3);
     list.display();
     list.addLast(60);
     list.display();
     list.deleteLast();
     list.display();
     list.deleteFirst();
     list.display();
     list.deleteAtParticularPosition(2);
     list.display();

	}

}
