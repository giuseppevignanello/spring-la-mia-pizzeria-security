package org.java.app.auth.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.java.app.auth.pojo.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
	
}
