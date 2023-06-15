package br.com.valkyrie.user.dto;


import java.util.Date;
import br.com.valkyrie.user.model.User;


public class UserDTO {
	
	private Long id;

	private String username;
	
	private String email;
	private String password;

	public UserDTO() {}
	
	public UserDTO(Long id, String username, String email, String password) {
		this.setId(id);
		this.username = username;
		this.email = username;
		this.password = password;
	}
	
	public UserDTO(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.email = user.getEmail();
		this.password = user.getPassword();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
