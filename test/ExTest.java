package test;

public class ExTest {

	public static void main(String[] args)
	 {/*
	  try
	  {
	   int arr[]={1,2};
	   arr[2]=3/0;
	  }
	  catch(Exception e)    //This block handles all Exception
	  {
	   System.out.println("Generic exception");
	  }
	  catch(ArrayIndexOutOfBoundsException e)    //This block is unreachable
	  {
	   System.out.println("array index out of bound exception");
	  }
	 */
		try
		  {
		   int arr[]={5,0,1,2};
		   try
		   {
		    int x=arr[3]/arr[1];
		   }
		   catch(Exception ae)
		   {
		    System.out.println("divide by zero");
		   }
		   arr[4]=3;
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
		   System.out.println("array index out of bound exception");
		  }
		 }	

}
