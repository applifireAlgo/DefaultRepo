<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Buzzor</title>
</head>
<body>
	<%
		String userAgent = request.getHeader("user-agent");
		if (userAgent != null && userAgent.matches(".*Mobile.*")) {
			request.getRequestDispatcher("/mobileindex.html").forward(request, response);
		} else {
			request.getRequestDispatcher("/webindex.html").forward(request, response);
		}
	%>
</body>
</html>