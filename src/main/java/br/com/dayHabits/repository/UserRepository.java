package br.com.dayHabits.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dayHabits.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findUserByEmail(String email);
	Optional<User> findUserByUsername(String username);
	Optional<User> findUserById(Long id);
	
}
