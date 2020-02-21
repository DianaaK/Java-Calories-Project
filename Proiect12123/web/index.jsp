<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java_contact_app.myConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example</title>
    </head>
    <body>
        <form method="post" action="login.jsp">
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Yet Not Registered!! <a href="reg.jsp">Register Here</a></td>
                    </tr>
                    
                    <%
                        
                        try {
                            Connection con = myConnection.getConnection();
                            PreparedStatement ps;
                            ps=con.prepareStatement(DatabaseQuery.checkPass);
                            ps.setString(1,text);
                            ResultSet pass=ps.executeQuery();
            while(pass.next())
             if(!password.equals(pass.getString("password"))){
                 out.print("Sorry, email or password error");  
             } else {
                 out.println("You r successfully logged in");  
             }
        } catch (SQLException ex) {
            System.out.println("SQL Error");      
        }
                    %>
                    
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>
