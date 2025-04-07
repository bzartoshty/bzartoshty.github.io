import java.util.*;


public class TestBST {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
		    new TestBST();
		  }

		  public TestBST() {
           
			 BST<Integer> tree = new BST<>();   
			  tree.insert(50);
			  tree.insert(30);
			  tree.insert(80);
			  
			  tree.insert(20);
			  tree.insert(40);
			  tree.insert(65);
			  tree.insert(90);
			  tree.insert(60);
			  tree.remove(50);

			  for(Integer e : tree) {
				  System.out.println(e);
			  }
			   
			  
			 
			    
			   
			   
		  }
		  
		

	}


