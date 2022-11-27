public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();


        employeeList.addEmployee("Ivanov Ivan", 10, 1);
        employeeList.addEmployee("Semenov Semen",20,1);
        employeeList.addEmployee("Petrov Petr",30,2);
        employeeList.addEmployee("Alekseev Aleksey",40,2);
        employeeList.addEmployee("Stasov Stas",50,3);
        employeeList.addEmployee("Ruslanov Ruslan",60,3);
        employeeList.addEmployee("Dmitriev Dmitry",70,4);
        employeeList.addEmployee("Olegov Oleg",80,4);
        employeeList.addEmployee("Igorev Igor",90,5);
        employeeList.addEmployee("Vladimirov Vladimir",100,5);

        employeeList.printAllEmployears();

         employeeList.getSumSalary();

         employeeList.getMinSalary();





    }
}