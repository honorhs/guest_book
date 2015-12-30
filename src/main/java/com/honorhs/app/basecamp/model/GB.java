package com.honorhs.app.basecamp.model;

public class GB {
	private String email;
    private String password;
    private String password2;
    private String context;
    private String date_time;
    private String time_stamp;
    private int id;
    private String search;
    private boolean search_flag;

    public GB(){
    	this.email = null;
    	this.search_flag = true;
    }
    public GB(GB Item){
    	this.email = Item.getEmail();
    	this.email = Item.getpassword();
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getsearch() {
        return search;
    }
    public void setsearch(String search) {
        this.search = search;
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
    public String getpassword2() {
        return password2;
    }
    public void setpassword2(String password2) {
        this.password2 = password2;
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
    public void settime_stamp(String time_stamp){
    	this.time_stamp = time_stamp;
    }
    public String gettime_stamp(){
    	return time_stamp;
    }
    public void setsearch_flag(boolean search_flag){
    	this.search_flag = search_flag;
    }
    public boolean getsearch_flag(){
    	return search_flag;
    }
    public boolean check(){
    	if(this.email.isEmpty()){
    		return false; 
    	}
    	return true;
    }
}
