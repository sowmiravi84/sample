package Food;

import java.util.Scanner;

public class Main {
	
	 public static void main(String args[])
	 {
		 FoodDet obj=new FoodDet();
		 Scanner s=new Scanner(System.in);
		 int choice;
		 for(int i=0;;i++)
		 {
			 System.out.println("Enter your choice");
			 System.out.println("1.Insert Food and Price Menu");
			 System.out.println("2.Insert Bill");
			 System.out.println("3.Search Bill Id");
			 System.out.println("4.Show All");
			 System.out.println("5.Exit");
			 choice=s.nextInt();
			 
			 switch(choice)
			 {
			 case 1:
				 obj.insertFoodDet();
				 break;
		
			 case 2:
				 obj.bill();
				 break;
				 
			 case 3:
				 obj.search();
				 break;
				 
			 case 4:
				 break;
				 
			 case 5:
				 System.exit(0);
				 break;
				 
			 default:
				 System.out.println("Enter the valid number");
				 break;
				 
			 }
		 }
	 }

}
