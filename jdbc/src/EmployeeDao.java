import java.sql.Statement;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao{
    

    public static ArrayList<Employee> selectEmployee() throws SQLException{
        ArrayList<Employee> emp_list = new ArrayList<Employee>();
        
            Connection con = Conn.connect();
            String query = Query.select;
            Statement stm = con.createStatement();
            ResultSet rs  =  stm.executeQuery(query);
       while(rs.next()){
           Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
           emp_list.add(emp);
        }
        stm.close();
         
        return emp_list;
    }

    public static void deleteEmployee() {
       try{
        Connection con = Conn.connect();
        String query = Query.delete;
        Statement stm =  con.createStatement();
        stm.execute(query);
        System.out.println("table is deleted succesfully");
       }catch(Exception e){
        e.printStackTrace();
       }
    }

    public static  void createEmployee(Employee emp) {
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
        try{
            Connection con = Conn.connect();
            String query = Query.desc;
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                /*System.out.println(rs.getString(1 ));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));*/

            }
        
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
