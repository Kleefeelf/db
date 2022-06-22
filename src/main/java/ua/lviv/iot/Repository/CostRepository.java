package ua.lviv.iot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Cost;

@Repository
public interface CostRepository extends JpaRepository<Cost, Integer>{
}
