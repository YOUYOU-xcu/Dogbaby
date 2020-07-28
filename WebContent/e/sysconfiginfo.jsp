<%@page import="com.zhang.you.bll.*"%>
<%@page import="com.zhang.you.entity.*,com.zhang.you.dal.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <%
  
            String id=request.getParameter("id");
            if(id!=null){
            
                Sysconfig sysconfig=(Sysconfig)DALBase.load("sysconfig","where id="+id);
                
                if(sysconfig!=null)
                   request.setAttribute("sysconfig",sysconfig);
                
            }
  
   %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎您来到宠物商城</title>
<link rel="stylesheet" href="<%=SystemParam.getSiteRoot() %>/e/css/index.css" type="text/css"></link>
<link rel="shortcut icon" href="<%=SystemParam.getSiteRoot() %>/admin/images/zhangyou.ico" type="image/x-icon" />
<link rel="stylesheet" href="<%=SystemParam.getSiteRoot() %>/e/css/box.all.css" type="text/css"></link>

<link rel="stylesheet" href="<%=SystemParam.getSiteRoot() %>/e/css/leaveword.css" type="text/css"></link>


    <script src="<%=SystemParam.getSiteRoot() %>/webui/jquery/jquery-1.5.2.min.js" type="text/javascript"></script>
    <script type="text/javascript">
    
            $(function(){
               
            })
    
    
    </script>
    
    
    
   

    

</head>
<body>

	<jsp:include page="head.jsp"></jsp:include>
	
	<div class="wrap">
	  <div class="cover-title">
                   当前位置：<a href="<%=SystemParam.getSiteRoot() %>/e/index.jsp">首页</a> &gt;&gt; ${sysconfig.title}
      </div>
	</div>

	<div class="fn-clear"></div>
	
	<div class="wrap" >
		
		 
		   <div style="min-height: 600px;"  class="info">
                    <h1>
                           ${sysconfig.title}
                    </h1>
                    <h5>
                                                    
                    </h5>
                    <div class="news-content">
                       
                            ${sysconfig.dcontent}                          
                       
                    </div>               
                        
                </div>
 
	</div>
	
	<div class="fn-clear"></div>


	<jsp:include page="bottom.jsp"></jsp:include>



</body>
</html>