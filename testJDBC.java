import javax.xml.transform.Result;
import java.sql.*;
import java.util.*;

public class testJDBC {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/marketDB","root","ralph2410");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM items");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("item_name") +" " + resultSet.getString("item_date") );
        }
        resultSet.close();
        statement.close();
        connection.close();

    }
}





