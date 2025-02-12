package Pertemuan2;

public class Node {
	private int nilai;
	private Node next;
	
	// inisialisasi Node
	public Node(int nilai) {
		this.nilai = nilai;
	}

	
	// Getter
	public int getNilai() {
		return nilai;
	}
	
	public Node getNext() {
		return next;
	}
	
	// Setter
	public void setNilai(int nilai) {
		this.nilai = nilai;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}

}
