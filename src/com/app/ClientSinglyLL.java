package com.app;

import java.util.Scanner;

public class ClientSinglyLL {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		SinglyLL s1=new SinglyLL();
		do {
			System.out.println("*********************MENU****************");
			System.out.println("1.Start\n2.Add At Start \n3.add at End \n4.Add at Mid by data \n5.Add the element by position "
					+ "\n6.Delete At Start \n7.Delete At End\n8.Delete At Mid using data \n9.Delete the element by Position "
					+ "\n10.Count the no of nodes in linked list \n11.Display \n12.update the linked list  \n0.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				s1.setHead(s1.createNode());
				System.out.println("New Linkd list is instatiated");
				break;
				
			case 2:
				s1.addAtStart();
				break;
				
			case 3:
				s1.addAtEnd();
				break;
				
			case 4:
				System.out.println("Enter the data after which u want to add node::");
				int value=sc.nextInt();
				s1.addAtMid(value);
				break;
				
			case 5:
				System.out.println("Enter the position you want to add the node");
		
					int pos=sc.nextInt();
					s1.addAtMidByPos(pos);
					break;
					
			case 6:
				s1.deleteAtStart();
				break;
				
			case 7:
				s1.deleteAtEnd();
				break;
				
			case 8:
				System.out.println("Enter the data which node you want to delete");
				int val=sc.nextInt();
				s1.deleteInBetween(val);
				break;
				
			case 9:
				System.out.println("Enter the which position you want to delete the element");
				int pos1=sc.nextInt();
				s1.addAtMidByPos(pos1);
				break;
				
			case 10:
				System.out.println("The no of Nodes in Linked List is   "+s1.count());
				break;
				
			case 11:
				System.out.println("-----------------------------------\n\n");
				s1.display();
				System.out.println("\n-------------------------------------------\n\n");
				break;
				
			case 12:
				System.out.println("Enter the value you want to update..");
				int u=sc.nextInt();
				s1.updateLL(u);
				break;
				
			case 0:
				System.exit(0);
				break;
			}
		}while(ch!=0);
	}//main
}//class
