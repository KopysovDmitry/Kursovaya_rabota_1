import java.util.Arrays;

public class EmployeeList {
    private Employee[] Employears;
    int id=0;
    public EmployeeList(){
        this.Employears = new Employee[10];
    }
    public void addEmployee (String name, int salary, int numberDepart) {
        if (id >= Employears.length) {
            throw new RuntimeException("Список сотрудников заполнен");
        }
        Employee newEmployee = new Employee(name, salary,numberDepart);
        if (id < Employears.length) {
            Employears[id++] = newEmployee;
        }
    }
    public void printAllEmployears () {
        for (int i = 0; i < Employears.length; i++) {
            Employee employee = Employears[i];
            id = i+1;
            System.out.println("id : " + id + " " + employee.getName() + ": зарплата " + employee.getSalary()+" тенге, отдел №  " + employee.getNumberDepart());
        }
            System.out.println();

    }

    public void getSumSalary(){
        int sum =0;
        for (int i = 0; i < Employears.length; i++) {
            Employee emp = Employears[i];
            sum = sum + emp.getSalary();
        }
            System.out.print("Сумма всех зарплат: " + sum + " тенге");
        System.out.println();
    }
    public void getMinSalary(){
        int min = 1000000;
        for (int i = 0; i < Employears.length; i++) {
            Employee emp = Employears[i];
            if (min > emp.getSalary()) {
            min = emp.getSalary();
            }
        }System.out.println("Минимальная зарплата у сотрудника: "+ Employears[i] + min);
    }
}






