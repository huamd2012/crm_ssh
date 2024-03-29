package com.itheima.crm.dao.impl;

import java.util.List;


import com.itheima.crm.dao.BaseDictDao;
import com.itheima.crm.domain.BaseDict;

/**
 * 字典DAO的实现类
 * 
 * @author hjz
 *
 */
public class BaseDictDaoImpl extends BaseDaoImpl<BaseDict> implements BaseDictDao {

	@Override
	// 根据类型编码查询字典数据
	public List<BaseDict> findByTypeCode(String dict_type_code) {
		return (List<BaseDict>) this.getHibernateTemplate().find("from BaseDict where dict_type_code = ?",
				dict_type_code);
	}

}
