package com.evotixit.GestionAcces.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;

import com.evotixit.GestionAcces.models.AuthenticationResponse;
import com.evotixit.GestionAcces.models.Etablissement;
import com.evotixit.GestionAcces.models.User;

public interface UserService {
	public boolean verify2(String verificationCode) ;
	public void sendVerificationEmail2(User user, String siteURL) 
			throws UnsupportedEncodingException, MessagingException ;
	public Etablissement addEtablissement(Etablissement etablissement) ;
	public List<Etablissement> getEtablissement() ;
	public User addParent(User user );
	public User addEnseignant(User user) ;
	public User addAdminPlateforme(User user) ;
	public User activer(User user ) ;
	public User desactiver(User user ) ;
	public User getUserByEmailAndPassword(String email, String password);
	public User findByEmail(String email) ;
	public User updateUser(User users) ;
	public User addDirecteur(User user) ;
	
	public void sendVerificationEmail(User user  , String siteURL ) throws UnsupportedEncodingException, MessagingException;
	public boolean verify(String verificationCode) ;	
	public User findById(Integer id) ;
	public List<User> getAllUsers();    
	public void updateResetPasswordToken(String token, String email) throws UserNotFoundException ;
	public User getByResetPasswordToken(String token) ;
	public String updatePassword(User user, String newPassword) ;
	public void sendEmail(String recipientEmail, String link)
	        throws MessagingException, UnsupportedEncodingException ;
	public User getEnseignantByID(Integer id) ;
 	}
