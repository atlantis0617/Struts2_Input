package org.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 674535438767368780L;
	
	private String username;
    private int age;
    
    public String save() {
    	 
        return SUCCESS;
         
    }
    
    @Override
    public void validate() {
    	 if (username == null || "".equals(username)) {
             this.addFieldError("username", "用户名不能为空");
         }
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
