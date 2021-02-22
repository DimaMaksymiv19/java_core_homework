package Main.Practise4;

public class Start {
    public static void main(String[] args) {
        Salary fixedSalaryEmployee1 = new FixedSalaryEmployee("Mark","Jo",44, 1252);
        Salary fixedSalaryEmployee2 = new FixedSalaryEmployee("John","Jo",44, 1502);
        Salary hourlySalaryEmployee1 = new HourlySasaryEmployee("Ivan","Ivag", 30, 30,100);

        FinancialService finService = new FinancialService();
        Salary[] employees = {fixedSalaryEmployee1,fixedSalaryEmployee2,hourlySalaryEmployee1};

        for (Salary employee: employees){
            finService.pay(employee);
        }

    }
}
