package repeat2011;

/*
 * Code covers Question 4 part iv
 */
public class Question4{
	public static void main(String [] args){
		TreeSet <Integer> testSet = new TreeSet<>();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		testSet.add(4);
		testSet.add(2);
		
		System.out.println(testSet.contains(4));
	}
}
class TreeSet<T extends Comparable<T>> {
	private static class Node<T> { // node of binary search tree
		private T item; // data item
		private Node<T> left, right; //left and right subtrees
		Node (T item0, Node<T> left0, Node<T> right0) {
			item = item0; 
			left = left0; 
			right = right0;
			
		}
	}
	private Node<T> root = null; // root of tree
	private int numItems = 0; // number of nodes
	
	public boolean add(T t) { 
		int numItems0 = numItems; // initial number of nodes
		root = add(root,t);  // catering for possible new root
		return (numItems0<numItems); 
	} 

	private Node<T> add(Node<T> p, T t) { 
		// add t (if not present) to binary search tree rooted at p
		// & return root of new tree (which is usually p)
		if (p==null) { // tree empty 
			numItems++; 
			return new Node<T>(t,null,null);
		}
		else if ((p.item).compareTo(t)>0) {// t small, so add on left 			
			p.left = add(p.left,t);//note coding to handle any new root
			return p;
		}
		else if (t.compareTo(p.item)>0) { // t big, so add on right 			
			p.right = add(p.right,t);
			return p;
		}
		else // t present in node p, so no change 
			return p;
	}

	boolean contains(T t) {
		return contains(root,t);
	}

	private boolean contains(Node<T> nextNode, T t) { 
		if (nextNode == null) 
			return false;
		else if ((nextNode.item).equals(t))
			return true;
		else if ((nextNode.item).compareTo(t) < 0) 
			return contains(nextNode.right, t);
		else 
			return contains(nextNode.left, t);
	}
}
	