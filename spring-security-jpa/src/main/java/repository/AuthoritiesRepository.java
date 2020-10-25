package repository;

import io.maha.springsecurityjdbc.entity.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthoritiesRepository extends JpaRepository<Authorities, String> {

    Optional<Authorities> findById(String s);
}
