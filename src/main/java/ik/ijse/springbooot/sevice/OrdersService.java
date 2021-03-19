package ik.ijse.springbooot.sevice;

import ik.ijse.springbooot.dto.ItemDTO;
import ik.ijse.springbooot.dto.OrdersDTO;

import java.util.List;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/19/2021
 **/
public interface OrdersService {
    void saveOrder(OrdersDTO dto);

    void updateOrder(OrdersDTO dto);

    ItemDTO searchOrder(String id);

    void deleteOrder(String id);

    List<OrdersDTO> getAllOrder();
}
