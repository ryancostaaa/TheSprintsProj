package com.maansi.cs490.Newsapp;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<tbl_signup, Integer>{

	
	 // @Query("Select u from tbl_signup u where u.Username = ?1")
	  tbl_signup userName(String username);
	  
	  @Query("Select u from tbl_signup u where u.userName = ?1")
	  public List<tbl_signup> findByuserName(String username);
	  
	  @Query("Select u from tbl_signup u where u.userName = ?1 and u.password=?2")
	  public List<tbl_signup> findBypassword(String username, String password);
	  
	  @Transactional
	  @Modifying(clearAutomatically = true)
	  @Query("Update tbl_signup set password= ?1 where userName= ?2")
	  public void updatePassword(String password, String username);
	  
	  @Query("Select password from tbl_signup where username= ?1")
	  public String getPassword(String username);
	  
}



