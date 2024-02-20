package com.zerobase.user.domain.model;

import com.zerobase.user.domain.model.BaseEntity;
import com.zerobase.user.domain.model.Customer;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBalanceHistory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = Customer.class, fetch = FetchType.LAZY)
    private Customer customer;

    //변경된 돈
    private Integer changeMoney;

    // 해당 시점의 돈
    private Integer currentMoney;

    private String fromMessage;

    private String description;
}
