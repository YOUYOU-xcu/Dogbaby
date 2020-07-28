package com.zhang.you.uibuilder;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;

import com.zhang.you.bll.SystemParam;
import com.zhang.you.dal.DALBase;
import com.zhang.you.entity.Shangpin;
import com.zhang.you.entity.Spcategory;

public class SpcategoryBuilder {

	
	public String BuildNavMenu(){
		
		StringBuffer sb=new StringBuffer();
		List<Spcategory> list=DALBase.getEntity("spcategory", "");
		int i=0;
		for(Iterator<Spcategory> iterator = list.iterator();iterator.hasNext();){
		   
			if(i%4==0)
				sb.append("<ul>");
			Spcategory spc=iterator.next();
			sb.append(MessageFormat.format("<li><a href=''{0}/e/shangpinlist.jsp?spcid={1}''>{2}</a></li>",SystemParam.getSiteRoot(),spc.getId(),spc.getMingcheng()));
			
			i++;
			
			if(i%4==0)
				sb.append("</ul>");
			
			
		}
		return sb.toString();
		
		
		
	}
	
	
}
