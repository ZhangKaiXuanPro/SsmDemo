<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH",request.getContextPath());
%>>
<html>
<head>
    <title>login page</title>
    <link href="static/bootstrap-4.0.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
    <script src="static/jquery-3.3.1.min.js"></script>

</head>>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span8">
            <img src="" class="img-rounded" />
        </div>
        <div class="span4">
            <form class="form-horizontal">
                <div class="control-group">
                    <label class="control-label" for="inputEmail">账号</label>
                    <div class="controls">
                        <input id="inputEmail" type="text" />
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputPassword">密码</label>
                    <div class="controls">
                        <input id="inputPassword" type="password" />
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <label class="checkbox"><input type="checkbox" /> Remember me</label> <button type="submit" class="btn">登陆</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
