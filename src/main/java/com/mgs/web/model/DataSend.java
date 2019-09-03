package com.mgs.web.model;

import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "data_send")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DataSend extends AbstractBaseEntity {
/*    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;*/

    @Column(name = "text", nullable = false)
    private String text;
}
