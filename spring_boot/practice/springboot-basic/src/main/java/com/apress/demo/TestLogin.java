package com.apress.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="log")
public class TestLogin {
    private String user;
    private String password;

    @Override
    public String toString() {
       return "se logeo " + user + " con las contrasena " + password;
    }
    public String getUser()
	{
		return user;
	}
	public void setUser(String User)
	{
		this.user= User;
	}
    public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password= password;
	} 
}
