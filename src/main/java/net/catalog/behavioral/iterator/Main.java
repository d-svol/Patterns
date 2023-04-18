package net.catalog.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"A","B","C"};
        Iterator iterator = new ArrayContainer(array);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
