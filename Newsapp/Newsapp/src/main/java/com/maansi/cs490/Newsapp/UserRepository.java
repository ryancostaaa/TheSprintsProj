package com.maansi.cs490.Newsapp;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<tbl_signup, Integer>{

	
	 // @Query("Select u from tbl_signup u where u.Username = ?1")
	  tbl_signup userName(String username);
	  
	  @Query("Select u from tbl_signup u where u.userName = ?1")
	  List<tbl_signup> findByuserName(String username);
	  
	  @Query("Select u from tbl_signup u where u.userName = ?1 and u.password=?2")
	  List<tbl_signup> findBypassword(String username, String password);
	  
	  
}


