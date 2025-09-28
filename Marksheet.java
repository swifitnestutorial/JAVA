class Student {
    int rollNo;
    String name;
    int co, math, java, awt;   // Marks of 4 subjects

    // Constructor
    Student(int rollNo, String name, int co, int math, int java, int awt) {
        this.rollNo = rollNo;
        this.name = name;
        this.co = co;
        this.math = math;
        this.java = java;
        this.awt = awt;
    }

    // Method to calculate total marks
    int getTotal() {
        return co + math + java + awt;
    }

    // Method to calculate percentage
    double getPercentage() {
        return getTotal() / 4.0;
    }

    // Method to display Marksheet
    void displayMarksheet() {
        System.out.println("--------------------------------------------------");
        System.out.println("        Dr. BAMU University, Department: UDMS");
        System.out.println("             Class: MCA 1st Year");
        System.out.println("--------------------------------------------------");
        System.out.println("Roll No: " + rollNo + "\tName: " + name);
        System.out.println("--------------------------------------------------");
        System.out.println("Subjects\tMarks (out of 45)\tMinimum (18)");
        System.out.println("CO      \t" + co + "\t\t\t18");
        System.out.println("Math    \t" + math + "\t\t\t18");
        System.out.println("Java    \t" + java + "\t\t\t18");
        System.out.println("AWT     \t" + awt + "\t\t\t18");
        System.out.println("--------------------------------------------------");
        System.out.println("Total Marks: " + getTotal() + " / 180");
        System.out.printf("Percentage: %.2f%%\n", getPercentage());
        System.out.println("--------------------------------------------------");
    }
}

public class Marksheet {
    public static void main(String[] args) {
        // Create 5 student objects
        Student s1 = new Student(1, "Sandesh", 30, 35, 40, 55);
        Student s2 = new Student(2, "Kartiki", 25, 30, 35, 40);
        Student s3 = new Student(3, "Ankush", 40, 45, 35, 30);
        Student s4 = new Student(4, "Yash", 35, 40, 30, 25);
        Student s5 = new Student(5, "Prachi", 45, 40, 35, 30);

        // Display marksheet of each student
        s1.displayMarksheet();
        s2.displayMarksheet();
        s3.displayMarksheet();
        s4.displayMarksheet();
        s5.displayMarksheet();
    }
}
