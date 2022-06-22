package ua.lviv.iot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Security;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Integer>{
}
