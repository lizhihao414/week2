package com.lzh.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.lzh.entity.NianJian;

public interface NianJianService {
	int insert(List<NianJian> list1);
	
	PageInfo<NianJian> select(NianJian nianJian,Integer page,Integer pagesize);
}
