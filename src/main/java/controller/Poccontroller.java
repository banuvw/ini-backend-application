package controller;

import dto.UserDetailsDto;
import entity.UserDetails;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.UserDetailsService;


@RestController("/getUserDetails")
public class Poccontroller {

    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping("{userId}")
    public ResponseEntity getUserDetails(@PathVariable String userId){
        Optional<UserDetails> userDetailsDto = userDetailsService.getUserDetails(userId);
        return ResponseEntity.ok(userDetailsDto);
    }
}
