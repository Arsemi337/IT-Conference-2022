package milosz.artur.it.conference;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    List<User> getAll()  {
        return userRepository.findAll();
    }
}
