class Star8{
	
	public static void main(String args[]){
	
		for (char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (char i='E';i>='A';i--)
		{
			for(char j='B';j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}

/*
OUTPUT:
*
**
***
****
*****
****
***
**
*

*/