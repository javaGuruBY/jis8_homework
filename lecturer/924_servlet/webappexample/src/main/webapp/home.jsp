<%@ page import="java.time.Instant" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: idea
  Date: 24.09.21
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H1> Hello! I'm Jsp</H1>
<%
        Instant time = (Instant) request.getAttribute("UTC-time");
%>
<H1>current time in UTC is ${UTCtime.toString()}</H1>
</body>
</html>
