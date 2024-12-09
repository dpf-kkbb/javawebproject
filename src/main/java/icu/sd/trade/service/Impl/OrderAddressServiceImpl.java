package icu.sd.trade.service.Impl;

import icu.sd.trade.entity.OrderAddress;
import icu.sd.trade.mapper.OrderAddressMapper;
import icu.sd.trade.service.OrderAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:
 * @Date:2024/12-8 11:03
 * @Version:v1.0.0
 * @Description:订单地址 服务实现类
 **/
@Service
public class OrderAddressServiceImpl implements OrderAddressService {
    @Resource
    private OrderAddressMapper orderAddressMapper;

    @Override
    public boolean addOrderAddress(OrderAddress orderAddressModel) {
        return orderAddressMapper.insert(orderAddressModel) == 1;
    }

    @Override
    public boolean updateOrderAddress(OrderAddress orderAddressModel) {
        orderAddressModel.setOrderId(null);
        return orderAddressMapper.updateByPrimaryKeySelective(orderAddressModel) == 1;
    }

    @Override
    public OrderAddress getOrderAddress(Long orderId) {
        return orderAddressMapper.selectByOrderId(orderId);
    }

}
