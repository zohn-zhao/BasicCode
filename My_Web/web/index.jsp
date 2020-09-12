<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.FileReader" %><%--
  Created by IntelliJ IDEA.
  User: Zohn zhao
  Date: 2020/9/9
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <% BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Zohn zhao\\Desktop\\小说阅读器\\资料\\books\\766\\"+"1_第一章 至尊归来.txt"));
    String br="";
    while((br +=bufferedReader.readLine())==null){}
    System.out.println(br);
  %>
  <%= br%>
  </body>
</html>
