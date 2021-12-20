<%@ page import="com.tutrit.java.quickstart.bean.Student" %>
<!DOCTYPE html>
<html lang=en>
<head>
    <meta charset=UTF-8>
    <title>timer</title>
</head>
<body align=center>
<h1> YES I AM! </h1>
<table align=center>
    <tr>
            <td>
                    <img src=https://upload.wikimedia.org/wikipedia/commons/2/26/MuhammadAvdol.png
                         width=300px
                         height=500px/>
                </td>
            <td>
                <%
                    Student s = (Student) request.getAttribute("student");
                    out.print(s.getName() + " " + s.getLastName());
                %>
                <br /> + </td>
        </tr>
</table>
</body>
</html>