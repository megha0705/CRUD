import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDao{
    

    public static void selectEmployee(){
        try{
            Connection con = Conn.connect();
        String query = Query.select;
        Statement stm = con.createStatement();
        ResultSet rs  =  stm.executeQuery(query);
       while(rs.next()){
        System.out.println("id - >" + rs.getInt(1));
        System.out.println("name - >" + rs.getString(2));
        System.out.println("email - >" + rs.getString(3));
        System.out.println("salary - >" + rs.getInt(4));
       }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

    public static void deleteEmployee() {
       
    }

    public static void createEmployee(Employee emp) {
        try{
            Connection con = Conn.connect();
            String query = Query.insert;
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, emp.getId());
            pstm.setString(2, emp.getName());
            pstm.setString(3, emp.getEmail());
            pstm.setInt(4, emp.getSalary());
            pstm.execute();
            System.out.println("data inserted succesfully");
        }catch(Exception e){
            e.printStackTrace();
        }
       

    }

    public static void descEmployee() {
        
    }

}