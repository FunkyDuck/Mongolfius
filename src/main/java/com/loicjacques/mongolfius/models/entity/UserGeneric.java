package com.loicjacques.mongolfius.models.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter @Setter
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
public class UserGeneric implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String username; // == email
    private String firstName;
    private String lastName;
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {return null;}

//    @Override
//    public String getUsername() {
//        return email;
//    }

    @Override
    public boolean isAccountNonExpired() {return true;}

    @Override
    public boolean isAccountNonLocked() {return true;}

    @Override
    public boolean isCredentialsNonExpired() {return true;}

    @Override
    public boolean isEnabled() {return true;}
}
