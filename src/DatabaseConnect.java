/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chloe Larsen, Rene Kruger & Kayla Beyers
 */
import java.sql.*;
public class DatabaseConnect {
    private Connection conn = null;    
    private PreparedStatement stmt = null;
    private ResultSet resultSet = null;

    public DatabaseConnect(String dbName) {
        String driver = "jdbc:ucanaccess://" + dbName;
        try {
            conn = DriverManager.getConnection(driver);
            System.out.println("Connected");            
        }
        catch (SQLException e) {
            System.out.println("Cannot connect to database");
        }
    }
    
    public ResultSet query(String statement) throws SQLException{
        stmt = conn.prepareStatement(statement);
        resultSet = stmt.executeQuery();
        return resultSet; 
    }
    
    public void update(String update) throws SQLException{
        stmt = conn.prepareStatement(update);
        stmt.executeUpdate();
        stmt.close();
    }
}
