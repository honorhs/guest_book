package com.honorhs.app.basecamp.model;

public class GB {
	private String email;
    private String password;
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/model/GB.java
=======
    private String password2;
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/model/GB.java
    private String context;
    private String date_time;
    private String time_stamp;
    private int id;
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/model/GB.java

    public GB(){
    	this.email = null;
=======
    private String search;
    private boolean search_flag;

    public GB(){
    	this.email = null;
    	this.search_flag = true;
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/model/GB.java
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
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/model/GB.java
=======

    public String getsearch() {
        return search;
    }
    public void setsearch(String search) {
        this.search = search;
    }
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/model/GB.java
    
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
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/model/GB.java
=======
    public String getpassword2() {
        return password2;
    }
    public void setpassword2(String password2) {
        this.password2 = password2;
    }
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/model/GB.java
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
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/model/GB.java
=======
    public void setsearch_flag(boolean search_flag){
    	this.search_flag = search_flag;
    }
    public boolean getsearch_flag(){
    	return search_flag;
    }
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/model/GB.java
    public boolean check(){
    	if(this.email.isEmpty()){
    		return false; 
    	}
    	return true;
    }
}
