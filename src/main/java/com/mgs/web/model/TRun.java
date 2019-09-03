package com.mgs.web.model;

import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "test_run")
@Getter @Setter @NoArgsConstructor
@ToString(exclude = {"sendList", "receivedList"})

public class TRun extends AbstractBaseEntity{

    @NotBlank
    @Size(min = 1, max = 100)
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "start_time", columnDefinition = "timestamp default now()")
    @NotNull
    private Date startTime = new Date();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "test_id")
    private List<DataSend> sendList;

    @ManyToMany(mappedBy = "tRunList")
    private List<DataReceived> receivedList;

}
