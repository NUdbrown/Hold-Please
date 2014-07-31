import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

	private LinkedList linked;
	
	public LinkedListIterator(LinkedList list){
		this.linked = list;
	}
	
	@Override
	public boolean hasNext(){
		
		boolean somethingThere = true;
		
		if(!(linked.getCurrentNode().getAfterNode() == null)){
			somethingThere = true;
		}
		else{
			somethingThere = false;
		}
				
		return somethingThere;
		
		//get the current node
		//if the currentNode has a next node then return true
		//if the currentNode does not have a next node then return false
	}

	@Override
	public T next() {
		Node<T> current = linked.getCurrentNode();
		
		
		if(linked.iterator().hasNext()){
			Node<T> temp = current.getAfterNode();
			temp = current;
			return (T) current;
		}
		//return current node
		//set next node to currentNode

		
		
		return (T) current;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
