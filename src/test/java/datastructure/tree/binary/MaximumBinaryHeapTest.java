package datastructure.tree.binary;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MaximumBinaryHeapTest {

    @Test
    public void testIntegerAdd() {
        MaximumBinaryHeap<Integer> maximumHeap = new MaximumBinaryHeap<>();
        maximumHeap.add(5);
        maximumHeap.add(3);
        maximumHeap.add(7);
        maximumHeap.add(4);
        maximumHeap.add(6);
        maximumHeap.add(2);
        maximumHeap.add(8);
        maximumHeap.add(1);
        maximumHeap.add(9);

        maximumHeap.printHeap();

        Assert.assertTrue(maximumHeap.contains(5));
        Assert.assertTrue(maximumHeap.contains(9));
        Assert.assertFalse(maximumHeap.contains(0));
        Assert.assertFalse(maximumHeap.contains(10));
    }

    @Test
    public void testStringInsert() {
        MaximumBinaryHeap<String> maximumHeap = new MaximumBinaryHeap<>(String.class);

        maximumHeap.add("IBBS");
        maximumHeap.add("OrbiOne");
        maximumHeap.add("LDS");
        maximumHeap.add("PayableFinancing");
        maximumHeap.add("Astellas");
        maximumHeap.add("JVE");
        maximumHeap.add("LEMAP");
        maximumHeap.add("LEBCT");
        maximumHeap.add("TradeUtil");
        maximumHeap.add("Compass");

        maximumHeap.printHeap();

        Assert.assertTrue(maximumHeap.contains("Compass"));
        Assert.assertTrue(maximumHeap.contains("JVE"));
        Assert.assertFalse(maximumHeap.contains("COLT"));
        Assert.assertFalse(maximumHeap.contains("GRID"));
    }

    @Test
    public void testIntegerModify() {
        MaximumBinaryHeap<Integer> maximumHeap = new MaximumBinaryHeap<>();
        maximumHeap.add(5);
        maximumHeap.add(3);
        maximumHeap.add(7);
        maximumHeap.add(4);
        maximumHeap.add(6);
        maximumHeap.add(2);
        maximumHeap.add(8);
        maximumHeap.add(1);
        maximumHeap.add(9);

        maximumHeap.printHeap();
        Assert.assertTrue(maximumHeap.peek() == 9);

        maximumHeap.modify(0,0);

        maximumHeap.printHeap();
        Assert.assertTrue(maximumHeap.peek() == 8);

        Assert.assertTrue(maximumHeap.contains(0));
        Assert.assertFalse(maximumHeap.contains(9));
    }
}
