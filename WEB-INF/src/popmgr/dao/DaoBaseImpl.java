package popmgr.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.List;

//import org.hibernate.HibernateDaoSupport;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public abstract class DaoBaseImpl<E> implements IDaoBase<E>
{
    private Class cls;
    public DaoBaseImpl()
	{
	    this.cls = (Class<E>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	    //Object obj = this.getClass();
	}
    public void saveEntity(E e)
    {
	//this.getHibernateTemplate().save(e);
    }
    public void updateEntity(E e)
    {
	
    }
    public void deleteEntity(E e)
    {
	
    }
    public void deleteEntityById(Serializable id)
    {
	
    }
    public E loadEntity(final Class<E> ClassName,final Serializable id)
    {
	return null;
    }
    public E loadEntityById(Serializable id)
    {
	return null;
    }
}