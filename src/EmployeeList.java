public class EmployeeList {
    private   Employee[] Employears;
    private int id;
    public EmployeeList(){
        this.Employears = new Employee[10];
    }

    public void addEmployee(String name, int salary, int numberDepart) {
            Employee emp = new Employee (name, salary, numberDepart);
            Employears[id++] = emp;
    }
    public void printAllEmployears () {
        for (int i = 0; i < id; i++) {
            Employee employee = Employears[i];
            System.out.println(employee.getName() + ": " + employee.getSalary() + ": " + employee.getNumberDepart());
        }
    }
    public void sumSalary(){
        int sum =0;
        for (int i = 0; i < id; i++) {
            Employee emp = Employears[i];
            sum = sum + emp.getSalary();
        }
            System.out.print(sum);
    }




}

