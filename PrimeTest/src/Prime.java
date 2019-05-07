import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prime {
	
    public static void main(String[] args) {

        Set<Integer> factors = new HashSet<Integer>(); 

    	System.out.println("Enter any integer. 1 means it's prime, and 0 means not prime.");
		
		Scanner input=new Scanner (System.in);
		int in=input.nextInt();
		
		int rem;    // rem= remainder
		boolean lag= true;   //lag..random name.
		boolean is_prime=true;

		 //Initially I had a while loop (see top) but, it wouldn't loop properly, so I had to use a bool //and a do-while loop.
		//do {
		
		//Loop won't say 2 is prime, so I had to make a condition for in==2.
		    if (in==2){
		    	
		//I put the 2 endl's to make it easier to read the outputs, else everything is clustered and messy
		    	System.out.println(1);
		    	is_prime=true;
		    }
		    
		    else 
		    { if (in<=1) {
		//If input is NOT equal to 1, then it will check else, and if input is 0 or 1, will output 0 (!prime). If not, will move on to the bool, and the other if statement.
		             	    	
		    	//cout<< 0 << endl<<endl;
		    	//return 0;
		    	System.out.println(0);
		    }
		//Here we set the bool lag to false. Inside else statement.
		        
		    lag=false;
		//If the bool is false, or not true, then it will execute the for loop.
	        
		    if (lag!=true) {
		    	for (int i=2; i<in; i++){

		//If the bool is false, then it will define i=2, and i<n. And for every iteration of the loop, it will add 1 to i. The var rem, is the remainder. It is remainder of in and i.

		    		rem=in%i;

		//The loop is going to add 1 to i, and keep finding the remain of in and i. Then, it will check the if statementIf the remainder is ever equal to 0 during each itereation, then it will print 0 (not prime).

		              
		    		if(rem==0){
		                
		    			//cout<<0<<endl<<endl;
		    			System.out.println(0);
				    	is_prime=false;

		    			//return 0;
		 //If the rem==0, it will print a 0, and then move to next line and break the for loop with command 'break'.
		                break;
		              
		    		}
		//If the remainder is not=0, then it will go to the second if statement.

		              
		    		if(i==in-1) {
		                
		    			//cout<< 1 << endl<<endl;
		    			System.out.println(1);
				    	is_prime=true;

		    			//return 1;
		              
		    		}
		           
		    	}
		    	
		    }
		    }
		    
		   
		//} while (in=input.nextInt());   //The loop will keep running as long as there is an input.
		    
		    //PRIME FACTORIZATION!
		    int hold=0;
		    if(is_prime==false) {
			    System.out.println("The Prime Factors of "+ in+ " are: ");

		    	for(int i=2; i<in+1; i++ ) {
		    		while(in%i == 0) {
			               //.out.println(i+" ");
			               factors.add(i);
			               in = in/i;
		    		}
		    	}
		         if(in >2) {
		            factors.add(in);

		         }
		    	System.out.println(factors);
		    }
		    
    }

	
}
