package com.zhang.you.uibuilder;

import java.util.List;

import com.zhang.you.dal.DALBase;
import com.zhang.you.entity.Indexcolumns;

public class IndexColumnsBuilder {

	
	public String buildColumns(){
		
		int columncontentsize=10;
		StringBuffer sb=new StringBuffer();
		ShangpinBuilder shangpinbuilder=new ShangpinBuilder();
		List<Indexcolumns>  list=DALBase.getEntity("indexcolumns", "");
		for (Indexcolumns indexcolumns : list) {
			sb.append(shangpinbuilder.buildImageShangpin(indexcolumns.getColid(), columncontentsize));
			sb.append("\r\n");
			
		}
		return sb.toString();
		
		
	}
	
	
}
