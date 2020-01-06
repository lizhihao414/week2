package com.lzh.dao;

import java.util.List; 

import com.lzh.entity.NianJian;

public interface NianJianDao {
	int insert(List<NianJian> list1);
	
	List<NianJian> select(NianJian nianJian);
}
