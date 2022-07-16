package com.evotixit.GestionAcces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionAcces.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findUserByEmailAndPassword(String email, String password);
	
	User findUserByEmail(String email);
	@Query("UPDATE User u SET u.enabled = true  WHERE u.id = ?1")
	@Modifying
	public void enable(Integer id) ;

	@Query("UPDATE User u SET u.verificationCode = null  WHERE u.id = ?1")
	@Modifying
	public void zero(Integer id) ;
	
	@Query("UPDATE User u SET u.email = u.emailConfirm  WHERE u.id = ?1")
	@Modifying
	public void setMail(Integer id) ;

	@Query("UPDATE User u SET u.emailVerifiée = true  WHERE u.id = ?1")
	@Modifying
	public void setEmailVerifier(Integer id) ;

	
	@Query("UPDATE User u SET u.emailConfirm = null  WHERE u.id = ?1")
	@Modifying
	public void setEmailConfirm(Integer id) ;
	
	@Query("SELECT u FROM User u WHERE u.verificationCode = ?1")
	public User findByVerificationCode(String code);
	
	@Query("SELECT u FROM User u WHERE u.resetPasswordToken = ?1")
	public User findByResetPasswordToken(String token);
	
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	public User findByEmail(String email);
	
	
	
	
	
}