
<%
        if ((session.getAttribute("uname") =="admin") || (session.getAttribute("pass") == "admin")) {
%>
Welcome <%=session.getAttribute("userid")%>
<a href='logout.jsp'>Log out</a>
<%} else {
%>
Welcome <%=session.getAttribute("userid")%>
<a href='admin.jsp'>Admin Panel</a>
<%
    }

%>