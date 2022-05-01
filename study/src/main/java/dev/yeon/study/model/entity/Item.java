package dev.yeon.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    private String content;

    // 1 : N

    // LAZY = 지연 로딩, EAGER = 즉시 로딩
    // LAZY = SELECT * FROM item where id = ?
    // 변수에 대해서 getMethod 호출을 하지 않는 이상 연관관계가 설정된 테이블에서 SELECT X

    // EAGER = 1:1에서 보통
    // 연관관계가 설정된 모든 테이블에서 조인을 함. 성능 저하 위험
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
    private List<OrderDetail> orderDetailList;
}
