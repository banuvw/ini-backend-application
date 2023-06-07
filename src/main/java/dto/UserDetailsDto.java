package dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDetailsDto {

    private String userId;

    List<UserInfoDto> userDetailsList;
}
