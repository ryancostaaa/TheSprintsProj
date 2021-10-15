package com.maansi.cs490.Newsapp;
import org.springframework.data.repository.CrudRepository;
import com.maansi.cs490.Newsapp.Tbl_signup;


public interface UserRepository extends CrudRepository<Tbl_signup, Integer>{

}
