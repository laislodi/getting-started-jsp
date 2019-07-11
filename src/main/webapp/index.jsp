<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="com.jsp.Client" %>
<%@ page import="com.jsp.ClientHandler" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Simple JSP Application</title>
	</head>
	<body>
		<h1>Hello world!</h1>
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
		<%
		   long id = 1L;
           List<String> firstNameList = ClientHandler.createFirstNameList();
           List<String> lastNameList = ClientHandler.createLastNameList();

           for (int i = 0; i < 10; i++) {
           %>
           <tbody>
           <tr>
           <%
               Integer age = ClientHandler.randomAgeBetween20And60();
               String fullname = ClientHandler.randomFullname(firstNameList, lastNameList);
               StringBuilder document = ClientHandler.randomDocument();
               Client client = new Client(id++, fullname, document.toString(), age);
		%>
            <td><%=client.getId()%></td>
            <td><%=client.getName()%></td>
            <td><%=client.getDocument()%></td>
            <td><%=client.getAge()%></td>
           </tr>
       <%
       }
       %>
       </body>
       </table>

       <a href="sendForm.jsp">Go to form</a>
       
	</body>
</html>