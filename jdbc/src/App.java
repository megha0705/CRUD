import java.util.ArrayList;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("SELECT -> 1 || DELETE -> 2 || INSERT -> 3 || UPDATE -> 4 || DESC TABLE -> 5 || EXIT -> 6");
        Scanner sc = new Scanner(System.in);
        int choice =  sc.nextInt();
        boolean n = true;
        while(n){
            switch (choice) {
                case 1: ArrayList<Employee> l = EmployeeDao.selectEmployee();
                for(Employee m : l){
                    System.out.println(m);
                }
                break;
                case 2: System.out.println("are u sure you want to delete the table? Y/N");
                String s1 = sc.nextLine();
                if(s1 == "Y"){
                    EmployeeDao.deleteEmployee(); 
                }
                break;
                case 3 : System.out.println("id = ? || name = ? || email = ? || salary = ?");
                int id =  sc.nextInt();
                sc.nextLine(); //To get rid of the newline character "/n"
                String name = sc.nextLine();
                String email = sc.nextLine();
                int salary = sc.nextInt();
                Employee emp = new Employee(id , name , email, salary);
                EmployeeDao.createEmployee(emp); 
                break;
                /*case 4: System.out.println("what do u wanna update? 1 - id , 2 - name , 3 - email, 4 - salary. please provide the updated value too"); 
                        id = sc.nextInt();
                       sc.nextLine();
                        name = sc.nextLine();
                       Employee emp = new Employee(id , name);

                break;*/
                case 5 :  EmployeeDao.descEmployee(); 
                break;
                case 6: n = false;
                 break;
            }
            n = false;
        }
    }
}
