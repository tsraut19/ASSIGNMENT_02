class Star3{
	
	public static void main(String args[]){
	
		for (char i='E';i>='A';i--)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}

/*
OUTPUT:

*****
****
***
**
*

*/