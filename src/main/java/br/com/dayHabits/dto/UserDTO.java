package br.com.dayHabits.dto;


import java.util.Date;
import br.com.dayHabits.model.User;


public class UserDTO {
	
	private Long id;

	private String username;
	
	private String email;
	private Date create_time;
	private Date update_time;
	private String password;

	public UserDTO() {}
	
	public UserDTO(Long id, String username, String email, String password, Date create_time, Date update_time) {
		this.setId(id);
		this.username = username;
		this.email = username;
		this.password = password;
		this.create_time = create_time;
		this.update_time = update_time;
	}
	
	public UserDTO(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.create_time = user.getCreate_time();
		this.update_time = user.getUpdate_time();
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
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
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
