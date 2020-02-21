package java_contact_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.lang.System.out;

public class Login {

    public boolean login(String email, String password){
        boolean success=false;
        try {
            Connection con = myConnection.getConnection();
            PreparedStatement ps;
            ps=con.prepareStatement(DatabaseQuery.checkPass);
            ps.setString(1,email);
            ResultSet pass=ps.executeQuery();
            while(pass.next())
                if(!password.equals(pass.getString("password"))){
                    System.out.println("Sorry, email or password error");
                } else {
                    System.out.println("You r successfully logged in");
                    success=true;
                }
        } catch (SQLException ex) {
            System.out.println("SQL Error");
            success=false;
        }
        return success;
    }

}
