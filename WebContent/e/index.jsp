<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.zhang.you.uibuilder.*" %>
<%@page import="com.zhang.you.bll.*,java.util.*,java.text.*,com.zhang.you.entity.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎您来到宠物商城</title>

<link rel="stylesheet" href="<%=SystemParam.getSiteRoot() %>/e/css/index.css" type="text/css"></link>
<link rel="shortcut icon" href="<%=SystemParam.getSiteRoot() %>/admin/images/zhangyou.ico" type="image/x-icon" />
<link href="<%=SystemParam.getSiteRoot() %>/e/css/box.all.css"  rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="<%=SystemParam.getSiteRoot() %>/e/css/jquery.iFadeSlide.css" type="text/css"></link>
<link rel="stylesheet" href="<%=SystemParam.getSiteRoot() %>/e/css/lanmu.css" type="text/css"></link>
<link rel="stylesheet" type="text/css" href="<%=SystemParam.getSiteRoot() %>/e/css/carousel.css" />

<script src="<%=SystemParam.getSiteRoot() %>/webui/jquery/jquery-1.8.3.min.js" type="text/javascript"></script>
<script type='text/javascript' src='<%=SystemParam.getSiteRoot() %>/e/js/carousel.js'></script>

</head>
<body>

	<jsp:include page="head.jsp"></jsp:include>
	<div class="fn-clear">
	</div>
    
    <%=FocusgraphicBLL.getFocusgraphic() %>
	
  
	<div class="fn-clear"></div>
	<div class="wrap">
	  
	   <!-- 热卖商品信息   -->
	   <%ShangpinBuilder  shangpinbuilder=new ShangpinBuilder(); %>
	   <%=shangpinbuilder.buildHotSale()%>
	   
	   <!-- 推荐商品  -->
	   <%IndexColumnsBuilder icBuilder=new IndexColumnsBuilder();%>
	   <%=icBuilder.buildColumns() %>
	   
	  
	</div>
	

	<jsp:include page="bottom.jsp"></jsp:include>



</body>
</html>