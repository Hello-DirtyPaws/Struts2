<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
	<s:form method="post" action="search">
		<s:textfield label="Language" key="searchStr"/> 
		<s:submit value="search"/>
	</s:form>
</body>
</html>