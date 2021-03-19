package ik.ijse.springbooot.sevice;

import ik.ijse.springbooot.dto.ItemDTO;
import ik.ijse.springbooot.dto.OrderDetailsDTO;
import ik.ijse.springbooot.dto.OrdersDTO;

import java.util.List;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/19/2021
 **/
public interface OrderDetailService  {
    void saveOrderDetail(OrderDetailsDTO dto);

    void updateOrderDetail(OrderDetailsDTO dto);

    ItemDTO searchOrderDetail(String id);

    void deleteOrderDetail(String id);

    List<OrdersDTO> getAllOrderDetails();
}
