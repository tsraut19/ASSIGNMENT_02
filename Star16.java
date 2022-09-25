import java.util.Scanner;

class Star16
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows tp print");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==n-1){System.out.print("*");}
				else if(i==n){System.out.print("*");}
				else if((j+i)==n){System.out.print("*");}
				else {System.out.print(" ");}
							
			}
			if(i!=n)
				System.out.println();
		}
	}
}



/*

OUTPUT:


Enter a number of rows tp print
10
         *
        **
       * *
      *  *
     *   *
    *    *
   *     *
  *      *
 *       *
**********


*/