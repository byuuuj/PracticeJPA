package com.example.uudomi.entity;

import com.example.uudomi.dto.MemberDto;
import lombok.*;

import javax.persistence.*;

// NoArgsConstructor : 매개변수 입력을 받지 않는 기본 생성자를 자동으로 생성해주는 어노테이션 ex) Member member = new Member();
// AllArgsConstructor : 매개변수 입력을 받는 생성자들을 자동으로 생성해주는 어노테이션 ex) Member member = new Member("name");

// 위의 어노테이션을 사용하는 이유는 @Entity와 @Builder를 동시에 사용하기 때문에!
// @Entity의 경우 매개변수가 없는 기본 생성자가 없다면 자동으로 만들어 준다. 그리고 @Builder의 경우 매개변수가 있는 생성자가 없다면 자동으로 만들어 준다.

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
