

public class Node
{ 
	private int level;
	private int prob;
	private Node up;
	private Node down; 
	
	public Node(int T, int P)
	{
		level = T; 
		prob=P;
	    up = down = null;   
	}
	public void setDown(Node n)
	{
		down=n;
	}
	public void setUp(Node n){
		up=n;
	}
	public void setLevel(int T){
		level=T;
	}
	public void setProb(int probability){
		prob=probability;
	}
	
	public Node getDown(){
		return down;
	}
	public Node getUp(){
		return up;
	}
	public int getLevel() {
		// TODO Auto-generated method stub
		return level;
	}
	public int getProbability() {
		// TODO Auto-generated method stub
		return prob;
	}
} 