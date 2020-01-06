<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link     href="<%=request.getContextPath() %>/css/index3.css"   rel="stylesheet"  type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
</head>
<body>
	<form id=form1 action="${pageContext.request.contextPath}/list" method="post">
		关键字：<input type="text" name="gjzi" value="${nianJian.gjzi}">
		描述：<input type="text" name="miaoshu" value="${nianJian.miaoshu}">
		<select name="name">
			<option>公司名称</option>
		</select><br>
		注册资本：<input type="text" name="ziben" value="${nianJian.ziben}">至<input type="text" name="ziben" value="${nianJian.ziben}">
		成立时间：<input type="text" name="creattime" value="${nianJian.creattime}">至<input type="text" name="creattime" value="${nianJian.creattime}">
		<input type="submit" value="查询">
	</form>
	<table>
		<tr>
			<td>编号</td>
			<td>关键字</td>
			<td>描述</td>
			<td>公司名称</td>
			<td>主营产品</td>
			<td>地址</td>
			<td>注册资本(万元)</td>
			<td>成立时间</td>
			<td>年检时间</td>
			<td>年检状态</td>
			<td>备注</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${info.list}" var="s"> 
			<tr>
				<td>${s.id}</td>
				<td>${s.gjzi}</td>
				<td>${s.miaoshu}</td>
				<td>${s.name}</td>
				<td>${s.chanpin}</td>
				<td>${s.ziben}</td>
				<td>${s.creattime}</td>
				<td>${s.nianjiantime}</td>
				<td>${s.nianjianzhuangtai}</td>
				<td>${s.beizhu}</td>
				<td>${s.dizhi}</td>
				<td>
					<input type="button" value="年检审核" onclick="update(${s.id})">
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				<jsp:include page="${pageContext.request.contextPath}/WEB-INF/pages2.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function goPage(page) {
		location="${pageContext.request.contextPath}/list?page="+page+"&"+$(#form1);
	}
	function update(id) {
		location="${pageContext.request.contextPath}/update?id="+id;
	}
</script>
</html>