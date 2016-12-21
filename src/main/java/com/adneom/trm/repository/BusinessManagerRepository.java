package com.adneom.trm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.adneom.trm.domain.BusinessManager;

public interface BusinessManagerRepository extends PagingAndSortingRepository<BusinessManager, Integer> {

	
//	List<User> findByName(@Param("name") String name);
}
