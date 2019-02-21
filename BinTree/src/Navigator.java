import java.util.Random;

public final class Navigator {

	//No need for any constructor. This navigator class will simply well, navigate.
	public static void navigate(int N, Node r){
		Node present=r;
		String dir = null;
		int number=0;
		Random num2=new Random();
		int p=r.getProbability();
		int level=r.getLevel();
		int counter=0;
		
		System.out.println("N/Iteration is:" +N);
		System.out.println("Level/Time is: " +level);

		
		//Starting from the root node, time zero, call the random function.  
		//If the number is between 0 and P, traverse to up-node for the next time period.  
		//If the number is between P and 100, traverse to down-node for the next time period.
	while(counter<N)	{
		for(int T=0; T<level; T++){
			//Generates a number between 0 and 100.
			number=num2.nextInt(101);
			if(number<=p){
				//If the number is between P and 100, traverse to down-node for the next time period.
				present=present.getUp();
				dir="Up";

			} else {
				//If the number is between P and 100, traverse to down-node for the next time period.
				present.getDown();
				dir="Down";

			}       
			//While traversing the binomial tree, print Time Period, value generated 
			//by the random function, and the movement (UP or DOWN)
			System.out.println("T is: "+ T + "\n Num2 is: "+number + "\n Direction: "+ dir );
		} counter++;

	}
	}
}
