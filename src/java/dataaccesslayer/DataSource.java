/**
 * File: DataSource.java
 * Name: Adrianne Huang
 * Date: August 2017
 * Description: Creates a connection to the potluckrecipes database.
 */
package dataaccesslayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

    private Connection connection = null;
    private final String connectionURL = "jdbc:mysql://localhost:3306/potluckrecipes";
    private final String username = "scott";
    private final String password = "tiger";

    /**
     * Empty constructor for DataSource class.
     */
    public DataSource() {
    }

    /**
     * Creates a connection to the members database.
     *
     * @return connection
     */
    public Connection createConnection() throws ClassNotFoundException {
        try {
            if (connection != null) {
                System.out.println("Cannot create new connection, one exists already");
            } else {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(connectionURL, username, password);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;

    }
}
