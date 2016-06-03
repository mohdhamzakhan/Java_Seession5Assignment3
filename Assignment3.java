package session5;

import java.util.Scanner;

public class Assignment3 {
Assignment3(Double length, Double breath)
{
	System.out.println((length*breath));
}
public static void main(String args[])
{
	System.out.println("For Rectangle press 1 and for Square press 2");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	Double cho1;
	Double cho2;
	switch(choice)
	{
	case 1:System.out.println("Please enter lenght");
	cho1=sc.nextDouble();
	System.out.println("Please enter breath");
	cho2=sc.nextDouble();
		new Assignment3(cho1, cho2);
	break;
	case 2:System.out.println("Please enter lenght");
	cho1=sc.nextDouble();
		new Assignment3(cho1, cho1);
	}
	sc.close();
}
}