

public class Main {
    public static void main(String[] args) {

        BigBox<String, Integer> box = new BigBox<>("Name", 12);

        System.out.println(box);

        BigBox<Integer, box<Person>> box1 = new BigBox<>(12, new box<>("Old Box"));
        System.out.println(box1);
//        box<String> stringBox = new box<>("String Box");
//
//        box<Double> doubleBox = new box<>(12.3);
//
//        System.out.println(stringBox);
//        System.out.println(doubleBox);
        //no class mutha

    }
}
