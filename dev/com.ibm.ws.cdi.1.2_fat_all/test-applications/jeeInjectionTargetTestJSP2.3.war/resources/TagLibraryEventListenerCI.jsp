<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="listeners.JspCdiTagLibraryEventListenerCI" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP to test CDI 1.2 with a tag library event listener</title>
</head>
<body>
    <% out.println(request.getAttribute(JspCdiTagLibraryEventListenerCI.ATTRIBUTE_NAME)); %>
</body>
</html>