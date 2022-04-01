package com.app;
import java.util.Scanner;
public class SinglyLL {
	//the class Singly linked list should br private
	private Node head;
	Scanner sc;
	
	public SinglyLL()
	{
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public Node createNode()
	{
		Node newnode=new Node();  // creating the space for new node
		System.out.println("Enter the data");
		sc=new Scanner(System.in);
		newnode.setData(sc.nextInt());  // assign the value to ayyribute data
		newnode.setNext(null);  // assign the value to avoid the undefined values
		return newnode;
	}
	
	public void addAtStart()
	{
		Node newnode=createNode(); //new node is created
		
		if(head==null)  // the list is empty
		{
			head=newnode;
		}
		else
		{
			newnode.setNext(head);
			head=newnode;
		}
	}// addstart
	
	public void addAtEnd()
	{
		Node temp=head;
		Node newnode=createNode();
		if(head==null)// LL is empty
		{
			head=newnode;
		}
		else
		{
			while(temp.getNext()!=null)
				temp=temp.getNext();
			temp.setNext(newnode);
		}
	}// add AtEnd
	public void addAtMid(int value)
	{
		Node newnode=createNode();
		Node temp=head;
		if(head==null)
			head=newnode;
		else if(head.getNext()==null)  //only one node is existed in ll
		{
			if(temp.getData()==value)
				head.setNext(newnode);
			else
				System.out.println("\t Error :node is not found.....!!");
		}
		else  //multiple node
		{
			while(temp!=null)
			{
				if(temp.getData()==value)
				{
					//connnect new node withe temp nextnode
					newnode.setNext(temp.getNext());
					// connect temp with new node
					temp.setNext(newnode);
					break;
				}
			else
				temp=temp.getNext();
		}//while
		if(temp==null)
		{
			System.out.println("\t Node not found....!!!");
		}
		}
	}//addMidd
	public int count() {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			temp=temp.getNext();
			count++;
		}
		return count;
		
	}//End of Count
	
	
	public void addAtMidByPos(int pos)
	{
		Node temp=head,tag=null;
		int c=0;
		while(head==null) {
			System.out.println("LL is Emppty");
			break;
		}
		if(pos==1) {
			while(head.getNext()==null) {
				head=null;
				temp=null;
			}
			head=head.getNext();
			temp.setNext(null);
		}
		else if(pos==count()) {
			while(temp.getNext().getNext()!=null)
				temp=temp.getNext();
			temp.setNext(null);
		}
		else if(pos>1&&pos<count()) {
			for(temp=head,c=1;c<pos-1;temp=temp.getNext(),c++);{
				tag=temp.getNext();
				temp.setNext(tag.getNext());
				tag.setNext(null);
			}
		}
		else
			System.out.println("Invalid Position");
	}//EndOFDelbypo

	
	public void deleteAtStart()
	{
		Node temp=head;
		if(head==null)  //LL does not contain any node
			System.out.println("Linked list is empty.......!!!!");
			else if(head.getNext()==null)  //single node in ll
			{
				head=null;
				temp=null;
			}
			else  //multiple nodes in ll
			{
				head=head.getNext();  //shift head to second node
				temp.setNext(null);  // temp's next should be null
				
			}
		
	}
	public void deleteAtEnd()
	{
		Node temp=head;
		if(head==null)  //LL is Empty
			System.out.println("\t Linked list is Empty....!!!");
		else if(head.getNext()==null)// single node is existed in linked list
		{
			head=null; temp=null;
		}
		else  // multiple node is existed in linked list
		{
			//serach for second last node
			while(temp.getNext().getNext()!=null)
				temp=temp.getNext();
			
			temp.setNext(null);
			
		}
	}
	
	public void deleteInBetween(int value)
	{
		Node temp=head,tag=null;
		if(head==null)
		{
			//head=newnode;
			System.out.println("Linked list is Empty....!");
		}
		else if(head.getNext()==null) // single node in LL
		{
			if(temp.getData()==value)
			{
				head=null;
				temp=null;
			}
			else
				System.out.println("\n ERROR::... data didnot match...!!\n");
		}
		else
		{
			// search for the node adjecent (before) to the node with value want to delete
			while(temp.getNext()!=null && temp.getNext().getData()!=value)
				temp=temp.getNext();
			// checkif temp is holding the address of valid node or not
			if(temp.getNext()!=null)
			{
				tag=temp.getNext();
				temp.setNext(tag.getNext());
				tag.setNext(null);
			}
			else
				System.out.println("\n ERROR: Node not Found...!!!\n");
		}	
	}
	
	public void delAtMidByPos(int pos) {
		Node temp=head,tag=null;
		int c=0;
		while(head==null) {
			System.out.println("LL is Emppty");
			break;
		}
		if(pos==1) {
			while(head.getNext()==null) {
				head=null;
				temp=null;
			}
			head=head.getNext();
			temp.setNext(null);
		}
		else if(pos==count()) {
			while(temp.getNext().getNext()!=null)
				temp=temp.getNext();
			temp.setNext(null);
		}
		else if(pos>1&&pos<count()) {
			for(temp=head,c=1;c<pos-1;temp=temp.getNext(),c++);{
				tag=temp.getNext();
				temp.setNext(tag.getNext());
				tag.setNext(null);
			}
		}
		else
			System.out.println("Invalid Position");
	}//EndOFDelbypo
	
	public void updateLL(int u) {
		Node temp=head;
		while(head==null) {
			System.out.println("\tLinkedList Is Empty...!!");
			break;
		}
		while(head.getNext()==null) {		//LL has 1 element..
			if(head.getData()==u) {
				System.out.println("Value Exists");
				System.out.println("Ennter the new Value..");
				int u1=sc.nextInt();
				temp.setData(u1);
				break;
			}
			else
				System.out.println("Enter Existing Value...");
		}
		while(temp.getData()!=u) 		//Itterate through the LL
			temp=temp.getNext();
		if(temp.getData()==u) {
			System.out.println("The value Exists..");
			System.out.println("Enter the new Value..");
			int u1=sc.nextInt();
			temp.setData(u1);
		}
		else
			System.out.println("Enter existing value");
		
	}//End of Update
	public void display()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("Linked list is empty!!!");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.getData()+"->");
				temp=temp.getNext();
			}
			System.out.print("Null\n");
		}//displ
			
	}
}
