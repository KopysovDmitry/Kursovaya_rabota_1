public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];
    private static int chuseDepart =1;
    private static int indexation = 10;
    private static int signalSalary= 80;

    public static void main(String[] args) {

        EMPLOYEES[0] = new Employee("Ivanov Ivan", 10, 1);
        EMPLOYEES[1] = new Employee("Petrov Petr", 20, 1);
        EMPLOYEES[2] = new Employee("Alekseev Aleksey", 30, 2);
        EMPLOYEES[3] = new Employee("Stasov Stas", 40, 2);
        EMPLOYEES[4] = new Employee("Ruslanov Ruslan", 50, 3);
        EMPLOYEES[5] = new Employee("Dmitriev Dmitry", 60, 3);
        EMPLOYEES[6] = new Employee("Olegov Oleg", 70, 4);
        EMPLOYEES[7] = new Employee("Igorev Igor", 80, 4);
        EMPLOYEES[8] = new Employee("Vladimirov Vladimir", 90, 5);
        EMPLOYEES[9] = new Employee("Checatillo Denis", 100, 5);

        printAllEmployears();
        int sumSalary = getSumSalary();
        System.out.println("");
        System.out.println("Сумма всех зарплат: " + +sumSalary + " тенге");
        System.out.println("");
        Employee employeeMinSalary = getMinSalaryEmpoloyee();
        System.out.println("Сотрудник с минимальной ЗП: " + employeeMinSalary);
        System.out.println("");
        Employee employeeMaxSalary = getMaxSalaryEmpoloyee();
        System.out.println("Сорудник с максимальной ЗП: " + employeeMaxSalary);
        System.out.println("");
        double averageSalary = getAverageSalary();
        System.out.printf("Средняя ЗП: %.1f%n", averageSalary);
        System.out.println("");
        printAllENames();
        System.out.println("");
        indexationSalary();
        System.out.println("");
        Employee employeeMinSalaryEmpoloyeeDepart = getMinSalaryEmpoloyeeDepart();
        System.out.println("Сотрудник с минимальной ЗП в департаменте: "+chuseDepart+ " : " +employeeMinSalaryEmpoloyeeDepart);
        Employee employeeMaxSalaryEmpoloyeeDepart = getMaxSalaryEmpoloyeeDepart();
        System.out.println("Сотрудник с минимальной ЗП в департаменте: "+chuseDepart+ " : " +employeeMaxSalaryEmpoloyeeDepart);
        int sumSalaryDepart = getSumSalaryDepart();
        System.out.println("Сумма ЗП по отделу: " + chuseDepart+ " - "+sumSalaryDepart);
        double averageSalaryDepart = getAverageSalaryDepart();
        System.out.println("Средняя ЗП по отделу: "+chuseDepart+" - "+averageSalaryDepart);
        indexationSalaryDepart();
        printAllEmployearsWhithLessSignalSalary();
        printAllEmployearsWhithMoreSignalSalary();
    }

    private static void printAllEmployears() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int getSumSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
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

    private static double getAverageSalary() {
        int count = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                count++;
            }
        }
        if (count != 0) {
            return (double) getSumSalary() / count;
        }
        return 0;
    }

    private static void printAllENames() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getName());
        }
    }

    // средняя сложность
    private static void indexationSalary() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() * indexation) / 100);
                System.out.println("Индексация ЗП на: " +indexation+ " процентов " +employee);
            }
        }
    }

    public static Employee getMinSalaryEmpoloyeeDepart() {
        int min = Integer.MAX_VALUE;
        Employee employeeMinSalaryEmpoloyeeDepart = null;
        for (Employee employee : EMPLOYEES) {
            if (employee.getNumberDepart() == chuseDepart) {
                if (employee != null && min > employee.getSalary()) {
                    min = employee.getSalary();
                    employeeMinSalaryEmpoloyeeDepart = employee;
                }
            }
        }
        return employeeMinSalaryEmpoloyeeDepart;
    }

    public static Employee getMaxSalaryEmpoloyeeDepart() {
        int max = Integer.MIN_VALUE;
        Employee employeemaxSalaryEmpoloyeeDepart = null;
        for (Employee employee : EMPLOYEES) {
            if (employee.getNumberDepart() == chuseDepart) {
                if (employee != null && max < employee.getSalary()) {
                    max = employee.getSalary();
                    employeemaxSalaryEmpoloyeeDepart = employee;
                }
            }
        }
    return employeemaxSalaryEmpoloyeeDepart;
    }
    private static int getSumSalaryDepart() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee.getNumberDepart() == chuseDepart) {
                if (employee != null) {
                    sum = sum + employee.getSalary();
                }
            }
        }
        return sum;
    }
    private static double getAverageSalaryDepart() {
        int count = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee.getNumberDepart() == chuseDepart) {
                if (employee != null) {
                    count++;
                }
            }
        }
        if (count != 0) {
            return (double) getSumSalaryDepart() / count;
        }
        return 0;
    }
    private static void indexationSalaryDepart() {
        for (Employee employee : EMPLOYEES) {
            if (employee.getNumberDepart() == chuseDepart) {
                if (employee != null) {
                    employee.setSalary(employee.getSalary() + (employee.getSalary() * indexation) / 100);
                    System.out.println("Проиндексировнааная зарплата сотрудника отдела: " + chuseDepart + " - " +employee);
                }
            }
        }
    }
    private static void printAllEmployearsWhithLessSignalSalary() {
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() <= signalSalary){
            System.out.println("Сотрудник с ЗП меньшей чем: " +signalSalary+ " - "+employee);
            }
        }
    }
    private static void printAllEmployearsWhithMoreSignalSalary() {
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() >= signalSalary){
                System.out.println("Сотрудник с ЗП большей чем: " +signalSalary+ " - "+employee);
            }
        }
    }

}