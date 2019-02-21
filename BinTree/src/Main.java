import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int level;
		int p;
		int iter;

		//Here I am asking the user to enter the desired number of levels the tree has
		System.out.print("Max Levels: ");
		level=input.nextInt();
		
		System.out.print("P: ");
		p=input.nextInt();
		
		System.out.print("Iterations: ");
		iter=input.nextInt();
		
		//Note line 22 wasn't working before because I didn't return the first node. 
		//After a great deal of headache I was able to figure out that the first node the root node had to be returned. 
		Node r= BinomialFactoryTree.create(level,p);

		//Initializes the navigate function. 
		Navigator.navigate(iter, r);
	
	}
}
