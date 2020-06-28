package com.jiajunwei.dao;

import java.util.List;

import com.jiajunwei.entity.Spec;
import com.jiajunwei.entity.SpecOption;

public interface SpecDao {

	int addSpec(Spec spec);

	int delOptions(int ...ids);

	int delSpec(int[] ids);

	int update(Spec spec);

	int addOption(SpecOption specOption);

	List<Spec> list(Spec spec);

	Spec findById(int id);

}
