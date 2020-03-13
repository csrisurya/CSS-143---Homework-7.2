import org.junit.Test;
import static org.junit.Assert.*;

public class MaxHeapTest {
    @Test
    public void testGet(){
        Integer[] data = {2,5,6,8,4};
        Integer expected = 8;

        MaxHeap heap1 = new MaxHeap(5);
        heap1.MaxHeapNLogN(data);
        assertEquals(expected, heap1.get());
        assertTrue(heap1.isValidHeap());


        MaxHeap heap2 = new MaxHeap(5);
        heap2.MaxHeapNLogN(data);
        assertEquals(expected, heap2.get());
        assertTrue(heap2.isValidHeap());

        assertEquals(heap1, heap2); // calls the equals() method in the MaxHeap class
    }
    @Test
    public void testAdd(){
        Integer[] data = {2,5,6,8,4};

        MaxHeap heap1 = new MaxHeap(6);
        heap1.MaxHeapNLogN(data);
        assertTrue(String.valueOf(true), heap1.add(9));
        assertTrue(heap1.isValidHeap());

        MaxHeap heap2 = new MaxHeap(6);
        heap2.MaxHeapN(data);
        assertTrue(String.valueOf(true), heap2.add(9));
        assertTrue(heap2.isValidHeap());

        assertEquals(heap1, heap2); // calls the equals() method in the MaxHeap class
    }
    @Test
    public void testPop(){
        Integer[] data = {2,5,6,8,4};
        Integer expected = 8;

        MaxHeap heap1 = new MaxHeap(5);
        heap1.MaxHeapNLogN(data);
        assertEquals(expected, heap1.pop());
        assertTrue(heap1.isValidHeap());


        MaxHeap heap2 = new MaxHeap(5);
        heap2.MaxHeapNLogN(data);
        assertEquals(expected, heap2.pop());
        assertTrue(heap2.isValidHeap());

        assertEquals(heap1, heap2); // calls the equals() method in the MaxHeap class
    }
    @Test
    public void testMaxHeapNLogN(){
        Integer[][] data = {
                {2,5,6,8,4},
                {1,2,3,4,5},
                {7,6,5,4,3}
        };
        for(Integer[] array : data){
            MaxHeap heap = new MaxHeap(5);
            heap.MaxHeapNLogN(array);
            assertTrue(heap.isValidHeap());
        }
    }
    @Test
    public void testMaxHeapLogN(){
        Integer[][] data = {
                {2,5,6,8,4},
                {1,2,3,4,5},
                {7,6,5,4,3}
        };
        for(Integer[] array : data){
            MaxHeap heap = new MaxHeap(5);
            heap.MaxHeapN(array);
            assertTrue(heap.isValidHeap());
        }
    }
}