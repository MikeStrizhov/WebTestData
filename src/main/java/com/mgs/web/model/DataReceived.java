package com.mgs.web.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "data_received")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"tRunList"})
//@AllArgsConstructor
public class DataReceived extends AbstractBaseEntity{
/*
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
*/

    @Column(name = "text", nullable = false)
    private String text;

    @ManyToMany
    @JoinTable(name = "jnd_test_rec", joinColumns = @JoinColumn(name = "reived_fk"), inverseJoinColumns = @JoinColumn(name = "test_fk"))
    private List<TRun> tRunList;
}
