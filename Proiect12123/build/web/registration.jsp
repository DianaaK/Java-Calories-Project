<%@ page import ="java.sql.*" %>
<%
    String user = request.getParameter("uname");    
    String pwd = request.getParameter("pass");
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String email = request.getParameter("email");
    String sex = request.getParameter("sex");
    String height = request.getParameter("height");
    String weight = request.getParameter("weight");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdname",
            "root", "");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into members(first_name, last_name, email, uname, pass, sex, height, weight) values ('" + fname + "','" + lname + "','" + email + "','" + user + "','" + pwd + "','" + sex + "','" + height + "','" + weight + "')");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>