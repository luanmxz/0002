package br.com.valkyrie.user.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@Entity
@Table(name="tb0001_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="a0001_user_id")
	private Long id;
	
	@Column(name="a0001_username", unique = true, columnDefinition = "varchar(20)")
	private String username;
	
	@Column(name="a0001_email", unique = true, columnDefinition = "varchar(80)")
	private String email;
	
	@Column(name="a0001_password", columnDefinition = "varchar(20)")
	private String password;
	
	@Column(name="a0001_create_time", insertable = false, columnDefinition = "timestamp DEFAULT NOW()")
	private Date create_time;
	
	@Column(name="a0001_update_time", columnDefinition = "timestamp DEFAULT NULL")
	private Date update_time;

	@Column(name = "a0001_verified", insertable = false,columnDefinition = "boolean default false")
	private boolean isVerified;
	@Column(name = "a0001_activated", insertable = false, columnDefinition = "boolean default false")
	private boolean isActivated;

	@Column(name= "a0001_totalBets", insertable = false, columnDefinition = "integer default 0")
	private Long totalBets;
	@Column(name = "a0001_numberOfWins", insertable = false, columnDefinition = "integer default 0")
	private Long numberOfWins;
	@Column(name = "a0001_numberOfLoses", insertable = false, columnDefinition = "integer default 0")
	private Long numberOfLoses;

	@Column(name = "a0005_wallet_id")
	private Long wallet_id;
	
	public User(Long id, String username, String email, String password) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
	public Date getCreate_time() {
		return this.create_time;
	}
	
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public Long getTotalBets() {
		return totalBets;
	}

	public void setTotalBets(Long totalBets) {
		this.totalBets = totalBets;
	}

	public Long getNumberOfWins() {
		return numberOfWins;
	}

	public void setNumberOfWins(Long numberOfWins) {
		this.numberOfWins = numberOfWins;
	}

	public Long getNumberOfLoses() {
		return numberOfLoses;
	}

	public void setNumberOfLoses(Long numberOfLoses) {
		this.numberOfLoses = numberOfLoses;
	}

	public Long getWallet_id() {
		return wallet_id;
	}

	public void setWallet_id(Long wallet_id) {
		this.wallet_id = wallet_id;
	}
	
}
