package oop.intro13_generics.task;

public class PairMain {
    public static void main(String[] args) {
        var pair = new Pair<>(1, "Test");

        System.out.println(pair);
        pair.setFirst(123);
        pair.setSecond("Second string");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
