package com.lzh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lzh.entity.NianJian;
import com.lzh.service.NianJianService;
@Controller
public class NianJianController {
	@Autowired
	private NianJianService nianJianService;
	
	@RequestMapping("list")//lisi方法
	public String list(Model model,NianJian nianJian,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "3")Integer pagesize) {
		PageInfo<NianJian> info = nianJianService.select(nianJian, page, pagesize);
		model.addAttribute("info", info);
		return "list";
	}
}
