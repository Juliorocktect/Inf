public class Student extends Human{
    private int schoolClass;
    private String subjects[];

    public Student(int height, int age, String name, Sex sex,int schoolClass, String subjects[]) {
        super(height, age, name, sex);
        this.schoolClass = schoolClass;
        this.subjects = subjects;
    }

    public void changeYear(int years)
    {
        schoolClass += years;
    }
    public int getSchoolClass() {
        return schoolClass;
    }

    public String[] getSubjects() {
        return subjects;
    }
    private String printSubjects()
    {
        String val = "";
        for (int i = 0;i < subjects.length;i++){
            val += " ";
            val += subjects[i];
            val += "\n";
        }
        return val;
    }
    public void ausgeben()
    {
        super.ausgeben();
        System.out.print("school class: " + schoolClass + "\n" + "Subjects: \n" + printSubjects());
    }
}
