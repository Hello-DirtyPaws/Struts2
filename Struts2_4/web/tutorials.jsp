<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tutorials</title>
</head>
<body>
	<s:form method="post" action="addTutorial">
		<s:submit value="Add Tutorial"/>
	</s:form>
	<s:form method="post" action="getTutorial">
		<s:submit value="Get Tutorial"/>
	</s:form>
</body>
</html>