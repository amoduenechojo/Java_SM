package data.repository;


import data.entity.User;
import exception.TableCreationFailedException;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class UserRepositoryTest {

    private static final UserRepository userRepository = new UserRepository();

    @Test
    void testCanBuildTable(){

        String tableName = "users";

        try{
            ResultSet resultSet = userRepository.createUsersTable(tableName);
            assertNotNull(resultSet);
        }

        catch(SQLException e){
            throw new TableCreationFailedException(e.getMessage());

        }
    }


    @Test
    void testCanSaveUser() throws SQLException {

        User user = new User();
        user.setId(1000);
        user.setName("Chojo");

        data.entity.User savedUser = userRepository.save(user);
        assertNotNull(savedUser);
        assertEquals(1000,savedUser.getId());
        assertEquals("James",savedUser.getName());
    }
}
