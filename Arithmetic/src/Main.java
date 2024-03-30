import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Arithmetic a = new Arithmetic(3,2.5);
//        System.out.println(a.add());
//        System.out.println(a.subtract());
//        System.out.println(a.multiply());
//        System.out.println(a.divide());
//        System.out.println(a.getMin());
//        System.out.println(a.getMax());

        MyMap<String, Integer> maps = new MyMap<>();

        // Testing put method
        maps.put("laine", 10);
        maps.put("tristan", 20);
        maps.put("pooch", 30);
        maps.put("laine", 15); // Update value
        maps.put("tristan",1); // Update value

        // Testing get method
        System.out.println("Value for key 'laine': " + maps.get("laine")); // Output: 15
        System.out.println("Value for key 'tristan': " + maps.get("tristan")); // Output: 20
        System.out.println("Value for key 'squirtle': " + maps.get("squirtle")); // Output: null (key not found)
        System.out.println("Value for key 'tristan': " + maps.get("tristan")); // Output: 1

        // Testing remove method
        System.out.println("Removed value for key 'tristan': " + maps.remove("tristan")); // Output: 20
        System.out.println("Value for key 'tristan' after removal: " + maps.get("tristan")); // Output: null (key removed)
        System.out.println("Removed value for key 'squirtle': " + maps.remove("squirtle")); // Output: null (key not found)

    }
}