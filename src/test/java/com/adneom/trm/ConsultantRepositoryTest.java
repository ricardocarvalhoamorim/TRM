package com.adneom.trm;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.adneom.trm.domain.Consultant;
import com.adneom.trm.repository.ConsultantRepository;

public class ConsultantRepositoryTest {

	@Autowired
	private ConsultantRepository consultantRepository;
	
	@Test
	@Ignore //TODO fix!
	public void firstTest() {
		Iterable<Consultant> all = consultantRepository.findAll();
		for (Consultant consultant : all) {
			System.out.println(consultant.getName());
		}
	}
	
}
