package com.naomi.movieapp.model;

import com.naomi.movieapp.model.enumeration.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
//@Entity
public class Admin extends User{
    @Enumerated(EnumType.STRING)
    private Role role;

}
