package ua.lviv.iot.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Repository.SecurityRepository;
import ua.lviv.iot.domain.Security;

@AllArgsConstructor
@Service
public class SecurityService extends AbstractService<Security, Integer>{
    private final SecurityRepository SecurityRepository;

    @Override
    protected JpaRepository<Security, Integer> getRepository() {
        return SecurityRepository;
    }
}

