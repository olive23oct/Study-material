package com.mystudy.jdbc_impl_dao_generic;

import java.util.ArrayList;
import java.util.List;

import com.mystudy.jdbc_impl.MemberVO;

public interface DAO<T> {
	List<T> sellectAll();
	
	T selectOne(String id);
	T selectOne(T vo);
	List<T> selectName(String name);
	
	int insertOne(T vo);
	int updateOne(T vo);
	int deleteOne(T vo);
	int deleteOne(String id);
}









