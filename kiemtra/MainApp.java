package kiemtra;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        person[] persons = new person[5];
        input(persons);
        print(persons);
    }

    public static void input(person[] persons) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < persons.length; i++) {
            System.out.print("Nhập thông tin cho ");
            if (i < 3) {
                System.out.println("Học sinh #" + (i + 1));
            } else {
                System.out.println("Giáo viên #" + (i - 2));
            }

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            if (i < 3) { 
                System.out.print("Điểm Toán: ");
                double math = scanner.nextDouble();
                scanner.nextLine(); 

                System.out.print("Điểm Lý: ");
                double physics = scanner.nextDouble();
                scanner.nextLine(); 

                System.out.print("Điểm Hóa: ");
                double chemistry = scanner.nextDouble();
                scanner.nextLine(); 

                persons[i] = new Student(name, age, math, physics, chemistry);
            } else { 
                System.out.print("Hệ Số Lương (HSL): ");
                double hsl = scanner.nextDouble();
                scanner.nextLine(); 

                persons[i] = new Teacher(name, age, hsl);
            }
        }
        scanner.close();
    }

    public static void print(person[] persons) {
        System.out.println("thông tin sau khi hoàn tất:");
        for (person person : persons) {
            if (person instanceof Student) {
                System.out.println("Student:");
                System.out.println("Name: " + person.getName());
                System.out.println("Age: " + person.getAge());
                System.out.println("Toán: " + ((Student) person).getMath());
                System.out.println("Lý: " + ((Student) person).getPhysics());
                System.out.println("Hóa: " + ((Student) person).getChemistry());
                System.out.println("Điểm trung bình: " + ((Student) person).diemTrungBinh());
                System.out.println();
            } else if (person instanceof Teacher) {
                System.out.println("Teacher:");
                System.out.println("Name: " + person.getName());
                System.out.println("Age: " + person.getAge());
                System.out.println("Hệ Số Lương (HSL): " + ((Teacher) person).getHsl());
                System.out.println("Lương: " + ((Teacher) person).tinhLuong());
                System.out.println();
            }
        }
    }
}
