public class Employee {
    private static int idGenerator =1;
    private String name;
    private int salary;
    private int numberDepart;
    private int id;
    public Employee(String name, int salary, int numberDepart) {
        this.name = name;
        this.salary = salary;
        this.numberDepart = numberDepart;
        this.id = idGenerator++;
    }
    public String getName() {
        return name;
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

    @Override
    public String toString (){
        return "id: " +id+", ФИО: "+name+", отдел: "+numberDepart+ ", ЗП: "+salary;
    }
}

