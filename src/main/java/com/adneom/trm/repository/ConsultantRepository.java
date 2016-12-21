package com.adneom.trm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.adneom.trm.domain.Consultant;

public interface ConsultantRepository extends PagingAndSortingRepository<Consultant, Integer> {

	
//	List<User> findByName(@Param("name") String name);
}
