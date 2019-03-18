<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>Student list</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <link href="${APP_PATH}/static/bootstrap-4.0.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}/static/bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
    <script src="${APP_PATH}/static/jquery-3.3.1.min.js"></script>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h1 class="text-center">
                这是一套可视化布局系统.
            </h1>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span6">
            <button class="btn" type="button">按钮</button>
        </div>
        <div class="span6">
            <button class="btn" type="button">按钮</button>
        </div>
    </div>
    <table class="table">
        <thead>
        <tr>
            <th>
                编号
            </th>
            <th>
                产品
            </th>
            <th>
                交付时间
            </th>
            <th>
                状态
            </th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                1
            </td>
            <td>
                TB - Monthly
            </td>
            <td>
                01/04/2012
            </td>
            <td>
                Default
            </td>
        </tr>
        <tr class="success">
            <td>
                1
            </td>
            <td>
                TB - Monthly
            </td>
            <td>
                01/04/2012
            </td>
            <td>
                Approved
            </td>
        </tr>
        <tr class="error">
            <td>
                2
            </td>
            <td>
                TB - Monthly
            </td>
            <td>
                02/04/2012
            </td>
            <td>
                Declined
            </td>
        </tr>
        <tr class="warning">
            <td>
                3
            </td>
            <td>
                TB - Monthly
            </td>
            <td>
                03/04/2012
            </td>
            <td>
                Pending
            </td>
        </tr>
        <tr class="info">
            <td>
                4
            </td>
            <td>
                TB - Monthly
            </td>
            <td>
                04/04/2012
            </td>
            <td>
                Call in to confirm
            </td>
        </tr>
        </tbody>
    </table>
    <p>
        <em>Git</em>是一个分布式的版本控制系统，最初由<strong>Linus Torvalds</strong>编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在Ruby社区中。
    </p>
    <div class="pagination">
        <ul>
            <li>
                <a href="#">首页</a>
            </li>
            <li>
                <a href="#">上一页</a>
            </li>
            <li>
                <a href="#">1</a>
            </li>
            <li>
                <a href="#">2</a>
            </li>
            <li>
                <a href="#">3</a>
            </li>
            <li>
                <a href="#">4</a>
            </li>
            <li>
                <a href="#">5</a>
            </li>
            <li>
                <a href="#">下一页</a>
            </li>
            <li>
                <a href="#">尾页</a>
            </li>
        </ul>
    </div>

</div>
</body>
</html>
