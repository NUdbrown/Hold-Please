import java.util.Iterator;

import edu.neumont.util.Queue;


public class LinkedList<T> implements Queue<T>{
	

	private Node<T> currentNode, head, tail;
	

	
	public LinkedList(){
		setCurrentNode(null);
		head = null;
		tail = null;
	}

	
	@Override
	public Iterator<T> iterator() {
		setCurrentNode(head);
		
		return new LinkedListIterator<T>(this);
	}

	@Override
	public T poll() {
		T temp = null;
		
		if(head != null){
			temp = head.getValue();
			head = head.getAfterNode();
			setCurrentNode(head);
			return temp;
		}
		
		return temp;
	}

	@Override
	public boolean offer(T t) {

		if(head == null){
			head = new Node<T>(null, null, t);
			tail = head;
			
		}
		else{
			Node<T> node = new Node<T>(tail, null,t);
			tail.setAfterNode(node);
			tail=node;
			
		}
		
		return true;
	}

	@Override
	public T peek() {
		
		if(head != null){
			return head.getValue();
		}
		return null;
		
		
	}


	public Node<T> getCurrentNode() {
		return currentNode;
	}


	public void setCurrentNode(Node<T> currentNode) {
		this.currentNode = currentNode;
	}


	public Node<T> getHead() {
		return head;
	}


	public void setHead(Node<T> head) {
		this.head = head;
	}


	public Node<T> getTail() {
		return tail;
	}


	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	
}