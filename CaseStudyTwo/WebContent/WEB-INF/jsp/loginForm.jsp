<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Form
<f:form commandName="shiva" action="${pageContext.request.contextPath}/shiva/login/insert" method="post">
<f:input path="id"/>
<br></br>
<f:input path="age"/>
<br></br>
<f:input path="name"/>
<font color='red'><f:errors path="name" cssClass="error"/></font>
<br></br>
<f:input path="salary"/>
<br></br>
<f:select path="department" multiple="multiple">
<f:option value="java">JAVA</f:option>
<f:option value="NET">DOTNET</f:option>
<f:option value="hybris">HYBRIS</f:option>
</f:select>
<br></br>
<f:radiobutton path="sex" value="M"/>Male 
<f:radiobutton path="sex" value="F"/>Female 
<br></br>
<f:checkbox path="lan" value="Java"/>Java 
<f:checkbox path="lan" value="C++"/>C++ 
<f:checkbox path="lan" value=".Net"/>.Net
<input type="submit" value="submit"/>
</f:form>
<a href="dispaly">display record</a>
</body>
</html>