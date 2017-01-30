package com.adneom.trm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.adneom.trm.domain.BusinessManager;

public interface BusinessManagerRepository extends PagingAndSortingRepository<BusinessManager, Integer> {

	public BusinessManager findByEmail(@Param("email") String email);
}
