package ua.lviv.iot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer>{
}
