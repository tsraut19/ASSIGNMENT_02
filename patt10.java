class patt10{
public static void main(String args[]){

	for(char i='E';i>='A';i--){
		
		for(char j='A';j<=i;j++){
			System.out.print(" ");
		}
		
		for(char j='E';j>=i;j--){
				System.out.print(j+" ");
			
			}
		System.out.println();	
	}


}
}

/*
OUTPUT:
     E
    E D
   E D C
  E D C B
 E D C B A   
 
*/