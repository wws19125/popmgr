package popmgr.dao;

import java.io.Serializable;
import java.util.List;

public interface IDaoBase<E>
{
    public void saveEntity(E e);
    public void updateEntity(E e);
    public void deleteEntity(E e);
    public void deleteEntityById(Serializable id);
    public E loadEntity(final Class<E> className,final Serializable id);
    public E loadEntityById(Serializable id);
    //public 
}