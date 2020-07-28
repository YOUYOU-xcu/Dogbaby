package com.zhang.you.bll;

import com.zhang.you.dal.DALBase;
import com.zhang.you.entity.Lanmu;


public class LanmuTree extends RecursionTree<Lanmu> {

	public LanmuTree(){
	
		setTextfieldname("title");
		
	}
	
	 public void toNonLeaf(String id){
		   
		    Lanmu m=(Lanmu)DALBase.load("lanmu", "where id="+id);
		    if(m!=null)
		    {
			    m.setIsleaf(0);
			    DALBase.update(m);
		    }
	  }
	
	
	
}
