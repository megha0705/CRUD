import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("SELECT -> 1 || DELETE -> 2 || INSERT -> 3 || UPDATE -> 4 || DESC TABLE -> 5 || EXIT -> 6");
        Scanner sc = new Scanner(System.in);
        int choice =  sc.nextInt();
        boolean n = true;
        DB db = new DB();
        while(n){
            switch (choice) {
                case 1: db.selectTable();
                    break;
                case 2: System.out.println("are u sure you want to delete the table? Y/N");
                String s1 = sc.nextLine();
                if(s1 == "Y"){
                    db.deleteTable();
                }
                break;
                case 3 : System.out.println("id = ? || name = ? || email = ? || salary = ?");
                int id =  sc.nextInt();
                String name = sc.nextLine();
                String email = sc.nextLine();
                int salary = sc.nextInt();
                Employee emp = new Employee(id , name , email, salary);
                db.insertDate();
                break;
                case 4: System.out.println("column you want to upate "); // due
                break;
                case 5 : db.descTable();
                break;
                case 6: n = false;
                 break;
            }
        }
    }
}
