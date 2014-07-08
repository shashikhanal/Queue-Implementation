/*
   @author Shashi Khanal
*/

import java.util.*;

class Queue
{
	int ele[]=new int[100];
	int size;
	int top;
	int rear;
	

	Queue(int limit)
	{
		size=limit;
		top=-1;
	}

	void pushitem(int value) {
		if (top < size - 1) {
			top++;
			ele[top] = value;//data pushed from top end
			System.out.println("Element " + value + " is pushed to Queue !");
		} else {
			System.out.println("Overflow !");
		}
	}

	int popitem() {
		if (top >= rear) {
			int a1=ele[rear];
			rear++;//data is popped from rear end
			System.out.println("Pop operation done !");
			return(a1);
		} else {
			System.out.println("Underflow !");
			return(-9999);
		}
	}

	void printwonder() {
		if (top >= rear) {
			System.out.println("Elements in Queue : ");
			for (int i = rear; i <= top; i++) {      //data is displayed from rear to top end
				System.out.println(ele[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter limit:");
		int l=ob.nextInt();
		Queue q = new Queue(l);
		char ch;
		do {
			System.out.println("Enter I(Insert)/R(Remove)/D(Display):");
			char x=ob.next().charAt(0);
			x=Character.toUpperCase(x);
			switch(x) {
				case 'I':System.out.println("Enter an element:");
					int z=ob.nextInt();
					q.pushitem(z);
					break;
				case 'R':System.out.println("Popped value="+q.popitem());
					break;
				case 'D':q.printwonder();
					break;
				}
			Scanner ob1=new Scanner(System.in);
			System.out.println("Do you want to continue?(Y/N):");
			ch=ob1.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}
