class patt7{
	
	public static void main(String args[]){
	
		for (int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");//one spaces 
				
				
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");//star & space
				
				
			}
			System.out.println();
		}
	}
	
}


/*
OUTPUT:

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5  

*/