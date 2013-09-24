<%@page language="java" contentType="text/html;charset=utf8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <title>login</title>
  </head>
  <body>
    <s:form action="login">
      <s:textfield name="username" key="user"/>
      <s:textfield name="password" key="pass"/>
      <s:submit key="login" value="login"/>
    </s:form>
  </body>
</html>