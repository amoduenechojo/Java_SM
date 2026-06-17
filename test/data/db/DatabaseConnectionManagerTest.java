package data.db;
import exception.DataConnectionException;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

public class DatabaseConnectionManagerTest {


    @Test
    public void testCanConnectToMySQLDatabase(){

        String username = "root";
        String password = "Godsplan.25.";
        String url = "jdbc:mysql://localhost:3306/safe_haven_db?createDatabaseIfNotExist=true";


        try(Connection connection = DatabaseConnectionManager.connectToDatabase(username, password, url);){

            assertNotNull(connection);
            assertTrue(connection.isValid(5));
        }

        catch(SQLException e){
            throw new DataConnectionException(e.getMessage());
        }

    }

}
