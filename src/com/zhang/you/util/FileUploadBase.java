package com.zhang.you.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

public abstract class FileUploadBase{
    protected Map<String, String> parameters = new HashMap<String, String>();// ������ͨform�?��
    
    protected String encoding = "utf-8"; // �ַ�������ȡ�ϴ��?�ĸ��ʱ���õ���encoding

    protected UploadFileFilter filter = null; // �ļ�������
    
   
    protected int sizeThreshold = DiskFileItemFactory.DEFAULT_SIZE_THRESHOLD;

   
    protected long sizeMax = -1;

    protected File repository;
    
    public String getParameter(String key) {
        return parameters.get(key);
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }


    public long getSizeMax() {
        return sizeMax;
    }

    
    public void setSizeMax(long sizeMax) {
        this.sizeMax = sizeMax;
    }

    public int getSizeThreshold() {
        return sizeThreshold;
    }

    public void setSizeThreshold(int sizeThreshold) {
        this.sizeThreshold = sizeThreshold;
    }

   
    public File getRepository() {
        return repository;
    }

    public void setRepository(File repository) {
        this.repository = repository;
    }
    
    
    public Map<String, String> getParameters() {
        return parameters;
    }

   
    public UploadFileFilter getFilter() {
        return filter;
    }

  
    public void setFilter(UploadFileFilter filter) {
        this.filter = filter;
    }
    

    protected boolean isValidFile(FileItem item){
        return item == null || item.getName() == "" || item.getSize() == 0 || (filter != null && !filter.accept(item.getName())) ? false : true;
    }
}
 
 
 