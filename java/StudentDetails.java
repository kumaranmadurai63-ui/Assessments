package java;


interface Student {
    void display();
}

class StudentDetails {
    public static void main(String[] args) {

        String name = "Anand";
        int age = 22;
        String department = "Java";

        Student s = () -> {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
        };

        s.display();
    }
}