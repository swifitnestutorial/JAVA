class StaticDemo {
    // Static Variable (shared by all objects)
    static int count = 0;

    // Constructor
    StaticDemo() {
        count++;  // Increase count whenever an object is created
    }

    // Static Method
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    // Static Block
    static {
        System.out.println("Static Block Executed: Class Loaded into Memory!");
    }

    public static void main(String[] args) {
        // Static block will run automatically before main()

        // Create objects
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        // Call static method (no need of object)
        StaticDemo.displayCount();
    }
}
