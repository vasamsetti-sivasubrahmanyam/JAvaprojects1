<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
INSERTED OR NOT
 <c:forEach items="${two}" var="current" >
<tr>
         <c:out value="${current.id}"></c:out>
         <br></br>
         <c:out value="${current.name}"></c:out>
            <br></br>
         <c:out value="${current.age }"></c:out>
            <br></br>
         <c:out value="${current.salary }"></c:out>
            <br></br>
          
         <c:out value="${current.department}"></c:out>
         <br></br>
         <c:out value="${current.sex}"></c:out>
         <br></br>
        </tr>
</c:forEach>
</body>
</html>