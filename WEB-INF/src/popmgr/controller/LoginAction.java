package popmgr.controller;

import com.opensymphony.xwork2.*;
import org.apache.struts2.*;

import javax.servlet.http.*;

import java.util.Map;

public class LoginAction extends ActionSupport
{
    private String username;
    private String password;

    public String getUsername()
    {
	return username;
    }
    public void setUsername(String username)
    {
	this.username = username;
    }

    public String getPassword()
    {
	return this.password;
    }
    public void setPassword(String password)
    {
	this.password = password;
    }

    public String execute()throws Exception
    {
	if(getUsername().equals("wang")&&getPassword().equals("admin"))
	    {
		ActionContext.getContext().getSession().put("user",getUsername());
		return SUCCESS;
	    }
	else
	    return ERROR;
    }
}