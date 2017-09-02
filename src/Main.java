

public class Main {
    public static void main(String[] args) {

        BigBox<String, Integer> Box = new BigBox<>("Name", 12);

        System.out.println(Box);

        BigBox<Integer, Box<Person>> Box1 = new BigBox<>(12, new Box<>("Old Box"));
        System.out.println(Box1);
//        box<String> stringBox = new box<>("String Box");
//
//        box<Double> doubleBox = new box<>(12.3);
//
//        System.out.println(stringBox);
//        System.out.println(doubleBox);
        //your mom's house


    }
}
