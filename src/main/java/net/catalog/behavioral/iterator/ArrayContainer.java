package net.catalog.behavioral.iterator;

public class ArrayContainer implements Iterator{
    String[] array;
    int index;

    public ArrayContainer(String[] array) {
        this.array = array;
    }


    @Override
    public Object next() {
        if(hasNext()){
            int temp = index;
            index++;
            return array[temp];
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return (index < array.length ? true : false);
    }
}
