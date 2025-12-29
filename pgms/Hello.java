package pgms;

public class Hello {
    public static void hello() {
        System.out.println("Hello World!");
        System.out.print("Hello, ");
        System.out.print("Java!\n");
    }
    public static void variables() {
        String name = "John";
        int age = 30;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
    }

    public static void array() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
    }
}
