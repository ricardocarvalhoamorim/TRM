//package com.adneom.trm.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.adneom.trm.domain.Consultant;
//import com.adneom.trm.repository.ConsultantRepository;
//
//@RestController
//public class ConsultantController {
//
//	@Autowired
//	ConsultantRepository repository;
//	
//	@RequestMapping("/greeting")
//	public Iterable<Consultant> firstAttempt() {
//		Iterable<Consultant> consultants = repository.findAll();
//		return consultants;
//	}
//	
//}
