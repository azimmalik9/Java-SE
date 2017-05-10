class Biggest{
public static void main (String x[])
{
	  // Finding the largest element
      
	  try{
	  int max = Integer.parseInt(x[0]);
	  if ((x.length) > 10)
		  {
			MoreThan10 e = new MoreThan10();
			throw e;
		}
      for (int i = 0; i < x.length; i++) 
	  {
	
		  
         if (Integer.parseInt(x[i]) > max) 
			 max = Integer.parseInt(x[i]);
      }
      System.out.println("Max is " + max);  
	  }
	  catch(MoreThan10 T)
	{
		System.out.println("Please provide 10 or less numbers");
	}
	catch(NumberFormatException e)
	{
		System.out.println("Please send only numberic values");
	}
	catch(Exception T)
	{
	System.out.println("something went wrong!");	
	}
	  

	
	}
}

class MoreThan10 extends Exception{
	
}

