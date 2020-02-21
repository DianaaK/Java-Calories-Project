package java_contact_app;


import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignIn {

    public boolean CheckEmailExists(Person newperson) {

        boolean emailExists = false;

        try {
            Connection con = myConnection.getConnection();
            PreparedStatement st = con.prepareStatement(DatabaseQuery.checkEmail);
            st.setString(1, newperson.getmEmail());
            ResultSet r1 = st.executeQuery();
            if (r1.next()) {
                emailExists = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Exception: " + e.toString());
        }

        return emailExists;
    }

    public boolean signin(int weight, String email, int age, String sex, int height, String lastname, String name, String password) {

        boolean success = false;
        Person newperson = new Person();
        try {
            newperson.setmWeight(weight);
            newperson.setmEmail(email);
            newperson.setmAge(age);
            newperson.setmSex(sex);
            newperson.setmHeight(height);
            newperson.setmLastname(lastname);
            newperson.setmName(name);
            newperson.setmPassword(password);


            Connection con = myConnection.getConnection();
            PreparedStatement ps;

            try {
                ps = con.prepareStatement(DatabaseQuery.insertUser);
                ps.setString(1, newperson.getmName());
                ps.setString(2, newperson.getmLastname());
                ps.setString(3, Integer.toString(newperson.getmAge()));
                ps.setString(4, newperson.getmSex());
                ps.setString(5, Integer.toString(newperson.getmHeight()));
                ps.setString(6, Integer.toString(newperson.getmWeight()));
                ps.setString(7, newperson.getmEmail());
                ps.setString(8, newperson.getmPassword());

                if (CheckEmailExists(newperson)) {
                    System.out.println("Email exists already");
                } else {
                    if (ps.executeUpdate() != 0) {
                        System.out.println("Account Created");
                        success = true;
                    } else {
                        System.out.println("Something's Wrong");
                    }
                }
            } catch (SQLException | NumberFormatException ex) {
                System.out.println("SQL error");
            }
        } catch (NumberFormatException ex) {
            System.out.println("All fields are required");
        }
        return success;
    }
}



