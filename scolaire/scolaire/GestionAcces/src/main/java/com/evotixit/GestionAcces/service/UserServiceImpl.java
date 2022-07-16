package com.evotixit.GestionAcces.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.evotixit.GestionAcces.models.AuthenticationResponse;
import com.evotixit.GestionAcces.models.Etablissement;
import com.evotixit.GestionAcces.models.RoleUser;
import com.evotixit.GestionAcces.models.User;
import com.evotixit.GestionAcces.repository.EtablissementRepository;
import com.evotixit.GestionAcces.repository.UserRepository;

import net.bytebuddy.utility.RandomString;
 
@Service
@Transactional
public class UserServiceImpl implements UserService { 
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private EtablissementRepository etablissementRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired  
	private JavaMailSender mailSender;

	public String code;
	AuthenticationResponse response  ;


	@Override
	public User addParent(User user) {
		String password = user.getPassword();
		user.setPassword(bCryptPasswordEncoder.encode(password));

		user.setRole(RoleUser.Parent);

		user.setEnabled(false);
		String randomCode = RandomString.make(64);
		user.setVerificationCode(randomCode);
		user.setEmailConfirm(user.getEmail());
		String emailStandard = "VerifMail@mail.com";

		user.setEmail(emailStandard);
		return userRepository.save(user);
	}

	@Override
	public User addEnseignant(User user) {
		String password = user.getPassword();
		user.setPassword(bCryptPasswordEncoder.encode(password));

		user.setRole(RoleUser.Enseignant);

		user.setEnabled(false);
		String randomCode = RandomString.make(64);
		// Integer randomCode =100 + (int)(Math.random() * ((100 - 70) + 1));
		user.setVerificationCode(randomCode);
		user.setEmailConfirm(user.getEmail());
		String emailStandard = "VerifMail@mail.com";

		user.setEmail(emailStandard);
		return userRepository.save(user);
	}
	@Override
	public User addDirecteur(User user) {
		String password = user.getPassword();
		user.setPassword(bCryptPasswordEncoder.encode(password));

		user.setRole(RoleUser.DirecteurEtablissement);

		user.setEnabled(false);
		String randomCode = RandomString.make(64);
		// Integer randomCode =100 + (int)(Math.random() * ((100 - 70) + 1));
		user.setVerificationCode(randomCode);
		user.setEmailConfirm(user.getEmail());
		String emailStandard = "VerifMail@mail.com";

		user.setEmail(emailStandard);
		return userRepository.save(user);
	}
	
	@Override
	public User addAdminPlateforme(User user) {
		String password = user.getPassword();
		user.setPassword(bCryptPasswordEncoder.encode(password));

		user.setRole(RoleUser.adminPlateforme);

		user.setEnabled(false);
		String randomCode = RandomString.make(64);
		// Integer randomCode =100 + (int)(Math.random() * ((100 - 70) + 1));
		user.setVerificationCode(randomCode);
		user.setEmailConfirm(user.getEmail());
		String emailStandard = "VerifMail@mail.com";

		user.setEmail(emailStandard);
		return userRepository.save(user);
	}
	@Override
	public Etablissement addEtablissement(Etablissement etablissement) {
		return etablissementRepository.save(etablissement);
	}
	@Override
	public List<Etablissement> getEtablissement() {
		return etablissementRepository.findAll();
	}
	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		return userRepository.findUserByEmailAndPassword(email, password);
	}

	@Override
	public void sendVerificationEmail(User user, String siteURL)
			throws UnsupportedEncodingException, MessagingException {
		// String toAddress = user.getEmail();
		String subject = "Vous avez pris une excellente décision ! Bienvenue sur votre compte dans dossier Scolaire en ligne";
		String senderName = "Etablissement Scolaire";
		String mailcontent = "Merci d'avoir créé votre compte avec dossier scolaire. <br> Cher " + user.getUsername()
				+ " ,<br>";
		mailcontent += "Indiquez-nous s'il s'agit bien de votre adresse e-mail, pour nous aider à sécuriser votre compte et notre site Web.\r\n <br>"
				+ "\r\n" + "Confirmez votre e-mail et commençons !!:</br>";

		String verifyURL = "http://localhost:4200/verify/" + user.getVerificationCode();

		mailcontent += "<h3><a href=\"" + verifyURL + "\" >DossierScolaire</a></h3>";
		mailcontent += "Merci <br>";
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setFrom("manardahmou360@gmail.com", senderName);
		helper.setTo(user.getEmailConfirm());
		helper.setSubject(subject);
		helper.setText(mailcontent, true);
		mailSender.send(message);
		// String code = user.getVerificationCode();
		// userRepository.findByVerificationCode(code);

	}
	@Override
	public void sendVerificationEmail2(User user, String siteURL)
			throws UnsupportedEncodingException, MessagingException {
		// String toAddress = user.getEmail();
		String subject = "Vous avez pris une excellente décision ! Bienvenue sur votre compte dans dossier Scolaire en ligne";
		String senderName = "Etablissement Scolaire";
		String mailcontent = "Merci d'avoir créé votre compte avec dossier scolaire. <br> Cher " + user.getUsername()
				+ " ,<br>";
		mailcontent += "Indiquez-nous s'il s'agit bien de votre adresse e-mail, pour nous aider à sécuriser votre compte et notre site Web.\r\n <br>"
				+ "\r\n" + "Confirmez votre e-mail et commençons !!:</br>";

		String verifyURL = "http://localhost:4200/verifyMail/" + user.getVerificationCode();

		mailcontent += "<h3><a href=\"" + verifyURL + "\" >DossierScolaire</a></h3>";
		mailcontent += "Merci <br>";
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setFrom("manardahmou360@gmail.com", senderName);
		helper.setTo(user.getEmailConfirm());
		helper.setSubject(subject);
		helper.setText(mailcontent, true);
		mailSender.send(message);
		// String code = user.getVerificationCode();
		// userRepository.findByVerificationCode(code); 

	}
	@Override
	public User findById(Integer id) {
		Optional<User> users = userRepository.findById(id);
		return users.isPresent() ? users.get() : null;
	}
	@Override
	public User findByEmail(String email) {
		Optional<User> users = Optional.ofNullable(userRepository.findByEmail(email));
	return users.isPresent() ? users.get() : null;
	}

	@Override
	public boolean verify(String verificationCode) {
		User user = userRepository.findByVerificationCode(verificationCode);
		if (user == null || user.isEnabled()) {
			return false;
		} else {
			userRepository.zero(user.getId());
			userRepository.enable(user.getId());
			userRepository.setMail(user.getId());
			userRepository.setEmailConfirm(user.getId());
			userRepository.setEmailVerifier(user.getId());


			return true;
		}
	}

	@Override

	public boolean verify2(String verificationCode) {
		User user = userRepository.findByVerificationCode(verificationCode);
		if (user == null || user.isEnabled()) {
			return false;
		} else {
			userRepository.zero(user.getId());
			userRepository.setEmailVerifier(user.getId());
			return true; 
		}
	}
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	///////// Forget Password
	@Override
	public void updateResetPasswordToken(String token, String email) throws UserNotFoundException {
		User user = userRepository.findUserByEmail(email);
		if (user != null) {
			user.setResetPasswordToken(token);
			userRepository.save(user);
		} else {
			throw new UserNotFoundException("Could not find any customer with the email " + email);
		}
	}

	@Override
	public User getByResetPasswordToken(String token) {
		return userRepository.findByResetPasswordToken(token);
	}

	@Override
	public String updatePassword(User user, String newPassword) {
		
		user.setPassword(bCryptPasswordEncoder.encode(newPassword));
		user.setResetPasswordToken(null);

		userRepository.save(user);
		return "";
	}

	@Override
	public void sendEmail(String recipientEmail, String link) throws MessagingException, UnsupportedEncodingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom("manardahmou360@gmail.com", "Etablissement scolaire");
		helper.setTo(recipientEmail);

		String subject = "Voici le lien pour réinitialiser votre mot de passe";

		String content = "<p>Bonjour,</p>" + "<p>Vous avez demandé la réinitialisation de votre mot de passe.</p>"
				+ "<p>Cliquez sur le lien ci-dessous pour modifier votre mot de passe :</p>" + "<p><a href=\"" + link
				+ "\">Modifier mon mot de passe</a></p>" + "<br>" + "<p>Ignorer cet e-mail si vous vous souvenez de votre mot de passe, "
				+ "ou vous n'avez pas fait la demande.</p>";  

		helper.setSubject(subject);

		helper.setText(content, true);

		mailSender.send(message);
	}
	@Override
	public User updateUser(User users) {
		return userRepository.save(users);
	}
	
	@Override
	public User activer(User users) {
		if(users.isEnabled() == false) {
		users.setEnabled(true);
		users.setEmail(users.getEmailConfirm());
		users.setEmailConfirm(null);
		}
		return  userRepository.save(users); 
	}
	
	
	@Override
	public User desactiver(User users ) {
		if(users.isEnabled() == true) {

		users.setEnabled(false);
		users.setEmailConfirm(users.getEmail());
		String emailStandard = "VerifMail@mail.com";

		users.setEmail(emailStandard);
		}
		return userRepository.save(users);
		 
	}
	@Override
	public User getEnseignantByID(Integer id) {
		Optional<User> users = userRepository.findById(id);
	     return  users.isPresent() ? users.get() : null;
	}
	//@Override
	//public User setEtatConnexion(String token , User user ) {
		//String token = response.getToken() ;
	//	if(token == null) {
			
		//	user.setEtatConnexion(false);
	//	}else if (token != null) {
			//user.setEtatConnexion(true);
	//	}
	//	return userRepository.save(user);
		
		 
	//}
	

	
	
}