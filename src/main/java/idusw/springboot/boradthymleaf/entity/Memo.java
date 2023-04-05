package idusw.springboot.boradthymleaf.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // 엔티티 클래스임으로 나타내는 에노테이션
@Table(name = "tbl_memo")
@ToString   // lombok 라이브러리 사용
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // Oracle : GenerationType.SEQUENCE, Mysql : GenerationType.
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
