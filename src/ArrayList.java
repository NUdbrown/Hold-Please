import java.util.Iterator;

import edu.neumont.util.List;


public class ArrayList<T> implements List<T>{
	
	private T list [];  

	private int currentNode;
	
	//getter and setter
	
	public ArrayList(){
		T[] newList = (T[]) new Object[1];
		newList[0] = null;
		//set the list equal to the list to set it beginning position
	}

	@Override
	public Iterator<T> iterator() {
		setCurrentNode(0);
		
		
		//start at the head
		
		return new ArraylistIterator(this);
	}

	@Override
	public boolean add(T t) {
		boolean canAdd = false;
		T[] newList = (T[]) new Object[list.length + 1];
		//if there is nothing in the list add t to the first position in the list.
		if(list[0] == null){
			list[0] = t;
			canAdd = true;
		}
		//iterate through the list and copy it to the new list.
		else{
			for(int i = 0; i < list.length-1; i++){
				list[i] = newList[i];
			}
			
		//if there is make new a list and copy everything and increase the size by 1
			 newList[list.length +1]=t;
			canAdd = true;
		}
		//set old list to new list
		list = newList;
		
		return canAdd;
	}

	@Override
	public T get(int index) {
		return list[index];
	}

	@Override
	public boolean remove(T t) {

		return false;
	}

	@Override
	public int size() {

		return list.length;
	}

	public int getCurrentNode() {
		return currentNode;
	}

	public void setCurrentNode(int currentNode) {
		this.currentNode = currentNode;
	}

	public T[] getList() {
		return list;
	}

}
