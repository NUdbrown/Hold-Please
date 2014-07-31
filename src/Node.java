
public class Node<T> {
	
	private T value;
	private Node<T> beforeNode, afterNode;
	
	public Node(Node<T> beforeNode, Node<T> afterNode, T value){
		this.beforeNode = beforeNode;
		this.afterNode = afterNode;
		this.value = value;
	}

	public Node<T> getBeforeNode() {
		return beforeNode;
	}

	public void setBeforeNode(Node<T> beforeNode) {
		this.beforeNode = beforeNode;
	}

	public Node<T> getAfterNode() {
		return afterNode;
	}

	public void setAfterNode(Node<T> afterNode) {
		this.afterNode = afterNode;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
