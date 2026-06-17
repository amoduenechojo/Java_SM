package data.repository;
import data.db.DatabaseConnectionManager;
import data.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserRepository {

    public ResultSet createUsersTable(String tableName) throws SQLException {


        String username = "root";
        String password = "Godsplan.25.";
        String url = "jdbc:mysql://localhost:3306/safe_haven_db?createDatabaseIfNotExist=true";


        String sql = """
                CREATE TABLE users(
                    id int NOT NULL AUTO_INCREMENT,
                    name varchar(255),
                primary key (id)
                );""";


        try(Connection connection = DatabaseConnectionManager.connectToDatabase(username, password, url);){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();

            return readFromUsersTable(connection);
        }
    }


    public ResultSet readFromUsersTable(Connection connection) throws SQLException {
        String sql = "SELECT * FROM users" ;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        return preparedStatement.executeQuery();
    }

    public User save(User user) throws SQLException {

        String username = "root";
        String password = "Godsplan.25.";
        String url = "jdbc:mysql://localhost:3306/safe_haven_db?createDatabaseIfNotExist=true";

        try (Connection connection = DatabaseConnectionManager.connectToDatabase(username, password, url);){
            String sql = "INSERT INTO users (id, username) VALUES (?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2,  user.getName());
            preparedStatement.executeUpdate();

            ResultSet resultSet = readFromUsersTable(connection);
            User savedUser = new User();

            while(resultSet.next()){
                if(resultSet.isLast()){

                    savedUser.setId(resultSet.getInt("id"));
                    savedUser.setName(resultSet.getString("username"));
                }
            }

            return null;

        }
    }
}
