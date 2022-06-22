package ua.lviv.iot.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Repository.UserRepository;
import ua.lviv.iot.domain.User;

@AllArgsConstructor
@Service
public class UserService extends AbstractService<User, Integer>{
    private final UserRepository UserRepository;

    @Override
    protected JpaRepository<User, Integer> getRepository() {
        return UserRepository;
    }
}
