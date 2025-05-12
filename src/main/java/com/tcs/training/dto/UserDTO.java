package com.tcs.training.dto;

import com.tcs.training.Entity.User;

public class UserDTO {
 User user;
 String msg;
 public UserDTO() {}
public UserDTO(User user, String msg) {
	super();
	this.user = user;
	this.msg = msg;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
@Override
public String toString() {
	return "UserDTO [user=" + user + ", msg=" + msg + "]";
}

}
