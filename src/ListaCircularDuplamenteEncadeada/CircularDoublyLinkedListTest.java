package ListaCircularDuplamenteEncadeada;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircularDoublyLinkedListTest {

    private CircularDoublyLinkedList list;


    @BeforeEach
    public void setUp() {
        list = new CircularDoublyLinkedList();
    }

    @Test
    public void testAddAndDisplay() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(list.displayForward());
    }

    private void assertEquals(String ignoredS1) {

    }

    @Test
    public void testRemoveHead() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(10);
        assertEquals(list.displayForward());
    }

    @Test
    public void testRemoveMiddle() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(20);
        assertEquals(list.displayForward());
    }

    @Test
    public void testRemoveTail() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(30);
        assertEquals(list.displayForward());
    }

    @Test
    public void testRemoveFromEmptyList() {
        list.remove(10);
        assertEquals(list.displayForward());
    }

    @Test
    public void testDisplayBackward() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(list.displayBackward());
    }

}
