package settests;

import java.util.*;

public class SetTests implements Set {

    public Set<Integer> testSet = new TreeSet();

    public SetTests(int setSize) {
        for (int i = 0; i < setSize; i++) {
            testSet.add(i);
        }
    }

    @Override
    public int size() {
        return testSet.size();
    }

    @Override
    public boolean isEmpty() {
        return testSet.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return testSet.contains(o);
    }

    @Override
    public Iterator iterator() {
        return testSet.iterator();
    }

    @Override
    public Object[] toArray() {
        return testSet.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return testSet.toArray(a);
    }

    @Override
    public boolean add(Object e) {
        return testSet.add((Integer) e);
    }

    @Override
    public boolean remove(Object o) {
        return testSet.remove(o);
    }

    @Override
    public boolean containsAll(Collection c) {
        return testSet.containsAll(c);
    }

    @Override
    public boolean addAll(Collection c) {
        return testSet.addAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return testSet.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return testSet.removeAll(c);
    }

    @Override
    public void clear() {
        testSet.clear();
    }
}
