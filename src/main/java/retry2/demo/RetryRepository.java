package retry2.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RetryRepository extends JpaRepository<Retry,Integer> {
}
