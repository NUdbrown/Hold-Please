import java.util.Iterator;


public class ArraylistIterator<T> implements Iterator<T> {

	private ArrayList arrayList;

	
	public ArraylistIterator(ArrayList theList){
		this.arrayList = theList;
	}
	
	
	@Override
	public boolean hasNext(){
		
		boolean somethingThere = true;
		if(arrayList.size()==arrayList.getCurrentNode()){
			somethingThere = false;
		}			
		return somethingThere;
	}

	@Override
	public T next() {
		
		T[] list = (T[])arrayList.getList();
		T temp = list[arrayList.getCurrentNode()];
		arrayList.setCurrentNode(arrayList.getCurrentNode() + 1);
		
		return temp;
	}
	@Override
	public void remove() {
		
		
	}
	
	

}
