package com.adneom.trm.repository;
import org.springframework.data.repository.CrudRepository;

import com.adneom.trm.domain.Consultant;

//@RepositoryRestResource(collectionResourceRel = "creatures", path = "creatures")
//public interface ConsultantRepository extends PagingAndSortingRepository<Consultant, Integer>/*, ConsultantCustomRepository */{
public interface ConsultantRepository extends CrudRepository<Consultant, Integer>/*, ConsultantCustomRepository */{
}
