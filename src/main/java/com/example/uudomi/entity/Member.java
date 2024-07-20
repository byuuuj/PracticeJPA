package com.example.uudomi.entity;

import com.example.uudomi.dto.MemberDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Builder
    public Member(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
