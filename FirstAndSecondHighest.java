class FirstAndSecondHighest{
public static void main (String x[])
{

	  // Finding the largest element
      
	  try{
	  int highest = Integer.MIN_VALUE;	  
	  int second_highest = Integer.MIN_VALUE;	  
	  if ((x.length) > 10)
		  {
			MoreThan10 e = new MoreThan10();
			throw e;
		}
      for (int i = 0; i < x.length; i++) 
	  {			
         if (Integer.parseInt(x[i]) > highest) 		 
			 highest = Integer.parseInt(x[i]);			 		 
      }
	  
	  for (int j = 0; j < x.length; j++) 
	  {			
         if (Integer.parseInt(x[j]) != highest && Integer.parseInt(x[j]) > second_highest) 		 
			 second_highest = Integer.parseInt(x[j]);			 		 
      }
	  
	  
	  
	   
	  
      System.out.println("highest is " + highest);  
	System.out.println("second_highest is " + second_highest);  	  
	  }
	  catch(MoreThan10 T)
	{
		System.out.println("Please provide 10 or less numbers");
	}
	catch(NumberFormatException e)
	{
		System.out.println("Please send only numberic values");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("work this one out");
	}
	catch(Exception T)
	{
	System.out.println("something went wrong!");	
	}
	  

	
	}
}