package dataStrucAssignments;

import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Hashtable;

public class FinalRequirement {
	
	//BOOLEANS
	public static boolean isStackFull(int max) {
		if (max == stack.size()) {
			return true;
		} else
			return false;
	}
	
	public static boolean isQueueFull(int max) {
		if (max == Queue.size()) {
			return true;
		} else
			return false;
	}
	
	public static boolean HashTableFull(int max) {
		if (max == Hash.size()) {
			return true;
		} else
			return false;
	}
	
	public static boolean isLinkedListFull(int max) {
		if (max == LinkedList.size()) {
			return true;
		} else
			return false;
	}
	public static boolean isEmpty() {
		if (Queue.isEmpty()&&LinkedList.isEmpty()&&stack.isEmpty() && Hash.isEmpty()) {
			return true;
		}else
			return false;
	}
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Michael Jan R. Tangalin\n2-BSIT-2");
		int Choice = 0;
		
		while(Choice!=5) {
		System.out.println("-----------------------");
		System.out.print("Input Array Size: ");
		int max = input.nextInt();
		System.out.println("<<<< MENU >>>>");
		System.out.println("1. Stack \n" + 
							"2. Queue\n" + 
							"3. LinkedList\n" + 
							"4. Hash Table\n" + 
							"5. Exit");
		System.out.print("Enter Choice: ");
		Choice = input.nextInt();
		
			switch (Choice) {
			case 1:
				StacksImp(max);
				break;
			case 2:
				QueuesImp(max);
				break;
			case 3:
				LinkListImp(max);
				break;
			case 4:
				HashTableImp(max);
				break;
			case 5:
				System.out.println("\n<<<< System Exit! >>>>");	
				break;
			default:
				System.out.println("<<<< Invalid Choice! >>>>");
				break;
				
			}
			
			
		
		}
	}
	
	//STACKS
		
	static Stack<Object> stack = new Stack<Object>();
	public static void StacksImp(int max) {
		
		int Choice = 0;
		do{
			System.out.println("\n<<<< STACKS >>>>");
			System.out.println("1. Push Object " + 
					"\n2. Pop Object" + 
					"\n3. Peek Objects" + 
					"\n4. Size of Objects" + 
					"\n5. IsEmpty"+
					"\n6. IsFull"+
					"\n7. Exit" );
			System.out.print("\nInput your Choice: ");
			Choice = input.nextInt();

			switch (Choice) {
			case 1:
				System.out.print("\nInput object Element: ");
				input.nextLine();
				
				if (max != stack.size()) {
					stack.push(input.nextLine());
				} else {
					System.out.println("\n<<<STACK IS FULL!>>>");
				}
				System.out.print("\n");
				System.out.println("----------------------");
				System.out.println("Object List: \n" + stack);
				System.out.println("----------------------");
				break;
			case 2:
				if (!stack.isEmpty()) {
					stack.pop();
					System.out.println("TOP OBJECT POPPED");
				} else {
					System.out.println("Can't Pop Empty Object!");
				}
				System.out.println("----------------------");
				System.out.println("Object List: \n" + stack);
				System.out.println("----------------------");
				break;
			case 3:
				if (stack.isEmpty()) {
					System.out.println("Object is Empty!");
				} else {
					System.out.println("Top Element Object: " + stack.peek());
				}
				break;
			case 4:
				System.out.println("Number of object elements: " + stack.size());
				break;
			case 5:
				System.out.println("is empty: " + isEmpty());
				break;
			case 6:
				System.out.println("is Full: " + isStackFull(max));
				break;
			case 7:
				System.out.println("---EXIT STACKS---");
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
			}
			
		} while (Choice != 7);
	}
	
	//QUEUES
	
	static Queue<Object> Queue = new LinkedList<Object>();
	public static void QueuesImp(int max) {
		
		int Choice = 0;
		do {
		System.out.println("\n<<<< QUEUE >>>>");
		System.out.println("1. Enqueue\n" + 
						"2. Dequeue\n" + 
						"3. IsEmpty\n" + 
						"4. IsFull\n" + 
						"5. Peek\n" + 
						"6. Exit");
		System.out.print("\nInput your Choice: ");
		Choice = input.nextInt();
		
		switch(Choice) {
		case 1:
			System.out.print("Enter element to enquee: ");
			input.nextLine();

			if (max != Queue.size()) {
				Queue.add(input.nextLine());
			} else {
				System.out.println("\n<<<QUEUE IS FULL!>>>");
			}
			System.out.print("-------------------\n");
			System.out.println("Object List: \n" + Queue);
			System.out.print("-------------------\n");
			break;
		case 2:
			if (!Queue.isEmpty()) {
				Queue.poll();
				System.out.println("OBJECT DEQUEUED");
			} else {
				System.out.println("\nList is already empty");
			}
			System.out.print("-------------------\n");
			System.out.println("Object List: \n" + Queue);
			System.out.print("-------------------\n");
			break;
		case 3:
			System.out.println("is empty: " + isEmpty());
			break;
		case 4:
			System.out.println("is Full: " + isQueueFull(max));
			break;
		case 5:
			if (!isEmpty()) {
				System.out.println("Front element: " + Queue.peek());
			} else {
				System.out.println("Cannot peek, list is empty");
			}
			break;
		case 6:
			System.out.println("---EXIT QUEUE---");
			break;
		default:
				System.out.println("Invalid Choice!");
		break;
		}
		
		}while(Choice!=6);
	}
	
	//LINKEDLIST
	
	static LinkedList<Object> LinkedList = new LinkedList<Object>();
	public static void LinkListImp(int max) {
		
		int Choice = 0;
		do {
		System.out.println("\n<<<< LINKED LIST >>>>");

		System.out.println("1. Add First Object\n"+
							"2. Add Last Object\n" + 
							"3. Get First Object\n"+
							"4. Get Last Object\n"+
							"5. Remove First Object\n"+
							"6. Remove Last Object\n"+
							"7. Exit");
		System.out.print("\nInput your Choice: ");
		Choice = input.nextInt();
			
		
			switch(Choice) {
			case 1:

				System.out.print("Add First Object: ");
				input.nextLine();
				
				
				if (max != LinkedList.size()) {
					LinkedList.addFirst(input.nextLine());
				} else {
					System.out.println("\n<<<LINKED LIST IS FULL!>>>");
				}
				
				System.out.print("-------------------\n");
				System.out.println("Object List: \n" + LinkedList);
				System.out.print("-------------------\n");
				break;
			case 2:
				System.out.print("Add Last Object: ");
				input.nextLine();
				
				
				if (max != LinkedList.size()) {
					LinkedList.addLast(input.nextLine());
				} else {
					System.out.println("\n<<<LINKED LIST IS FULL!>>>");
				}	
				
				System.out.print("-------------------\n");
				System.out.println("Object List: \n" + LinkedList);
				System.out.print("-------------------\n");
				break;
			case 3:
				if (!isEmpty()) {
					System.out.println("First Object: " + LinkedList.getFirst());
				} else {
					System.out.println("list is empty");
				}
				break;
			case 4:
				if (!isEmpty()) {
					System.out.println("Last Object: " + LinkedList.getLast());
				} else {
					System.out.println("list is empty");
				}
				break;
			case 5:
				if (!LinkedList.isEmpty()) {
					LinkedList.removeFirst();
					System.out.println("FIRST OBJECT REMOVED");
				} else {
					System.out.println("\nLinked List is already empty");
				}
				System.out.print("-------------------\n");
				System.out.println("Object List: \n" + LinkedList);
				System.out.print("-------------------\n");
				break;
			case 6:
				if (!LinkedList.isEmpty()) {
					LinkedList.removeLast();
					System.out.println("LAST OBJECT REMOVED");
				} else {
					System.out.println("\nLinked List is already empty");
				}
				System.out.print("-------------------\n");
				System.out.println("Object List: \n" + LinkedList);
				System.out.print("-------------------\n");
				break;
			case 7:
				System.out.println("---EXIT LINKED LIST---");
				break;
			default:
					System.out.println("Invalid Choice!");
			}
			
		}while(Choice!=7);
	}
	
	//HASH-TABLES

	static Hashtable<Integer, Object> Hash = new Hashtable<Integer, Object>();
	public static void HashTableImp(int max) {
		int choice = 0;
		int number;
		Object something;
		do {
			
		
		System.out.println("\n<<<< HASH TABLE >>>>");
		System.out.println("1. Put Objects\n"+
							"2. Replace an Object\n"+
							"3. Search Object\n" + 
							"4. Remove an Object\n"+
							"5. Remove All Objects\n"+
							"6. Exit");
		System.out.print("\nInput your Choice: ");
		choice = input.nextInt();
		
		switch(choice) {
		case 1:
			
			if (max != Hash.size()) {
				System.out.print("Enter NumberID: ");
				number = input.nextInt();
				System.out.print("Enter Object: ");
				something = input.next();
				Hash.put(number,something);
			} else {
				System.out.println("\n<<<HASH TABLE IS FULL!>>>");
			}
			
			System.out.print("-------------------\n");
			System.out.println("Object List: \n" + Hash);
			System.out.print("-------------------\n");
			
			break;
		case 2:
			System.out.print("Enter Number: ");
			number = input.nextInt();
			System.out.print("Replace Object: ");
			Object ReplaceObject = input.next();
			
			
			Hash.replace(number, ReplaceObject);
			
			
			System.out.print("-------------------\n");
			System.out.println("Object List: \n" + Hash);
			System.out.print("-------------------\n");
			
			break;
		case 3:
			System.out.print("Search NumberID: ");
			int Search = input.nextInt();
			
			System.out.println("OBJECT NAME: "+Hash.get(Search));
			break;
		case 4:
			
			if (!Hash.isEmpty()) {
				System.out.print("Remove Something: ");
				number = input.nextInt();
				Hash.remove(number);
				System.out.println("An Object Has Been Removed!");
			} else {
				System.out.println("\nHash is already empty");
			}
		
			System.out.print("-------------------\n");
			System.out.println("Object List: \n" + Hash);
			System.out.print("-------------------\n");
			break;
		case 5:
			
			if (!Hash.isEmpty()) {
				Hash.clear();
				System.out.println("ALL OBJECTS WE'RE CLEARED!");
			} else {
				System.out.println("\nHash is already empty");
			}
			System.out.print("-------------------\n");
			System.out.println("Object List: \n" + Hash);
			System.out.print("-------------------\n");
			
			break;
		case 6:
			System.out.println("---EXIT HASH TABLE---");
			break;
		default:
			System.out.println("Invalid Choice!");
			break;
		}
		
		
		}while(choice!=6);
		
	}

}
