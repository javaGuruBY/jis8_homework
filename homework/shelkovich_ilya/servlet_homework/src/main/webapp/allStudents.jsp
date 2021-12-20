<%@ page import="com.tutrit.java.quickstart.bean.Student" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang=en>
<head>
    <meta charset=UTF-8>
    <title>timer</title>
</head>
<body align=center>
<h1> time is passing. people changed </h1>
<table align=center>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>lastName</th>
        <th>age</th>
    </tr>

    <%
        List<Student> studentList = (List<Student>) request.getAttribute("studentList");
        for (Student s : studentList) {
            out.println(
                    "    <tr>\n" +
                            "        <td>" + s.getId() + "</td>\n" +
                            "        <td><a href=\"/register/student?id="+ s.getId() + "\">"  + s.getName() + "</a></td>\n" +
                            "        <td>" + s.getLastName() + "</td>\n" +
                            "        <td>" + s.getAge() + "</td>\n" +
                            "    </tr>\n");
        }
    %>

    <tr>
        <th>id</th>
        <th>name</th>
        <th>lastName</th>
        <th>age</th>
    </tr>
</table>
</body>
</html>
