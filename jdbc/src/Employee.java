public class Employee {
    private int id;
    private String name;
    private String email;
    private int salary;

    
    private String field;
    private String type;
    private String Null;
    private String  key;
    private String Default;
    private String extra;
   
    public Employee(int id, String name , String email , int salary){
        this.id = id;
        this.name = name;
        this.email =email;
        this.salary = salary;
    }
    public Employee(String field, String type , String Null , String key , String Default, String extra){
        this.field = field;
        this.type = type;
        this.Null = Null;
        this.key =  key;
        this.Default = Default;
        this.extra = extra;
    }
   
    public int getId(){
        return id;
    }
    public String  getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
   //we do not need to call the toString function java by default calls it
    public String toString(){
        return "Employee [id =" + id + " , name = " + name + "  , email = " +  email + ", salary =" +  salary +"]";
    }
    //to call other function we have to directly call it during printing
  public String descTable(){
    return "Employee [field =" + field + " , type = " + type + "  , null = " +  Null + ", key =" +  key + ",Defaut = " + Default + "  extra = " + extra+  "]";
    
  }
  

}
