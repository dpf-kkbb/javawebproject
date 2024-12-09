package icu.sd.trade.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:
 * @Date:2024/12-8 10:59
 * @Version:v1.0.0
 * @Description:订单地址 实体类
 **/
@Data
public class OrderAddress  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long orderId;

    private String consigneeName;

    private String consigneePhone;

    private String detailAddress;

}
