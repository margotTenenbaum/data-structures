package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

class QueueTest {

    private Queue testQueue;
    @BeforeEach
    void setup() {
        testQueue = new Queue();
    }

    @Test
     void newQueueShouldExist() {
        Queue actual = new Queue();
        assertNotNull(actual);
    }

    @Test
    void newQueueShouldBeEmpty() {
        boolean expected = true;
        boolean actual = testQueue.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    void queueShouldNotBeEmptyAfterNodeAdded() {
        boolean expected = false;
        testQueue.add(3);
        boolean actual = testQueue.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    void peekShouldReturnFirstItemInQueue() {
        int expected = 3;
        testQueue.add(3);
        int actual = testQueue.peek();
        assertEquals(expected, actual);
    }

    @Test
    void removeShouldRemoveFirstItemInQueueAndReturnData() {
        testQueue.add(3);
        testQueue.add(4);
        int expected = 3;
        int actual = testQueue.remove();
        assertEquals(expected, actual);
        assertEquals(4, testQueue.peek());
    }
}