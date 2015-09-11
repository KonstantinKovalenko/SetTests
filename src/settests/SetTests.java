/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settests;

import java.lang.reflect.Array;
import java.util.*;
import static mytoys.Print.*;

/**
 *
 * @author Admin
 */
public class SetTests {

    private static Set<Integer> testingSet = new TreeSet<>();
    private static final Collection collectionLL = new LinkedList();
    private static final Collection collectionSetString = new TreeSet();
    private static final Collection nullCollection = null;
    private static final Integer nullInteger = null;
    private static final String testString = "string";
    private static final Integer testInteger = 12345;
    private static final long testLong = 1231231231;
    private static Integer[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static void fillAllTestCollection() {
        testingSet.add(testInteger);
        collectionSetString.add(testString);
        collectionLL.add(new Integer(1));
    }

    private static void testAdd(Set inputSet, Object... args) {
        println("Starting testAdd");
        for (Object obj : args) {
            try {
                println(inputSet.add(obj));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        println("Ending testAdd " + inputSet);
    }

    private static void testAddAll(Set inputSet, Collection... args) {
        println("Starting testAddAll");
        for (Collection c : args) {
            try {
                println(inputSet.addAll(c));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        println("Ending testAddAll " + inputSet);
    }

    private static void testClear(Set inputSet) {
        println("Starting testClear");
        println(inputSet);
        inputSet.clear();
        println(inputSet);
        inputSet.add(testInteger);
        println("Ending testClear");
    }

    private static void testContains(Set inputSet, Object... args) {
        println("Starting testContains");
        for (Object obj : args) {
            try {
                println(inputSet.contains(obj));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        println("Ending testContains");
    }

    private static void testContainsAll(Set inputSet, Collection... args) {
        println("Starting testContainsAll");
        for (Collection c : args) {
            try {
                println(inputSet.containsAll(c));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        println("Ending testContainsAll");
    }

    private static void testEquals(Set inputSet, Object... args) {
        println("Starting testEquals");
        for (Object obj : args) {
            try {
                println(inputSet.equals(obj));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        println("Ending testEquals");
    }

    private static void testHashCode(Set inputSet, Object... args) {
        println("Starting testHashCode");
        for (Object obj : args) {
            try {
                inputSet.add(obj);
                println(inputSet.hashCode());
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        println("Ending testHashCode");
    }

    private static void testIsEmpty(Set inputSet) {
        println("Starting testIsEmpty");
        println("testingSet.clear()");
        inputSet.clear();
        println("testingSet.isEmpty()? " + inputSet.isEmpty());
        inputSet.add(testInteger);
        println("testingSet.add(testInteger)");
        println("testingSet.isEmpty()? " + inputSet.isEmpty());
        println("Ending testisEmpty");
    }

    private static void testIterator(Set inputSet) {
        println("Starting testIterator");
        Iterator iterator = inputSet.iterator();
        while (iterator.hasNext()) {
            println("Iterator.next() works " + iterator.next());
        }
        println("Ending testIterator");
    }

    private static void testRemove(Set inputSet, Object... removeArgs) {
        println("Starting testRemove");
        for (Object obj : removeArgs) {
            try {
                println(inputSet.remove(obj));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        inputSet.add(testInteger);
        println("Ending testRemove");
    }

    private static void testRemoveAll(Set inputSet, Collection... args) {
        println("Starting testRemoveAll");
        for (Collection c : args) {
            try {
                println(inputSet.removeAll(c));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        inputSet.add(testInteger);
        println("Ending testRemoveAll");
    }

    private static void testRetainAll(Set inputSet, Collection... args) {
        println("Starting testRetainAll");
        collectionLL.add(333);
        for (Collection c : args) {
            try {
                println(inputSet.retainAll(c));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        inputSet.add(testInteger);
        println("Ending testRetainAll");
    }

    private static void testSize(Set inputSet) {
        println("Starting testSize");
        inputSet.clear();
        println("testingSet.clear(), testingSet.size() = " + inputSet.size());
        for (int i = 1; i < 10; i++) {
            inputSet.add(i);
            println("testingSet.add(" + i + "), testingSet.size() = " + inputSet.size());
        }
        inputSet.clear();
        inputSet.add(testInteger);
        println("Ending testSize");
    }

    private static void testToArray(Set inputSet) {
        println("Starting testToArray");
        for (int i = 1; i < 10; i++) {
            inputSet.add(i);
        }
        println(inputSet.toArray());
        inputSet.clear();
        inputSet.add(testInteger);
        println("Ending testToArray");
    }

    private static void testToArray(Set inputSet, Object[] obj) {
        println("Starting testToArray");
        for (int i = 1; i < 5; i++) {
            inputSet.add(i);
        }
        println(inputSet.toArray(obj));
        inputSet.clear();
        inputSet.add(testInteger);
        println("Ending testToArray");
    }

    private static void testSpliterator(Set inputSet) {
        println("Starting testSpliterator");
        for (int i = 1; i < 5; i++) {
            inputSet.add(i);
        }
        try {
            Spliterator spliterator = inputSet.spliterator();
            println("spliterator.characteristics() = " + spliterator.characteristics());
            println("spliterator.estimateSize() = " + spliterator.estimateSize());
            spliterator.tryAdvance(null);
        } catch (Exception e) {
            System.err.println(e);
        }
        println("Ending testSpliterator");
    }

    public static void main(String[] args) {
        fillAllTestCollection();
        testAdd(testingSet, testInteger, testInteger, nullInteger, testString, testLong);
        //testAddAll(testingSet, testingSet, collectionLL, nullCollection, collectionSetString);
        //testClear(testingSet);
        //testContains(testingSet, nullInteger, testInteger, testString, new Integer(1));
        //testContainsAll(testingSet,testingSet,nullCollection,collectionLL,collectionSetString);
        //testEquals(testingSet,testString,testInteger,nullInteger);
        //testHashCode(testingSet,nullInteger,testInteger,new Integer(123));
        //testIsEmpty(testingSet);
        //testIterator(testingSet);
        //testRemove(testingSet,nullInteger,testInteger,new Integer(1),testString,collectionLL);
        //testRemoveAll(testingSet, nullCollection, collectionSetString, collectionLL, testingSet);
        //testRetainAll(testingSet, nullCollection, collectionSetString, collectionLL, testingSet);
        //testSize(testingSet);
        //testToArray(testingSet);
        //testToArray(testingSet,testArray);
        //testSpliterator(testingSet);
    }

}
