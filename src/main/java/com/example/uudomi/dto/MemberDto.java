package com.example.uudomi.dto;

import com.example.uudomi.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String name;
    private int age;

    public Member toEntity() {
        return Member.builder().id(id).name(name).age(age).build();
    }
}
