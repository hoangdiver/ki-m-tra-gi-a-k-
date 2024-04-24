package kiemtra;

public class Student extends person {
    private double math;
    private double physics;
    private double chemistry;

    public Student(String name, int age, double math, double physics, double chemistry) {
        super(name, age);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double diemTrungBinh() {
        return (math + physics + chemistry) / 3;
    }

    public static void main(String[] args) {
        Student student1 = new Student("hoang", 18, 8.5, 7.5, 9.0);

        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Toán: " + student1.getMath());
        System.out.println("Lý: " + student1.getPhysics());
        System.out.println("Hóa: " + student1.getChemistry());

        System.out.println("Điểm trung bình: " + student1.diemTrungBinh());
    }
}

