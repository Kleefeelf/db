package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import domain.Car;

public class CarRepository extends JpaRepository<Car, Integer>{
}
