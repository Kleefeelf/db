package ua.lviv.iot.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Repository.DriverRepository;
import ua.lviv.iot.domain.Driver;

@AllArgsConstructor
@Service
public class DriverService extends AbstractService<Driver, Integer>{
    private final DriverRepository DriverRepository;

    @Override
    protected JpaRepository<Driver, Integer> getRepository() {
        return DriverRepository;
    }
}
