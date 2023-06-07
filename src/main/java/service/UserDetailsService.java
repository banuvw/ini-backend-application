package service;

import entity.UserDetails;
import java.util.Optional;
import org.springframework.stereotype.Service;
import repository.UserDetailsRepo;

@Service
public class UserDetailsService {


    private final UserDetailsRepo userDetailsRepo;

    public UserDetailsService(UserDetailsRepo userDetailsRepo) {
        this.userDetailsRepo = userDetailsRepo;
    }

    public Optional<UserDetails> getUserDetails(String userId){
        Optional<UserDetails> userDetailsDto = userDetailsRepo.findById(userId);
        return  userDetailsDto;
    }
}
