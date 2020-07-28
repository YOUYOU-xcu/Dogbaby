package com.zhang.you.bll;

import com.zhang.you.dal.DALBase;
import com.zhang.you.entity.Lanmu;
import com.zhang.you.entity.Spcategory;


public class SpcategoryTree extends RecursionTree<Spcategory> {

	public SpcategoryTree(){
	
		setTextfieldname("mingcheng");
		
	}
	
	 public void toNonLeaf(String id){
		   
		   Spcategory m=(Spcategory)DALBase.load("spcategory", "where id="+id);
		    if(m!=null)
		    {
			   // m.setIsleaf(0);
			    DALBase.update(m);
		    }
	  }
	
	
	
}
