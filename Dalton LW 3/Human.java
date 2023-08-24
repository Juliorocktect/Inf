public class Human {
    private int height;
    private int age;
    private String name;
    private Sex sex;

    public Human(int height, int age, String name, Sex sex) {
        this.height = height;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public void ausgeben()
    {
        System.out.print("\n" + "Name: " + name + "\n" + "Age: " + age + "\n"+ "Height: " + height + "\n" + "Sex: " + sex + "\n");
    }
}
