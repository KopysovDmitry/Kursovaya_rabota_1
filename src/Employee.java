public class Employee {
    private String name;
    private int salary;
    private int numberDepart;
    public Employee(String name, int salary, int numberDepart) {
        this.name = name;
        this.salary = salary;
        this.numberDepart = numberDepart;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getNumberDepart() {
        return numberDepart;
    }
    public void setNumberDepart(int numberDepart) {
        this.numberDepart = numberDepart;
    }
}

