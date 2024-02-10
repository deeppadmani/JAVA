
public class Main
{
    public static void main(String[] args)
    {
        String TableFormat = "(StID int(1) primary key NOT NULL AUTO_INCREMENT," + 
                             "RollNo int," + 
                             "FirstName varchar(50)," +
                             "LastName varchar(50))";
        
        MySQLDrivers SQLObject = new MySQLDrivers("jdbc:mysql://localhost:3306/","root","Deep@1313","testdatabase");
        SQLObject.CreateServerConnection();
     //   SQLObject.CreateMySQLDataBase();
        SQLObject.SelectDatabase();
      //  SQLObject.DropMySQLDataBase();
    //  SQLObject.CreateTable("StData",TableFormat);
   /*    SQLObject.InsertDataIntoTable("StData","(RollNo,FirstName,LastName)","50,'aaaa','Patel'");
      SQLObject.InsertDataIntoTable("StData","(RollNo,FirstName,LastName)","51,'bbbb','Patel'");
      SQLObject.InsertDataIntoTable("StData","(RollNo,FirstName,LastName)","52,'cccc','Patel'");
      SQLObject.InsertDataIntoTable("StData","(RollNo,FirstName,LastName)","53,'DEEP','DON'");*/
       SQLObject.SelectDataFromTable("*","StData");
      //System.out.println(SQLObject.TableRowCount("StData"));
      System.out.println("================================");
      SQLObject.SelectDataFromTable("*","StData","where LastName='DON'");
   //   SQLObject.DropTable("StData");  
        SQLObject.DeleteRecord("StData", "LastName='DON'");
        SQLObject.SelectDataFromTable("*","StData");

     
    }

   
}
