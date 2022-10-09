package synthesizer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the ArrayRingBuffer class.
 * 
 * @author Josh Hug
 */

public class TestArrayRingBuffer {
    @Test
    public void someTest() {
        ArrayRingBuffer<Double> arb = new ArrayRingBuffer(10);
        arb.enqueue(1.);
        arb.enqueue(2.);
        arb.enqueue(3.);
//        arb.enqueue(4.);
//        arb.enqueue(5.);
//        arb.enqueue(6.);
        for (double x : arb) {
            for (double y : arb) {
                System.out.println("x: " + x + ", y:" + y);
            }
        }
    }

    /** Calls tests for ArrayRingBuffer. */
    public static void main(String[] args) {
        int[] someInts = new int[] { 1, 2, 3 };
        for (int x : someInts) {
            for (int y : someInts) {
                System.out.println("x: " + x + ", y:" + y);
            }
        }
        jh61b.junit.textui.runClasses(TestArrayRingBuffer.class);
    }
}
