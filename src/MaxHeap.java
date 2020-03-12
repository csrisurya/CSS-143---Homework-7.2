import java.util.Arrays;

public class MaxHeap implements Heap {
    int size;

    Integer[] data;

    public MaxHeap(int capacity) {
        data = new Integer[capacity];
        size = 0;
    }

    // build a heap based on data
    // to be implemented in O(nlogn)
    public void MaxHeapLogN(Integer[] data) {
        for(int i =0; i < data.length; i++){
            add(data[i]);
        }
    }

    // build a heap based on data
    // to be implemented in O(n)
    public void MaxHeapN(Integer[] data) {

    }

    private int parent(int index) {
        return (index-1)/2;
    }
    private int leftChild(int index){
        return (index*2) + 1;
    }
    private int rightChild(int index){
        return (index*2) + 2;
    }
    private void swap(int index1, int index2){
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
    public void heapifyUp(int index){
        if(index != 0 && data[index] > data[parent(index)]){
            swap(index, parent(index));
            heapifyUp(parent(index));
        }
    }
    // add an item to the heap
    public boolean add(Integer item) { 
        data[size] = item;
        heapifyUp(size);
        size++;
        return true;
    }

    // return the max item in the heap
    public Integer get() {
        return data[0];
    }

    // remove the root item
    public void heapifyDown(int index){ // work on this
        int smalllestIndex = index;
        int leftIndex = leftChild(index);
        int rightIndex = rightChild(index);
        if(leftIndex <= index && data[leftIndex] < data[smalllestIndex]){
            smalllestIndex = leftIndex;
        }
        if(rightIndex <= index && data[rightIndex] < data[smalllestIndex]){
            smalllestIndex = rightIndex;
        }
        if(smalllestIndex != index){
            heapifyDown(smalllestIndex);
        }
    }
    public Integer pop() { // work on this
        int root = data[0];
        swap(root, size-1);
        data[size-1] = null;
        size--;
        heapifyDown(size);
        return root;
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(5);
        Integer[] array = {2,5,6,8,4};
        heap.MaxHeapLogN(array);
        System.out.println(Arrays.toString(heap.data));


    }
}
