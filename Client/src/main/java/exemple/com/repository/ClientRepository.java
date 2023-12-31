package exemple.com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import exemple.com.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
