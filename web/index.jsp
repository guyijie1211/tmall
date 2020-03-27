<%--
  Created by IntelliJ IDEA.
  User: 10560
  Date: 2020/3/24
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="heros" value="塔姆,艾克;巴德|雷克赛!卡莉丝塔" />

<c:forTokens items="${heros}" delims=",:;|!" var="hero">
  <c:out value="${hero}" /> <br />
</c:forTokens>
