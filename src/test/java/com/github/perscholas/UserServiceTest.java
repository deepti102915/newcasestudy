package com.github.perscholas;


import com.github.perscholas.controller.HomeController;
import com.github.perscholas.model.User;
import com.github.perscholas.service.UserService;
import org.junit.Assert;
import org.junit.Test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UserServiceTest {
    @Test
    public void test() {
        HomeController controller = new HomeController();
        // when
        List<User> expectedUserList = new ArrayList<>();

        // then
        Connection conn = null;
        String url ="jdbc:mysql://127.0.0.1:3306/dshopping?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String userName="root";
        String password ="DakshaHello";
        Statement stmt = null;
        String query = "Select * from dShopping.user";
        //String inserted = "INSERT INTO dShopping.USER VALUES ('11', 'ani@gmail.com', 'Anil', '123')";
        List<User> actualUser = new ArrayList<>();
        try{
        conn = DriverManager.getConnection(url,userName, password);
        System.out.println("Connection Established: "  + conn);

        stmt = conn.createStatement();
        //stmt.executeUpdate(inserted);
        ResultSet resultSet = stmt.executeQuery(query);
            User user = new User();
            while(resultSet.next()) {
                user.setEmail(resultSet.getString("email"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
            }
            actualUser.add(user);

            User user2 = new User();
            user2.setEmail("ani@gmail.com");
            user2.setName("Anil");
            user2.setPassword("123");
            expectedUserList.add(user);

        } catch(Exception ex) {
            throw new Error(ex);
        }
        Assert.assertArrayEquals(expectedUserList.toArray(), actualUser.toArray());
    }
}