package com.lzh.entity;

import java.math.BigInteger;

public class NianJian {
	private BigInteger id;//编号
	
	private String gjzi;//关键字
	
	private String miaoshu;//描述
	
	private String name;//名字
	
	private String chanpin;//产品
	
	private Integer ziben;//资本
	
	private String creattime;//创建时间
	
	private String nianjiantime;//年检时间
	
	private String nianjianzhuangtai;//年检状态
	
	private String beizhu;//备注
	
	private String dizhi;//地址

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getGjzi() {
		return gjzi;
	}

	public void setGjzi(String gjzi) {
		this.gjzi = gjzi;
	}

	public String getMiaoshu() {
		return miaoshu;
	}

	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChanpin() {
		return chanpin;
	}

	public void setChanpin(String chanpin) {
		this.chanpin = chanpin;
	}

	public Integer getZiben() {
		return ziben;
	}

	public void setZiben(Integer ziben) {
		this.ziben = ziben;
	}

	public String getCreattime() {
		return creattime;
	}

	public void setCreattime(String creattime) {
		this.creattime = creattime;
	}

	public String getNianjiantime() {
		return nianjiantime;
	}

	public void setNianjiantime(String nianjiantime) {
		this.nianjiantime = nianjiantime;
	}

	public String getNianjianzhuangtai() {
		return nianjianzhuangtai;
	}

	public void setNianjianzhuangtai(String nianjianzhuangtai) {
		this.nianjianzhuangtai = nianjianzhuangtai;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	@Override
	public String toString() {
		return "NianJian [id=" + id + ", gjzi=" + gjzi + ", miaoshu=" + miaoshu + ", name=" + name + ", chanpin="
				+ chanpin + ", ziben=" + ziben + ", creattime=" + creattime + ", nianjiantime=" + nianjiantime
				+ ", nianjianzhuangtai=" + nianjianzhuangtai + ", beizhu=" + beizhu + ", dizhi=" + dizhi + "]";
	}

	
}
