//package com.adneom.trm.repository;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import com.adneom.trm.domain.Consultant;
//
//public class ConsultantRepositoryImpl implements ConsultantCustomRepository {
//
//	@PersistenceContext
//    private EntityManager em;
//	
//	@SuppressWarnings("unchecked")
//	public List<Consultant> findAll() {
//		System.out.println("ELS HAAR TEST");
//		Query query = em.createQuery("Select t from " + Consultant.class.getSimpleName() + " t");
//		return query.getResultList();
//	}
//
//}
