package ua.lviv.iot.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Repository.CostRepository;
import ua.lviv.iot.domain.Cost;

@AllArgsConstructor
@Service
public class CostService extends AbstractService<Cost, Integer>{
    private final CostRepository CostRepository;

    @Override
    protected JpaRepository<Cost, Integer> getRepository() {
        return CostRepository;
    }
}