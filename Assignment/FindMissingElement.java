package week1.Assignment;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int x [] = {1,2,3,4,6,7,8};
		 int sum=0;
		 int max=0;
		    for (int i = 0; i < x.length; i++) {

		    sum = sum + x[i];	
		 
		    if(x[i] > max) {
		    	max =  x[i];	
		    }
		    }
		   int missingNumber = (max*(max+1)/2)-sum ;
		   System.out.println("Missing number is "+ missingNumber);
		    
	
		   
}
}

