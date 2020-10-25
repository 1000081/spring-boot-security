package io.maha.springsecurityjdbc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="authorities")
public class Authorities implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userName")
    private Users users;

    private String authority;
}
