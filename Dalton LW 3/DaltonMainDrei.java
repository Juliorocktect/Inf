public class DaltonMainDrei {
    public static void main(String[] args) {
        String subjects[] = {"Math","English","Philosphy"};
        Student student = new Student(178,312,"David Humes", Sex.male,11,subjects);
        student.ausgeben();
        Employee employee = new Employee(178,312,"David Hume",Sex.male,"none","Philosphy",1000000);
        employee.ausgeben();
    }
}
