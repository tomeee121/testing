package TomaszB;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends CrudRepository<UserDetails, Long> {
}
