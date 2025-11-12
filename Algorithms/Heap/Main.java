package Heap;
public class Main {

  
    

    public static void main(String [] args) throws Exception{
        Heap<Integer> heap = new Heap<>();
        heap.insert(2);
        heap.insert(1);
        heap.insert(3);

        System.out.println(heap.remove());

    }
}
