public class Employee extends Human{
    private String chief;
    private String sector;
    private int monthlySalary;

    public Employee(int height, int age, String name, Sex sex, String chief, String sector, int monthlySalary) {
        super(height, age, name, sex);
        this.chief = chief;
        this.sector = sector;
        this.monthlySalary = monthlySalary;
    }

    public String getChief() {
        return chief;
    }

    public String getSector() {
        return sector;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public void ausgeben()
    {
        super.ausgeben();
        System.out.print("Chief: " + "\n" + "Sector: " + sector + "\n" + "Salary Per Month: " + monthlySalary + "\n");
    }
}
