package com.jlit.dao.base.interfaces;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T> {
	
	public boolean save(T entity) throws Exception;
	
	public boolean delete(T entity) throws Exception;
	
	public boolean update(T entity) throws Exception;
	
	public T findById(Serializable id) throws Exception;
	
	public T loadById(Serializable id) throws Exception;
	
	public T deleteById(Serializable id) throws Exception;
	
	public List<T> queryAll() throws Exception;
	
	public int getCount() throws Exception;
	
	public boolean save(List<T> enties) throws Exception;
	
	public List<T> getListByPage(T entity, int offset, int pageSize) throws Exception;
	
	public List<T> getListByPage(String sql, int offset, int pageSize) throws Exception;
	
	public void executeSQL(String sql) throws Exception;
	
	public boolean updateBySQL(String sql, Object...parameters) throws Exception;
}
