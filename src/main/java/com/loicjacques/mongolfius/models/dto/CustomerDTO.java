package com.loicjacques.mongolfius.models.dto;

import com.loicjacques.mongolfius.models.entity.Customer;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CustomerDTO {
    private long id;
    private String username; // == email
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public static CustomerDTO of(Customer entity){
        if(entity == null){
            return null;
        }

        return CustomerDTO.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .birthDate(entity.getBirthDate())
                .build();
    }
}
