package com.ouwyukha.mangopi.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ouwyukha.mangopi.model.User;
import com.ouwyukha.mangopi.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

	@PostMapping("/insertUser")
	public String insertUser(@RequestBody User User) {
		repository.save(User);
		return "Inserted User with id : " + User.getId();
	}

	@PutMapping("/updateUser/{id}")
	public String updateUser(@RequestBody User User, @PathVariable String id) {
        User.setId(id);
		repository.save(User);
		return "Updated User with id : " + id;
	}

	@GetMapping("/findAllUsers")
	public List<User> getUsers() {
		return repository.findAll();
	}

	@GetMapping("/findAllUsers/{id}")
	public Optional<User> getUser(@PathVariable String id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable String id) {
		repository.deleteById(id);
		return "User deleted with id : " + id;
	}

}
