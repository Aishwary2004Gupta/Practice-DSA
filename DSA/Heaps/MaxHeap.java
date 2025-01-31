package Class;

public class MaxHeap {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(40);
        heap.insert(50);
        heap.insert(60);
        heap.insert(70);
        heap.insert(80);
        heap.insert(90);

        heap.display();
//        heap.extractMax();
        System.out.println("Largest element = " + heap.extractMax());
        System.out.println();
        heap.display();
    }

    int[] heap;
    int size;
    int maxSize;

    MaxHeap(int maxSize){
        this.maxSize = maxSize;
        this.heap = new int[maxSize];
        this.size = 0;
    }

    public int left(int pos){
        return (2 * pos) + 1;
    }
    public int right(int pos){
        return (2 * pos) + 2;
    }
    public int parent(int pos){
        return (pos - 1) / 2;
    }
    public void swap(int pos1, int pos2){
        int temp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = temp;
    }

    public void insert(int element) {
        if (size >= maxSize) {
            System.out.println("Heap is full. Cannot insert " + element);
            return;
        }
        int pos = size;
        heap[pos] = element;

        //check for the MaxHeap property
        while (heap[pos] > heap[parent(pos)]){
            swap(pos, parent(pos));
            pos = parent(pos); //moving up to the parent node
        }
        size++;
    }

    public int extractMax(){
        if (size <= 0) {
            System.out.println("Heap is empty. Cannot extract.");
            return -1; // Indicate error
        }

        int deleted = heap[0];
        heap[0] = heap[--size];
        heapify(0);
        return deleted;
    }

    protected void heapify(int index) {
        int leftChild = left(index);
        int rightChild = right(index);
        int largest = index;

        if (leftChild < size && heap[leftChild] > heap[largest]) {
            largest = leftChild;
        }

        if (rightChild < size && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }

        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    public void display(){
        for (int i = 0; i < size/2; i++){ //number of parent element
            System.out.println("Parent = " + heap[i] + "|");
            System.out.println("Left = " + heap[left(i)] + "|");
            System.out.println("Right = " + heap[right(i)] + "|");
            System.out.println();
        }
    }
}
