
public final class BinomialFactoryTree {

	public static Node create(int T, int P){
		//Node emptynode=new Node(0,0);
		Node root=new Node(T,P);
		/*
		if(T==1){
			return root;
		}*/
		createnode(root, 0, T,P);
		return root;
	}
	
	public static void createnode(Node r,int count, int T, int P){
		//Counter adds up each iteration of Recursion. If it equals the Time, then it stops the loop.
		if(count==T){
			return;
		}

		r.setDown(new Node(count+1,P));
		r.setUp(new Node(count+1,P));
		
		createnode(r.getDown(),count+1, T,P);
		createnode(r.getUp(),count+1, T,P);
	}
}
