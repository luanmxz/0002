package br.com.valkyrie.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.valkyrie.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findUserByEmail(String email);
	Optional<User> findUserByUsername(String username);
	Optional<User> findUserById(Long id);
	
}
