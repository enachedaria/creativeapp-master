package com.creativeapp.creativeapp.models.userProgress;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="userProgress")
public class UserProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long userId;

    //private String username ?TODO: sortare useri dupa total time: ArrayAdapter

    @Column
    private long totalTime; //tip de data pt timer din android
}
