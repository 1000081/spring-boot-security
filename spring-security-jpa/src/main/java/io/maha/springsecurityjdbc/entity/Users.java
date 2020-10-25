package io.maha.springsecurityjdbc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name="users")
public class Users implements Serializable {
    @Id
    private String userName;
    private String password;
    private boolean enabled;
}
