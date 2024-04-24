package kiemtra;

public class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public static void main(String[] args) {

        person person1 = new person("hoang", 19);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        person1.setAge(35);
        System.out.println("New age: " + person1.getAge());

        person1.setName("hoang");
        System.out.println("New name: " + person1.getName());
    }
}

