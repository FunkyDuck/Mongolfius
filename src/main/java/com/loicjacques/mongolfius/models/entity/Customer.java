package com.loicjacques.mongolfius.models.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
@Getter @Setter
public class Customer extends UserGeneric{
    private LocalDate birthDate;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(
                new SimpleGrantedAuthority("ROLE_USER"),
                new SimpleGrantedAuthority("READ")
        );
    }
}
