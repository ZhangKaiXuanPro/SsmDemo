<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>

    <title>Student list</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>

    <link rel="stylesheet"
          href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
    <script type="text/javascript"
            src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript"
            src="${APP_PATH}/static/jquery-3.2.1.min.js"></script>
</head>

<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <h1 class="text-center">
                这是一套可视化布局系统.
            </h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class=" btn btn-danger">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <button class="btn btn-primary">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-striped">
                <tr>
                    <th>学号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>年龄</th>
                    <th>电话</th>
                    <th>地址</th>

                </tr>
                <c:forEach items="${PageInfo.list}" var="stu">
                    <tr>
                        <th>${stu.studentid}</th>
                        <th>${stu.name }</th>
                        <th>${stu.sex}</th>
                        <th>${stu.age}</th>
                        <th>${stu.tel}</th>
                        <th>${stu.address}</th>
                        <th>
                            <button class=" btn btn-info btn-sm">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑
                            </button>
                            <button class="btn btn-primary btn-sm">
                                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                            </button>
                        </th>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <div class="row">
        <!-- 分页文字信息 -->
        <div class="col-md-6">
            <p>当前第${PageInfo.pageNum}页,共${PageInfo.pages}页,共${PageInfo.total }条记录</p>
        </div>
        <!-- 分页条信息 -->
        <div class="col-md-6">
            <nav aria-label="...">
                <ul class="pagination">
                    <li><a href="${APP_PATH}/stuList?pn=1">首页</a></li>
                    <!-- 如果是首页则禁止点击前一页 -->
                    <c:if test="${PageInfo.isFirstPage }">
                        <li class="disabled"><a href="#" aria-label="Previous"><span
                                aria-hidden="true">&laquo;</span></a></li>
                    </c:if>
                    <c:if test="${!PageInfo.isFirstPage }">
                        <li><a href="${APP_PATH}/stuList?pn=${PageInfo.prePage}"
                               aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
                    </c:if>

                    <!-- 显示连续的页面并使得当前页面为高亮 -->
                    <c:forEach items="${PageInfo.navigatepageNums }" var="pageNum">
                        <c:if test="${pageNum==PageInfo.pageNum }">
                            <li class="active"><a href="#">${pageNum }</a></li>
                        </c:if>
                        <c:if test="${pageNum!=PageInfo.pageNum }">
                            <li><a href="${APP_PATH}/stuList?pn=${pageNum}">${pageNum }</a></li>
                        </c:if>
                    </c:forEach>
                    <!-- 如果是末页则禁止点击后一页 -->
                    <c:if test="${PageInfo.isLastPage }">
                        <li class="disabled"><a href="#" aria-label="Next"><span
                                aria-hidden="true">&raquo;</span></a></li>
                    </c:if>
                    <c:if test="${!PageInfo.isLastPage }">
                        <li><a href="${APP_PATH}/stuList?pn=${PageInfo.nextPage}"
                               aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
                    </c:if>
                    <li><a href="${APP_PATH}/stuList?pn=${PageInfo.pages}">末页</a></li>
                </ul>
            </nav>
        </div>
    </div>

</div>
</body>
</html>
