package za.ac.cput;


public class Student {

    private String name;
    private int age;
    private double yearStipend;

    public Student() {
        this.name = "Lilitha";
        this.age = 21;
        this.yearStipend = 1500.00;
    }

    public Student(String name, int age, double yearStipend) {
        this.name = name;
        this.age = age;
        this.yearStipend = yearStipend;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getYearStipend() {
        return yearStipend;
    }

    public void testWithTimeout(int noOfMonths) {
        yearStipend = yearStipend * noOfMonths;
        yearStipend = yearStipend - (noOfMonths - 2);
        System.out.println("Year stipend is calculated from February till November R " + yearStipend);
    }

    @Override
    public String toString() {
        return "Student{" + "Name :" + name + ", Age :" + age + ", Yearly stipend : " + yearStipend + "}";
    }

}





