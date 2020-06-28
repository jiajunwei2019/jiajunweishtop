package com.jiajunwei.dao;

import java.util.List;

import com.jiajunwei.entity.Brand;

public interface BrandDao {

	List<Brand> queryAll();

	Brand findById(int id);

}
