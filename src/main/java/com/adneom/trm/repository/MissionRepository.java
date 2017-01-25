package com.adneom.trm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.adneom.trm.domain.Mission;

/**
 * To retrieve the missions in a response directly, this repository is needed.
 * For now it is turned inactive, because by disabling this repository, the missions are immediately 
 * returned in the response of the Consultants, which was needed now.
 */
public interface MissionRepository extends PagingAndSortingRepository<Mission, Integer> {

}
