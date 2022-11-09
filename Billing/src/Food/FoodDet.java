package Food;
import java.util.*;

public class FoodDet {
	
	int Items,total,quantity,billId=0;
	float cgst,sgst,Op,sum;
	String i;
	Scanner scan=new Scanner(System.in);
	ArrayList<FoodDet> ob=new ArrayList<FoodDet>();
    HashMap<String,Float> Food=new HashMap<String,Float>();
	String key;float value;
    FoodDet obj;
	public HashMap<String, Float> insertFoodDet()
	{
		int n;
		System.out.println("Enter n:");
		n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the food name:");
			key=scan.next();
		
			System.out.println("Enter the food price:");
			value=scan.nextInt();
			Food.put(key,value);
			
		}
		return Food;
	}
		
	public void bill()
	{	
		billId=billId+1;
		System.out.println("BillId="+billId);
		System.out.println("Enter the no.of items:");
		Items=scan.nextInt();
		for(int j=1;j<=Items;j++)
		{
			obj=new FoodDet();
			System.out.println(" "+Food);
			System.out.println("Enter the items");
			i=scan.next();
			boolean bool=Food.containsKey(i);
			if(bool==true)
			{
				
				System.out.println("quantity");
				quantity=scan.nextInt();
			}
		
		System.out.println("Your Order");
		sum=(Food.get(i))*quantity;
		cgst=(sum*5)/100;
		sgst=(sum*5)/100;
		Op=sum+cgst+sgst;
		
		System.out.println(i+" "+quantity+ ":" +" "+ (Food.get(key))*quantity);
		
				System.out.println("Sum:"+sum);
				
				System.out.println("cgst:"+cgst);
				
				System.out.println("Sgst:"+sgst);
				
				System.out.println("Total:"+Op);
				ob.add(obj);
		}	
		         
				
	}
	
	public void search()
	{
		System.out.println("Enter the BillId to search:");
		billId=scan.nextInt();
		for(FoodDet eachFood:ob)
		{
			if(billId==eachFood.billId)
			  {
				 System.out.println(key+" "+quantity+ ":" +" "+ (Food.get(key))*quantity);
				 
					System.out.println("Sum:"+sum);
					
					System.out.println("cgst:"+cgst);
					
					System.out.println("Sgst:"+sgst);
					
					System.out.println("Total:"+Op);	
		}
	}
}
	public void showAll()
	{
		System.out.println("ShowAll");
		for(FoodDet eachFood:ob)
		{
	       	  
		}
	}
	
}
	
	
	
	
	
	
	
	


