package com.jiajunwei.dao;
import com.jiajunwei.entity.Brand;
import java.util.List;
public interface BrandDao {
	List<Brand> queryAll();

	Brand findById(int id);
}
