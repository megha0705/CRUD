 public  class Query{
   App a = new App();
   static String select = "SELECT * FROM  Employee";
   static String insert = "INSERT INTO Employee(id , name , email , salary) VALUES (? , ? , ? ,?)"; 
   static String desc = "DESC  Employee" ;
   static String delete =  "DROP TABLE Employee";
   static String update = "UPDATE Employee SET " + a.columnType()  + " = ? WHERE "+ a.conditionColumn()  +  " = ?";
   
 }