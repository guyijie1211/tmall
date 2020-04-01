<%--
  Created by IntelliJ IDEA.
  User: 10560
  Date: 2020/4/1
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>
<script>

</script>

<title>分类管理</title>

<div class="workingArea">
    <h1 class="label label-info">分类管理</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>图片</th>
                <th>分类名称</th>
                <!--                    <th>属性管理</th> -->
                <!--                    <th>产品管理</th> -->
                <th>编辑</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>
<%@include file="../include/admin/adminFooter.jsp"%>