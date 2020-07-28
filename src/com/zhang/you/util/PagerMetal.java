package com.zhang.you.util;

public class PagerMetal {
	
	private int pagesize=10;
	
	private int totalcount;
	
	private int curpageindex=1;

	public PagerMetal(int pagesize,int totalcount){
		this.pagesize=pagesize;
		this.totalcount=totalcount;
	}
	public PagerMetal(int totalcount){
		this.totalcount=totalcount;
	}
	
	public int getPagesize() {
		return pagesize;
	}
	
	public int getTotalPages()
	{
		return (totalcount+pagesize-1)/(pagesize);
	}
    
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
   
	public int getTotalcount() {
		return totalcount;
	}
   
	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}

	public int getCurpageindex() {
		return curpageindex;
	}
    
	public void setCurpageindex(int curpageindex) {
		this.curpageindex = curpageindex;
	}
	

}
