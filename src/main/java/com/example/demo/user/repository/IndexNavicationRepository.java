package com.example.demo.user.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;import com.example.demo.user.entity.IndexNavication;

@Repository
public interface IndexNavicationRepository extends JpaRepository<IndexNavication, IndexNavication> {
	
	@Transactional
	@Modifying
	@Query(value = "insert into navications(navication) values(?1)",nativeQuery = true)
	Integer addNavication(String navication);
	
	@Transactional
	@Modifying
	@Query(value = "delete from navications where navication = ?1",nativeQuery = true)
	Integer delNavication(String navication);
	
	
}
