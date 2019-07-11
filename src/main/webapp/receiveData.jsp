<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="com.jsp.Client" %>
<%@ page import="com.jsp.ClientHandler" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
	<title>Receiving Data From Form</title>
</head>
<body>
	<h1>Data Received</h1>
	<h2>Current time is <%= LocalDateTime.now() %></h2>
	<table>
	<thead>
	    <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Document</td>
            <td>Age</td>
	    </tr>
	</thead>
   <tbody>
   <tr>
	<%
		long id = 1L;
	%>
	    <td><%=id%></td>
	    <td><%=request.getParameter("name")%></td>
	    <td><%=request.getParameter("document")%></td>
	    <td><%=request.getParameter("age")%></td>
   </tr>
   </body>
   </table>

   <p>The information came via <%=request.getMethod()%>.</p>

</body>
</html>