import java.util.*;
import java.io.*;

public class Heap{
	
	private int size=0;
	private int capacity=10;

	private int heap[] = new int[capacity];

	public int getParentIndex(int t){
		return (t-1)/2;
	}

	public int getLeftChildIndex(int t){
		return (2*t)+1;
	}

	public int getRightChildIndex(int t){
		return (2*t)+2;
	}

	public boolean hasParent(int t){
		return getParentIndex(t) >= 0;
	}

	public boolean hasLeftChild(int t){
		return getLeftChildIndex(t) < size;
	}

	public boolean hasRightChild(int t){
		return getRightChildIndex(t) < size;
	}

	public int parent(int t){
		return heap[getParentIndex(t)];
	}

	public int leftChild(int t){
		return heap[getLeftChildIndex(t)];
	}

	public int rightChild(int t){
		return heap[getRightChildIndex(t)];
	}

	public void ensureCapacity(){
		if(size==capacity){
			capacity *= 2;
			heap = Arrays.copyOf(heap, capacity);
		}
	}

	public void swap(int x, int y){
		int temp = heap[x];
		heap[x] = heap[y];
		heap[y] = temp;
	}

	public void heapifyUp(){
		int index = size-1;
		while(hasParent(index) && parent(index)>heap[index]){
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	public void addNode(int data){
		ensureCapacity();
		heap[size] = data;
		size++;
		heapifyUp();
	}

	public void heapifyDown(){
		int index = 0;
		while(hasLeftChild(index)){
			int swapchild = -1;
			if(hasRightChild(index))
				swapchild= (leftChild(index)<rightChild(index))?getLeftChildIndex(index):getRightChildIndex(index);
			else
				swapchild = getLeftChildIndex(index);

			if(heap[index]>heap[swapchild]){
				swap(index, swapchild);
				index = swapchild;
			}else
				break;
		}
	}

	public int getMinimum(){
		int data = heap[0];
		swap(0, size-1);
		size--;
		heapifyDown();
		return data;
	}

	//public static void

	public static void main(String[] args) {
		Heap h = new Heap();
		h.addNode(4);
		h.addNode(50);
		h.addNode(7);
		h.addNode(55);
		h.addNode(90);
		h.addNode(87);
		h.addNode(2);

		System.out.println(h.getMinimum());
	}
}