package com.adneom.trm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.adneom.trm.domain.Mission;

public interface MissionRepository extends PagingAndSortingRepository<Mission, Integer> {

}
