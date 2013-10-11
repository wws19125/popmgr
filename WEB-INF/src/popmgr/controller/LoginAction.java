package popmgr.controller;

import com.opensymphony.xwork2.*;
import org.apache.struts2.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.http.*;

import java.util.Map;
import popmgr.domain.DomainUser;

public class LoginAction extends ActionSupport
{
    private String username;
    private String password;
    private String tip;

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
    
    public String getTip()
    {
	return this.tip;
    }
    public void setTip(String tip)
    {
	this.tip = tip;
    }

    public String execute()throws Exception
    {
	Configuration conf = new Configuration().configure();
	SessionFactory sf = conf.buildSessionFactory();
	Session sess = sf.openSession();
	Transaction tx = sess.beginTransaction();
	DomainUser user = new DomainUser();
	user.setUsername("zhang");
	user.setPwd("li");
	user.setUtype(1);
	sess.save(user);
	tx.commit();
	sess.close();
	if(getUsername().equals("wang")&&getPassword().equals("admin"))
	    {
		ActionContext.getContext().getSession().put("user",getUsername());
		return SUCCESS;
	    }
	else
	    return ERROR;
    }

    
    public String login()
    {
	if(getUsername()==null||getPassword()==null)
	    {
		return "login";
	    }
	else
	    if(getUsername().equals("wang")&&getPassword().equals("admin"))
		{
		    return SUCCESS;
		}
	    else
		{
		    setTip("登录失败");
		    return "login";
		}
    }
    public String logout()
    {
	setTip("您已经退出登录");
	return "login";
    }
}