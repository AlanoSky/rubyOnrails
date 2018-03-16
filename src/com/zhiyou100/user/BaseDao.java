package com.zhiyou100.user;

import java.util.List;

public interface BaseDao <E> {
	
	
	public abstract void add(E e);
	public abstract void deleteById(int e);
	public abstract void update(E e);
	public abstract List<E> selectAll();
	

}
