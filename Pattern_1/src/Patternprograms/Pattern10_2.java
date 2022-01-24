package Patternprograms;

public class Pattern10_2 {
	
		
	    public static void main(String[] args)
	    
	    {
	        
	        int rows = 8;
	        for (int i=rows; i>=1; i--)
	        {
	           
	            for (int k=1; k<=(i * 2) -1; k++) 
	            { 
	                System.out.print("*"); 
	            } 
	            System.out.println(); 
	           
	            for (int j=rows; j>=i; j--)
	            {
	                System.out.print(" ");
	            }
	            
	        }
	    }
	
}
	  


