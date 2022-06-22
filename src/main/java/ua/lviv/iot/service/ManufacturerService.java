package ua.lviv.iot.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Repository.ManufacturerRepository;
import ua.lviv.iot.domain.Manufacturer;

@AllArgsConstructor
@Service
public class ManufacturerService extends AbstractService<Manufacturer, Integer>{
    private final ManufacturerRepository ManufacturerRepository;

    @Override
    protected JpaRepository<Manufacturer, Integer> getRepository() {
        return ManufacturerRepository;
    }
}
