package settests;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class SetTestsTest {

    public SetTestsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testSize() {
        SetTests instance = new SetTests(10);
        assertTrue(instance.size() == 10);
    }

    @Test
    public void testIsEmpty() {
        SetTests instance = new SetTests(10);
        assertTrue(!instance.isEmpty());
    }

    @Test
    public void testContains() {
        SetTests instance = new SetTests(10);
        Integer workInt = 5;
        assertTrue(instance.contains(workInt));
    }

    @Test(expected = NullPointerException.class)
    public void testContainsNull() {
        SetTests instance = new SetTests(10);
        Integer workInt = null;
        assertTrue(instance.contains(workInt));
    }

    @Test(expected = ClassCastException.class)
    public void testContainsWrongClass() {
        SetTests instance = new SetTests(10);
        String workString = "someString";
        assertTrue(instance.contains(workString));
    }

    @Test()
    public void testIterator() {
        SetTests instance = new SetTests(10);
        Iterator it = instance.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        assertFalse(instance.size() != 0);
    }

    @Test
    public void testToArray_0args() {
        SetTests instance = new SetTests(10);
        Object[] intArray = instance.toArray();
        assertTrue(intArray.length == instance.size());
    }

    @Test
    public void testToArray_ObjectArr() {
        SetTests instance = new SetTests(10);
        int expected = 15;
        Object[] intArray = instance.toArray(new Integer[15]);
        assertTrue(intArray.length == 15);
    }

    @Test(expected = NullPointerException.class)
    public void testToArray_ObjectArrNull() {
        SetTests instance = new SetTests(10);
        Integer[] nullArray = null;
        instance.toArray(nullArray);
    }

    @Test(expected = ArrayStoreException.class)
    public void testToArray_ObjectArrArrayStore() {
        SetTests instance = new SetTests(10);
        String[] stringArray = {"1", "2", "3", "4", "5"};
        instance.toArray(stringArray);
    }

    @Test
    public void testAdd() {
        SetTests instance = new SetTests(10);
        Integer workInt = 10;
        instance.add(workInt);
        assertTrue(instance.contains(workInt));
    }

    @Test(expected = NullPointerException.class)
    public void testAddNull() {
        SetTests instance = new SetTests(10);
        Integer workInt = null;
        instance.add(workInt);
    }

    @Test(expected = ClassCastException.class)
    public void testAddWrongClass() {
        SetTests instance = new SetTests(10);
        String workString = "someString";
        instance.add(workString);
    }

    @Test
    public void testRemove() {
        SetTests instance = new SetTests(10);
        Integer workInt = 5;
        instance.remove(workInt);
        assertFalse(instance.contains(workInt));
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveNull() {
        SetTests instance = new SetTests(10);
        Integer workInt = null;
        instance.remove(workInt);

    }

    @Test(expected = ClassCastException.class)
    public void testRemoveWrongClass() {
        SetTests instance = new SetTests(10);
        String workString = "someString";
        instance.remove(workString);

    }

    @Test
    public void testContainsAll() {

    }

    @Test(expected = NullPointerException.class)
    public void testContainsAllNull() {
        SetTests instance = new SetTests(10);
        Collection testCollection = null;
        instance.containsAll(testCollection);
    }

    @Test(expected = ClassCastException.class)
    public void testContainsAllWrongClass() {
        SetTests instance = new SetTests(10);
        Collection testCollection = new LinkedList();
        testCollection.add("someString");
        instance.containsAll(testCollection);
    }

    @Test
    public void testAddAll() {
        SetTests instance = new SetTests(10);
        Collection testCollection = new LinkedList();
        int expected = 25;
        for (int i = 10; i < 25; i++) {
            testCollection.add(i);
        }
        instance.addAll(testCollection);
        assertTrue(instance.size() == expected);
    }

    @Test(expected = NullPointerException.class)
    public void testAddAllNull() {
        SetTests instance = new SetTests(10);
        Collection testCollection = null;
        instance.addAll(testCollection);
    }

    @Test(expected = ClassCastException.class)
    public void testAddAllWrongClass() {
        SetTests instance = new SetTests(10);
        Collection testCollection = new LinkedList();
        testCollection.add("someString");
        instance.addAll(testCollection);
    }

    @Test
    public void testRetainAll() {
        SetTests instance = new SetTests(10);
        Collection testCollection = new LinkedList();
        List list = new LinkedList();

        for (int i = 0; i < 6; i++) {
            testCollection.add(i);
        }
        instance.retainAll(testCollection);
        assertTrue(instance.size() == testCollection.size());
    }

    @Test
    public void testRemoveAll() {
        SetTests instance = new SetTests(10);
        Collection testCollection = new LinkedList();
        boolean expected = true;
        for (int i = 0; i < 6; i++) {
            testCollection.add(i);
        }
        instance.removeAll(testCollection);
        for (int i = 0; i < 6; i++) {
            if (instance.contains(i)) {
                expected = false;
            }
        }
        assertTrue(expected);
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveAllNull() {
        SetTests instance = new SetTests(10);
        Collection testCollection = null;
        instance.removeAll(testCollection);
    }

    @Test(expected = ClassCastException.class)
    public void testRemoveAllWrongClass() {
        SetTests instance = new SetTests(10);
        Collection testCollection = new LinkedList();
        testCollection.add("someString");
        instance.removeAll(testCollection);
    }

    @Test
    public void testClear() {
        SetTests instance = new SetTests(10);
        instance.clear();
        assertTrue(instance.size() == 0);
    }
}
