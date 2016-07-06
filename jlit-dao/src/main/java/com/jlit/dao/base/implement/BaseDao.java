package com.jlit.dao.base.implement;

import java.io.Serializable;
import java.util.List;

import com.jlit.dao.base.interfaces.IBaseDao;

public class BaseDao<T> implements IBaseDao<T>{

	public boolean save(T entity) throws Exception {
		return false;
	}

	public boolean delete(T entity) throws Exception {
		return false;
	}

	public boolean update(T entity) throws Exception {
		return false;
	}

	public T findById(Serializable id) throws Exception {
		return null;
	}

	public T loadById(Serializable id) throws Exception {
		return null;
	}

	public T deleteById(Serializable id) throws Exception {
		return null;
	}

	public List<T> queryAll() throws Exception {
		return null;
	}

	public int getCount() throws Exception {
		return 0;
	}

	public boolean save(List<T> enties) throws Exception {
		return false;
	}

	public List<T> getListByPage(T entity, int offset, int pageSize)
			throws Exception {
		return null;
	}

	public List<T> getListByPage(String sql, int offset, int pageSize)
			throws Exception {
		return null;
	}

	public void executeSQL(String sql) throws Exception {
		
	}

	public boolean updateBySQL(String sql, Object... parameters)
			throws Exception {
		return false;
	}

}
