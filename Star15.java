import java.util.Scanner;

class Star15
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0) 	System.out.print("*");
				else if(i==n-1)	System.out.print("*");
				else if(i==j)	System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}

/*


Enter number of rows to print
5
*
**
* *
*  *
*****




Enter number of rows to print
25
*
**
* *
*  *
*   *
*    *
*     *
*      *
*       *
*        *
*         *
*          *
*           *
*            *
*             *
*              *
*               *
*                *
*                 *
*                  *
*                   *
*                    *
*                     *
*                      *
*************************







Enter number of rows to print
25
*
**
* *
*  *
*   *
*    *
*     *
*      *
*       *
*        *
*         *
*          *
*           *
*            *
*             *
*              *
*               *
*                *
*                 *
*                  *
*                   *
*                    *
*                     *
*                      *
*************************


*/