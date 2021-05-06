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
}