package com.evotixit.GestionAcces.controllers;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evotixit.GestionAcces.models.Etablissement;
import com.evotixit.GestionAcces.models.Password;
import com.evotixit.GestionAcces.models.User;
import com.evotixit.GestionAcces.service.UserNotFoundException;
import com.evotixit.GestionAcces.service.UserService;
import com.evotixit.GestionAcces.util.JwtUtil;
import com.evotixit.GestionAcces.util.Utility;

import net.bytebuddy.utility.RandomString;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	private UserService userService;

	//
	@PostMapping("/signupParent")
	public String create(@RequestBody User user, HttpServletRequest request)
			throws UnsupportedEncodingException, MessagingException {
		String email = user.getEmailConfirm();
		String siteURL = Utility.getSiteURL(request);
		userService.addParent(user);

		userService.sendVerificationEmail(user, siteURL);
		
		return "";

	}
	
	@PostMapping("/signupAdminPlateforme")
	public String createAdmin(@RequestBody User user, HttpServletRequest request)
			throws UnsupportedEncodingException, MessagingException {
		String email = user.getEmailConfirm();
		String siteURL = Utility.getSiteURL(request);
		userService.addAdminPlateforme(user);

		userService.sendVerificationEmail(user, siteURL);

		return "";

	}

	@PostMapping("/signupEnseigant")
	public String createEnseigant(@RequestBody User user, HttpServletRequest request)
			throws UnsupportedEncodingException, MessagingException {
		String email = user.getEmailConfirm();
		String siteURL = Utility.getSiteURL(request);
		boolean enable = user.isEnabled();

		userService.addEnseignant(user);

		userService.sendVerificationEmail2(user, siteURL);

		return "";

	}

	

	@PostMapping("/signupDirecteur")
	public String createDirecteur(@RequestBody User user, HttpServletRequest request)
			throws UnsupportedEncodingException, MessagingException {
		String email = user.getEmailConfirm();
		String siteURL = Utility.getSiteURL(request);
		boolean enable = user.isEnabled();

		userService.addDirecteur(user);

		userService.sendVerificationEmail2(user, siteURL);
		
		return "";

	}
	@PostMapping("/etablissement")
	public Etablissement createEtablissement(@RequestBody Etablissement etablissement) {
		
		return userService.addEtablissement(etablissement);

	}
	@GetMapping("/getEtablissement")
	public List<Etablissement> getEtablissement() {
		
		return userService.getEtablissement();

	}
	@GetMapping("/verify/{code}")
	public boolean verifyUser(@PathVariable String code) {

		return userService.verify(code);

	}
	@GetMapping("/verifyMail/{code}")
	public boolean verifyMail(@PathVariable String code) {

		return userService.verify2(code);

	}
	
	@GetMapping("")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	//// forget password
	@PostMapping("/forgot_password")
	public String processForgotPassword(@RequestBody User user, HttpServletRequest request, Model model) {
		String email = user.getEmail();
		String token = RandomString.make(30);

		try {
			userService.updateResetPasswordToken(token, email);
			String resetPasswordLink = "http://localhost:4200//reset_password/" + token;
			userService.sendEmail(email, resetPasswordLink);
			System.out.println(resetPasswordLink);
			model.addAttribute("message", "We have sent a reset password link to your email. Please check.");

		} catch (UserNotFoundException ex) {
			model.addAttribute("error", ex.getMessage());
		} catch (UnsupportedEncodingException | MessagingException e) {
			model.addAttribute("error", "Error while sending email");
		}

		return "forgot_password_form";
	}

	@GetMapping("/reset_password/{token}")
	public User showResetPasswordForm(@PathVariable String token) {
		User user = userService.getByResetPasswordToken(token);

		return user;

	}

	@PostMapping("/reset_password/{token}")
	public String processResetPassword(@RequestBody Password password, @PathVariable String token,
			HttpServletRequest request, Model model) {
		// String token = request.getParameter("token");

		// String password = request.getParameter("password");
		String pwd = password.getPassword();
		User user = userService.getByResetPasswordToken(token);
		System.out.printf("user", user);
		if (user == null) {

			return "message";
		} else {
			userService.updatePassword(user, pwd);
		}
		return "message";
	}

	@GetMapping("/{email}")
	public User getUserByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}
	
	@PutMapping("/{email}")
	public User update(@PathVariable String email, @RequestBody User profile) {
		return userService.updateUser(profile);
	}
	@GetMapping("user/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.findById(id);
	}
	
	@PutMapping("activer/{id}")  
	public User activer(@PathVariable Integer id , @RequestBody User user ) {
		return userService.activer(user);
	}
	@PutMapping("desactiver/{id}")  
	public User desactiver(@PathVariable Integer id , @RequestBody User user ) {
		return  userService.desactiver(user);
	}
	@GetMapping("/getEnseignant/{id}")
	public User getEnseignantByID(@PathVariable Integer id) {
		return userService.getEnseignantByID(id);
	}
	
	
	
	
}