package ik.ijse.springbooot.sevice.impl;

import ik.ijse.springbooot.dto.ItemDTO;
import ik.ijse.springbooot.dto.OrderDetailsDTO;
import ik.ijse.springbooot.dto.OrdersDTO;
import ik.ijse.springbooot.sevice.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/19/2021
 **/
@Service
@Transactional
public class OrderDetailServiceImpl implements OrderDetailService {

    @Override
    public void saveOrderDetail(OrderDetailsDTO dto) {

    }

    @Override
    public void updateOrderDetail(OrderDetailsDTO dto) {

    }

    @Override
    public ItemDTO searchOrderDetail(String id) {
        return null;
    }

    @Override
    public void deleteOrderDetail(String id) {

    }

    @Override
    public List<OrdersDTO> getAllOrderDetails() {
        return null;
    }
}
