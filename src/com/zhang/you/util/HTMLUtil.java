package com.zhang.you.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLUtil {

	
	
	 public static String subStringInFilter(String content,int beginindex,int endindex){
		 
		  content=filterHTMLTag(content);
		  if(content.length()>(endindex-beginindex+1)){
			  
			 content=content.substring(beginindex, endindex)+"......";
			  
		  }
		  
		   return content;
		 
		 
	 }
	 public static String filterHTMLTag(String htmlStr){ 
	        String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //����script��������ʽ 
	        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //����style��������ʽ 
	        String regEx_html="<[^>]+>"; //����HTML��ǩ��������ʽ 
	         
	        Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE); 
	        Matcher m_script=p_script.matcher(htmlStr); 
	        htmlStr=m_script.replaceAll(""); //����script��ǩ 
	         
	        Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE); 
	        Matcher m_style=p_style.matcher(htmlStr); 
	        htmlStr=m_style.replaceAll(""); //����style��ǩ 
	         
	        Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE); 
	        Matcher m_html=p_html.matcher(htmlStr); 
	        htmlStr=m_html.replaceAll("").replaceAll("\\s*", ""); //����html��ǩ 
	       
	        return htmlStr.trim(); //�����ı��ַ��� 
	  } 
	
}
