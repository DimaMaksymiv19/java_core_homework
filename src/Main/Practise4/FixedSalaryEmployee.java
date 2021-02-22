package Main.Practise4;

public class FixedSalaryEmployee extends Person implements Salary{

   private int salary;

    public FixedSalaryEmployee(String name, String surname, int age, int salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public void salaryUp(int delta) {
        salary += delta;

    }
}
