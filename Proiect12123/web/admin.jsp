<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <form method="post" action="user.jsp">
            <center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Admin Panel</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Create Food Categories</td>
                        <td><input type="text" name="cfc" value="" /></td>
                    </tr>
                    <tr>
                        <td>Create Food</td>
                        <td><input type="text" name="cf" value="" /></td>
                    </tr>
                    <tr>
                        <td>Number of calories</td>
                        <td><input type="text" name="noc" value="" /></td>
                    </tr>
                    
                        <td><a href='admin.jsp'>Submit</a></td>
                        
                        <td><a href='logout.jsp'>Log out</a></td>
                        
                    </tr>
                    
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>
