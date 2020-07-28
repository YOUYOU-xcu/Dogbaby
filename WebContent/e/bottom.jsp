<%@page import="com.zhang.you.bll.FriendlinkBLL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
  
  <div class="wrap">
		<div class="frendlink">
			<strong>技术支持：</strong>
			
			  <%=FriendlinkBLL.getFriendLink() %>

		</div>


	</div>
	<div class="fn-clear"></div>
	<div>
		<div id="footer_bg">
			<div id="footer">请关注张佑的微信公众号：佑佑有话说</div>
		</div>
	</div>
	
</div>
	
