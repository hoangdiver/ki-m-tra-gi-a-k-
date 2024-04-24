package kiemtra;

public class Teacher extends person {
    private double hsl;
    private static final double LUONG_CO_BAN = 1800000;
    public Teacher(String name, int age, double hsl) {
        super(name, age);
        this.hsl = hsl;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public double tinhLuong() {
        return LUONG_CO_BAN * hsl;
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr.Binh", 35, 9.5);

        System.out.println("Name: " + teacher1.getName());
        System.out.println("Age: " + teacher1.getAge());
        System.out.println("HSL: " + teacher1.getHsl());

        System.out.println("Salary: " + teacher1.tinhLuong());
    }
}

