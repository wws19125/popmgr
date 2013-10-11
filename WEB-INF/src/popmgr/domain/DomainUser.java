package popmgr.domain;

/**
 *description
 *<br/>用户vo类
 *@author wang
 *@version 1.0
 */

public class DomainUser
{
    private int id;
    private String username;
    private String pwd;
    private int utype;
    
    public void setId(int id)
    {
	this.id = id;
    }
    public int getId()
    {
	return this.id;
    }

    public void setUsername(String username)
    {
	this.username = username;
    }
    public String getUsername()
    {
	return this.username;
    }

    public void setPwd(String pwd)
    {
	this.pwd = pwd;
    }
    public String getPwd()
    {
	return this.pwd;
    }

    public void setUtype(int utype)
    {
	this.utype=utype;
    }
    public int getUtype()
    {
	return this.utype;
    }
}