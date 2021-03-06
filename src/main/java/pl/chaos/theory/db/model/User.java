package pl.chaos.theory.db.model;

import pl.chaos.theory.security.Role;

import javax.persistence.*;

@Entity
@Table(name = "user")
/**
 * DB Model of user.
 */
public class User extends Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@Column(name = "password_hash", nullable = false)
	private String passwordHash;
	@Column(name = "role", nullable = false)
	@Enumerated(EnumType.STRING)
	private Role role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
