package com.jd.springboot.api;

import com.jd.springboot.entity.CompanyEntity;

/**
 * @author tianzuo
 */
public interface CompanyService {
	/**
	 * @return
	 */
	CompanyEntity findOneCompany();
}
