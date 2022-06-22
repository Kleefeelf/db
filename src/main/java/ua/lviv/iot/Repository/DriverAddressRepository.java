package ua.lviv.iot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.DriverAddress;

@Repository
public interface DriverAddressRepository extends JpaRepository<DriverAddress, Integer>{
}
