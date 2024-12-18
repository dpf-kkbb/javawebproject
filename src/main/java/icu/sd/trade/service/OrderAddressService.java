package icu.sd.trade.service;

import icu.sd.trade.entity.OrderAddress;

/**
 * @Author:
 * @Date:2024/12-8 11:02
 * @Version:v1.0.0
 * @Description:订单地址 业务持久层
 **/
public interface OrderAddressService {
    /**
     * 为订单添加地址信息
     *
     * @param orderAddress 订单地址信息
     * @return 结果
     */
    boolean addOrderAddress(OrderAddress orderAddress);

    /**
     * 更新订单的地址信息
     *
     * @param orderAddress 订单信息
     * @return 结果
     */
    boolean updateOrderAddress(OrderAddress orderAddress);

    /**
     * 获取订单的地址信息
     *
     * @param orderId 订单id
     * @return 订单地址信息
     */
    OrderAddress getOrderAddress(Long orderId);

}
