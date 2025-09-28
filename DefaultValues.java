class DefaultValues {
    // Primitive data type members (not initialized)
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    // Method to display default values
    void displayDefaults() {
        System.out.println("Default values of Primitive Data Types:");
        System.out.println("byte    : " + b);
        System.out.println("short   : " + s);
        System.out.println("int     : " + i);
        System.out.println("long    : " + l);
        System.out.println("float   : " + f);
        System.out.println("double  : " + d);
        System.out.println("char    : '" + c + "'"); // empty character
        System.out.println("boolean : " + bool);
    }

    public static void main(String[] args) {
        // Create object of class
        DefaultValues obj = new DefaultValues();

        // Call method to print default values
        obj.displayDefaults();
    }
}
