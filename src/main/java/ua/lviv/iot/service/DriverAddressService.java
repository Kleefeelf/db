package ua.lviv.iot.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Repository.DriverAddressRepository;
import ua.lviv.iot.domain.DriverAddress;

@AllArgsConstructor
@Service
public class DriverAddressService extends AbstractService<DriverAddress, Integer>{
    private final DriverAddressRepository DriverAddressRepository;

    @Override
    protected JpaRepository<DriverAddress, Integer> getRepository() {
        return DriverAddressRepository;
    }
}
