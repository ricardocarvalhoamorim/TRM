package com.adneom.trm.repository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.adneom.trm.domain.Consultant;

//@RepositoryRestResource(collectionResourceRel = "creatures", path = "creatures")
public interface ConsultantRepository extends PagingAndSortingRepository<Consultant, Integer>/*, ConsultantCustomRepository */{
}
