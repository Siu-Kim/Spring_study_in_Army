<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
    <body>
        <div>
            <h1>Hello world!</h1>
            <%
                {
                java.lang.String welcome = (java.lang.String)request.getAttribute("welcome");
            %>
            <p>The server time is <%=welcome%></p>
            <%
                }
            %>
        </div>
    </body>
</html>
