package nl.websystique.ovsoftware.oldenzaal.testprototypes.junit.repositories;

import nl.websystique.ovsoftware.oldenzaal.testprototypes.junit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

}
