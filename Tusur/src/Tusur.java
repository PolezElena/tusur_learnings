import java.util.*;
public class Tusur 
{
	private static final int maxVal = 100;
	private static final int ArraySize = 10;
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		try
		{			
			int a, b;
			int[] nums = getArray(ArraySize, maxVal);
			
			printArray(nums);
			
			System.out.print("¬ведите a  (0 < a < b < " + maxVal + ") ");
			a = in.nextInt();
			MyException.check(0, maxVal, a);
			
			System.out.print("¬ведите b  (0 < a < b < " + maxVal + ") ");
			b = in.nextInt();
			MyException.check(a, maxVal, b);
			
			System.out.print("«начени€ в интервале (" + a + ", " + b + "):");
			
	        int max = -2147483647;
	        int min = 2147483646;
			
	        for (int i = 0; i < nums.length; i++)
	        {
	          if ((nums[i] <b)&&(nums[i] >a))
	          {
	              if  (max < nums[i])
	                  max = nums[i];
	             
	              if  (min > nums[i])
	                  min = nums[i];
	              
	        	  System.out.print(" " + nums[i]);  
	          }
	        }
	        System.out.println();
	        
			System.out.println("max: "+ max);
			System.out.println("min: "+ min);		
		}
		catch(MyException ex)
		{
			System.out.println(ex);
		}
		catch(java.util.InputMismatchException ex)
		{
			System.out.println(ex + ": „исло должно быть целым!");
		}
		in.close();
	}
	
	 public static int[] getArray(int sz, int max)
	  {
	    int[] array = new int[sz];
	   
	    for (int i = 0; i < array.length; i++)
	    {
	      array[i] = (int) Math.round((Math.random() * max));
	    }
	    
	    return array;
	  }
	 public static void printArray(int[] array)
	 {
		 System.out.print("nums:");
		 for(int i = 0; i < array.length; i++) 
		    { 
		      System.out.print(" " + array[i]);
		      
		    }
		 System.out.println("");
	 }
}
