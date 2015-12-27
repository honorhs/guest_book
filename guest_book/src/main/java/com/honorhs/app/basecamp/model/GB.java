package com.honorhs.app.basecamp.model;

public class GB {
	private String email;
    private String password;
    private String context;
    private String date_time;
    private int id;
//    private String timestamp;
     
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int Id) {
        this.id = Id;
    }
    public String getpassword() {
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public String getcontext() {
        return context;
    }
    public void setcontext(String context) {
        this.context = context;
    }
    public void setdate_time(String date_time){
    	this.date_time = date_time;
    }
    public String getdate_time(){
    	return date_time;
    }
}
