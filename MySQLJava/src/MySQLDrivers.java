import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class MySQLDrivers
{
    Connection connection;
    Statement statement;
    String yourDatabaseName;
    String url;
    String user;
    String password;

    MySQLDrivers(String url,String user,String password,String yourDatabaseName)
    {
        this.url = url;
        this.user = user;
        this.password = password;
        this.yourDatabaseName = yourDatabaseName;
    }

    void  CreateServerConnection()
    {
        try 
        {
            connection=DriverManager.getConnection(this.url,this.user,this.password);
            statement = connection.createStatement();
            System.out.println("Connection Created..!!");
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    void  CreateMySQLDataBase()
    {
        try 
        {
            int status = statement.executeUpdate("CREATE DATABASE "+this.yourDatabaseName);
            if(status > 0) 
            {
                System.out.println(yourDatabaseName+" Database is created successfully !!");
            } 
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    void  SelectDatabase()
    {
        try 
        {
            int status = statement.executeUpdate("USE " + this.yourDatabaseName);
            if(status > 0) 
            {
                System.out.println(yourDatabaseName + " Selected ");
            } 
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    void  DropMySQLDataBase()
    {
        try 
        {
            int status = statement.executeUpdate("DROP DATABASE " + this.yourDatabaseName);
            System.out.println("Drop Table : " + status);
            if(0 == status) 
            {
                System.out.println(yourDatabaseName + " Database Dropped successfully !!");
            } 
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    void  CreateTable(String TableName,String TableFormat)
    {
        try 
        {
            int status = statement.executeUpdate("CREATE TABLE " + TableName + TableFormat);
            if(status == 0) 
            {
                System.out.println("Created table in " + this.yourDatabaseName);
            } 
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    void  InsertDataIntoTable(String TableName,String DataFormat,String Data)
    {
        try 
        {
            int status = statement.executeUpdate("INSERT INTO " + TableName + DataFormat + " VALUES(" + Data + ")");
            if(status > 0) 
            {
                System.out.println("Inserted record in " + TableName);
            } 
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    void  SelectDataFromTable(String DataSelect,String FromTableName)
    {
        SelectDataFromTable(DataSelect,FromTableName,"");
    }
    
    int TableRowCount(String TableName)
    {

        try 
        {
            ResultSet rs = statement.executeQuery("select * from "+ TableName);

            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            int column_count = rsmd.getColumnCount();
            return column_count;
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return 0;
        }
    }
 
    void  SelectDataFromTable(String DataSelect,String FromTableName,String whereData)
    {
        int column_count = TableRowCount(FromTableName);
        try 
        {
            ResultSet Rdata = statement.executeQuery("SELECT " + DataSelect + " FROM " + FromTableName +" "+ whereData);
            while(Rdata.next())
            {
                for(int Idx = 1;Idx <= column_count;Idx++)
                    System.out.print(Rdata.getString(Idx) + "  ");
                System.out.println();
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

     void  DropTable(String TableName)
    {
        try 
        {
            int status = statement.executeUpdate("DROP TABLE " + TableName);
            if(0 == status) 
            {
                System.out.println(yourDatabaseName + " Table Dropped successfully !!");
            } 
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    void DeleteRecord(String TableName, String where)
    {
        try 
        {
            int status = statement.executeUpdate("DELETE FROM " + TableName + " WHERE " + where);
            if(0 == status) 
            {
                System.out.println("Record Removed successfully !!");
            } 
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    void SetForeignKeys(String TableName, String ForeignKey,String ForeignTable,String references)
    {
        try 
        {
            int status = statement.executeUpdate("ALTER TABLE " + TableName + " ADD foreign key(" + ForeignKey + " references " + ForeignTable +"("+ references+")");
            if(0 == status) 
            {
                System.out.println("Set foreign key !!");
            } 
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }
};