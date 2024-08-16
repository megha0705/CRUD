import java.util.ArrayList;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;


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
                case 4:  System.out.println("what column u wanna update ? 1 => name || 2 => email || 3 => salary || 4 => id");
                String columnType = " ";
                int num = sc.nextInt();
                if(num == 1){
                    columnType = "name";
                    System.out.println("write updated value");
                    name = sc.nextLine();
                }else if (num == 2){
                    columnType = " eamil";
                    System.out.println("write updated value");
                    email = sc.nextLine();
                }else if(num == 3){
                    columnType = "salary";
                    System.out.println("write updated value");
                    salary = sc.nextInt();
                }else{
                    columnType = "id";
                    System.out.println("write updated value");
                    id = sc.nextInt();
                }
                columnTypes(columnType);
                System.out.println("what is the condition column ? 1 => name || 2 => email || 3 => salary || 4 => id");
                String conditionColumn = " ";
                int nums = sc.nextInt();
                if(nums == 1){
                    conditionColumn = "name";
                    System.out.println("write condition value");
                    name = sc.nextLine();
                }else if (nums == 2){
                    conditionColumn = "email";
                    System.out.println("write condition value");
                    email = sc.nextLine();
                }else if (nums == 3){
                    conditionColumn = "salary";
                    System.out.println("write condition value");
                    salary = sc.nextInt();
                }else if(nums == 4){
                    conditionColumn = "id";
                    System.out.println("write condition value");
                    id = sc.nextInt();
                }
                conditionTypes(conditionColumn);
                
                break;
                case 5 : ArrayList<Employee> list =  EmployeeDao.descEmployee(); 
                        for(Employee descList : list){
                            System.out.println(descList.descTable());
                        }
                break;
                case 6: n = false;
                 break;
            }
            n = false;
        }
        
    }
   

    private static String columnTypes(String columnType) {
      
       return columnType;
    }


   

    public static String conditionTypes(String  conditionColumn) {
        
        return conditionColumn;
        
    }
   
   
}




