class Star6{
public static void main(String args[]){

	for (int i=5;i>=1;i--)
	{
		for(int j=5;j>i;j--)
		{
		System.out.print(" ");//one spaces 
		}
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
			
		for (int j=2;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int j=5;j>=i;j--)
		{
		System.out.print(" ");//one spaces 
		}
			
		
		
	System.out.println();
	}
}
}

/*
OUTPUT:
*********
 *******
  *****
   ***
    *   
 
*/