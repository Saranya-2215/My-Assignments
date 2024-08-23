package week1.Assignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		 
		     int num= 29 ;
		    
		     boolean isPrimeNumber = false ;
		     
		for (int i = 2; i <= (num-1); i++) {
			
			if (num % i==0 ) {
				System.out.println(num + "is not a Prime Number");
				isPrimeNumber= true ;
							
			}
			
			if (isPrimeNumber == false) {
			System.out.println(num + "is a Prime Number");
		    break;
			}				
		}   		     
	}	
}


