package com.zhang.you.bll;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;

import com.zhang.you.dal.DALBase;
import com.zhang.you.entity.Jiaodiantu;
import com.zhang.you.entity.Notice;

public class FocusgraphicBLL {

	public static String getFocusgraphic()
	{
		StringBuffer sb = new StringBuffer();
		StringBuffer imagessb=new StringBuffer();
		StringBuffer titlesb=new StringBuffer();
		
		  sb.append("<div class=\"carousel\" >");
		  sb.append("<div class=\"car-big-picture\">");
		  
		  List<Jiaodiantu> list = DALBase.getTopList("jiaodiantu", "", 10); 
		  int i=0;
		  for (Iterator<Jiaodiantu> it = list.iterator(); it.hasNext();) { 
			  Jiaodiantu n = it.next(); 
			  String style=""; 
			  if(i++==0){ 
				  style=" style='display:block;'"; 
				  }
		  imagessb.append(MessageFormat.format("<a target=\"_blank\" href=''{0}''><img  {2}  src=\"{1}\"></a>", n.getHref(),n.getTupian(),style)); 
		  imagessb.append("\r\n");
		  
		  titlesb.append(MessageFormat.format("<p>{0}</p>",n.getTitle()));
		  
		  
		  } 
		  sb.append(imagessb); 
		  sb.append("</div>");
		  
		  sb.append("</div>");
		  
		return sb.toString();
		
	}
	
}
