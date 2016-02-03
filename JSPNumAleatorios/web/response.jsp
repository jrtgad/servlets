<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Números aleatorios</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="jsp.RandomNumber" />
        <jsp:setProperty name="mybean" property="number" />
        <ul>
            <li><jsp:getProperty name="mybean" property="number" /></li>
            <li><jsp:getProperty name="mybean" property="number" /></li>
            <li><jsp:getProperty name="mybean" property="number" /></li>
            <li><jsp:getProperty name="mybean" property="number" /></li>
            <li><jsp:getProperty name="mybean" property="number" /></li>
            <li><jsp:getProperty name="mybean" property="number" /></li>
            <li><jsp:getProperty name="mybean" property="number" /></li>
            <li><jsp:getProperty name="mybean" property="number" /></li>
            <li><jsp:getProperty name="mybean" property="number" /></li>
            <li><jsp:getProperty name="mybean" property="number" /></li>
        </ul>
    </body>
</html>
