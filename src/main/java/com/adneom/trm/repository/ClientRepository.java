package com.adneom.trm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.adneom.trm.domain.Client;

public interface ClientRepository extends PagingAndSortingRepository<Client, Integer> {
}
