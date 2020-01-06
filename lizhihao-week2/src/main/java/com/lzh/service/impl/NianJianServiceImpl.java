package com.lzh.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzh.basedao.DateUtil;
import com.lzh.basedao.FileUtil;
import com.lzh.basedao.StringUtil;
import com.lzh.dao.NianJianDao;
import com.lzh.entity.NianJian;
import com.lzh.service.NianJianService;
@Service
public class NianJianServiceImpl implements NianJianService {
	@Autowired
	private NianJianDao nianJianDao;
	
	@Override
	public int insert(List<NianJian> list1) {
		List<String> list = FileUtil.readTextFileOfList("/lizhihao-week2/src/test/java/test/nianjian");
		for (String string : list) {
			try {
				String[] split = string.split(" ");
				NianJian nianjian = new NianJian();
				List<NianJian> list2 = new ArrayList<NianJian>();
				if(!StringUtil.isNumber("1")) {
					//nianjian.setId(BigInteger);
				}
				nianjian.setGjzi(split[1]);
				nianjian.setMiaoshu(split[2]);
				nianjian.setName(split[3]);
				nianjian.setChanpin(split[4]);
				nianjian.setZiben(Integer.parseInt(split[5]));
				nianjian.setCreattime(split[6]);
				nianjian.setNianjiantime(split[7]);
				nianjian.setNianjianzhuangtai(split[8]);
				nianjian.setBeizhu(split[9]);
				nianjian.setDizhi(split[10]);
				if(!StringUtil.isBlank("")) {
					nianjian.setName(split[3]);
				}
				if(!StringUtil.isBlank("")) {
					nianjian.setChanpin(split[4]);
				}
				if(StringUtil.isNotBlank("")) {
					nianjian.setZiben(Integer.parseInt(split[5]));
				}
				if(DateUtil.isToday("2020-1-6")) {
					nianjian.setCreattime(split[6]);
				}
				if(StringUtil.isNotBlank("")) {
					nianjian.setNianjiantime(split[7]);
				}
				if(!StringUtil.isBlank("")) {
					nianjian.setDizhi(split[10]);
				}
				list2.add(nianjian);
				System.out.println(nianjian);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(list1);
		return nianJianDao.insert(list1);
	}

	@Override
	public PageInfo<NianJian> select(NianJian nianJian, Integer page, Integer pagesize) {
		PageHelper.startPage(page, pagesize);
		List<NianJian> list = nianJianDao.select(nianJian);
		return new PageInfo<NianJian>(list);
	}

}
