package com.sula.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "TBL_PERSON", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "ID"
        })
})
@NoArgsConstructor
@AllArgsConstructor
public class Person extends BaseModel {
    @Column(name = "IDENTIFICATION_NUMBER", length = 20, unique = true, nullable = true)
    private String identificationNumber;

    @Column(name = "NAME", length = 200, nullable = true)
    private String name;

    @Column(name = "SURNAME", length = 200, nullable = true)
    private String surname;

    @Column(name = "BIRTH_DATE", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "EMAIL", length = 250, unique = true, nullable = true)
    private String email;

    @Column(name = "PHONE", length = 10, unique = true, nullable = true)
    private String phone;

    @Column(name = "DEFAULT_LANGUAGE", length = 10, nullable = true)
    private String language;


}
