package net.proselyte.songStarter.repository;

import net.proselyte.songStarter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

}
