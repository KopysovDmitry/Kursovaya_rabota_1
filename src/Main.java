public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {

        EMPLOYEES[0] = new Employee("Ivanov Ivan", 10, 1);
        EMPLOYEES[1] = new Employee("Petrov Petr", 30, 1);
        EMPLOYEES[2] = new Employee("Alekseev Aleksey", 40, 2);
        EMPLOYEES[3] = new Employee("Stasov Stas", 50, 2);
        EMPLOYEES[4] = new Employee("Ruslanov Ruslan", 60, 3);
        EMPLOYEES[5] = new Employee("Dmitriev Dmitry", 70, 3);
        EMPLOYEES[6] = new Employee("Olegov Oleg", 80, 4);
        EMPLOYEES[7] = new Employee("Igorev Igor", 90, 4);
        EMPLOYEES[8] = new Employee("Vladimirov Vladimir", 100, 5);
        EMPLOYEES[9] = new Employee("Checatillo Denis", 110, 5);

        printAllEmployears();
        int sumSalary = getSumSalary();
        System.out.println("");
        System.out.println("Сумма всех зарплат: " +  +sumSalary +" тенге");
        System.out.println("");
        Employee employeeMinSalary = getMinSalaryEmpoloyee();
        System.out.println("Сотрудник с минимальной ЗП: " +employeeMinSalary);
        System.out.println("");
        Employee employeeMaxSalary = getMaxSalaryEmpoloyee();
        System.out.println("Сорудник с максимальной ЗП: "+employeeMaxSalary);
        System.out.println("");
        double averageSalary = getAverageSalary();
        System.out.printf("Средняя ЗП: %.1f%n",averageSalary);
        System.out.println("");
        printAllENames();
    }
    private static void  printAllEmployears() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }
    private static int getSumSalary () {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee !=null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }
    public static Employee getMinSalaryEmpoloyee() {
        int min = Integer.MAX_VALUE;
        Employee employeeMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && min > employee.getSalary()) {
                min = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }
    public static Employee getMaxSalaryEmpoloyee() {
        int max = Integer.MIN_VALUE;
        Employee employeeMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && max < employee.getSalary()) {
                max = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }
    private static double getAverageSalary () {
        int count =0;
        for (Employee employee:EMPLOYEES){
            if (employee !=null){
                count++;
            }
        }
        if (count !=0) {
            return (double) getSumSalary() / count;
        }
        return 0;
    }
    private static void  printAllENames() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getName());
        }
    }
}