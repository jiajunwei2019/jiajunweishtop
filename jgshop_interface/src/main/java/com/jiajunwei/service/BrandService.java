package com.jiajunwei.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.jiajunwei.entity.Brand;

//品牌管理
public interface BrandService {
	int add(Brand brand);
	int update(Brand brand);
	int delete(int[] ids);
	PageInfo<Brand> list(Brand brand);
	List<Brand> list();
	Brand getById(int id);
}
