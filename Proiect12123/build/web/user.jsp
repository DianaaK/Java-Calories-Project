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
                        <th colspan="2">Food Menu</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Search food</td>
                        <td><input type="text" name="sfood" value="" /></td>
                    </tr>
                    <tr>
                        <td>Calculate intake</td>
                        <td><input type="text" name="cintake" value="" /></td>
                    </tr>
                    <tr>
                        <td>Weight of food</td>
                        <td><input type="text" name="wfood" value="" /></td>
                    </tr>
                    
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>
