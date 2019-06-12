package com.jd.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jd.springboot.api.CompanyService;
import com.jd.springboot.entity.CompanyEntity;

import java.lang.management.ManagementFactory;

/**
 * @author tianzuo
 */
@Service
public class CompanyServiceImpl implements CompanyService {

	@Override
	public CompanyEntity findOneCompany() {
		CompanyEntity entity = new CompanyEntity();
		entity.setId("300496");
		entity.setName("中科创达");
		entity.setAddress("西安科技二路零一广场");
		entity.setTel("88889999");
		
		String name = ManagementFactory.getRuntimeMXBean().getName();    
		String pid = name.split("@")[0];    
		entity.setPid(pid);
		return entity;
	}

}
