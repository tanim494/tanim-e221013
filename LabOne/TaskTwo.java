class Student {
    String name;
    String id;
    private double cgpa;

    public void setCgpa(double c) {
        this.cgpa = c;
    }

    public double getCgpa() {
        return this.cgpa;
    }
}

public class LabNine {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Tanim";
        s1.id = "E221013";
        s1.setCgpa(0.00);

        System.out.println("Student Info:");
        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
        System.out.println("CGPA: " + s1.getCgpa());
    }
}
