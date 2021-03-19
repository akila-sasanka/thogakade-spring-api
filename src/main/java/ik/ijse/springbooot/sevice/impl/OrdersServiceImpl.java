package ik.ijse.springbooot.sevice.impl;

import ik.ijse.springbooot.dto.ItemDTO;
import ik.ijse.springbooot.dto.OrdersDTO;
import ik.ijse.springbooot.entity.Item;
import ik.ijse.springbooot.entity.Orders;
import ik.ijse.springbooot.repo.OrdersRepo;
import ik.ijse.springbooot.sevice.OrdersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/19/2021
 **/
@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveOrder(OrdersDTO dto) {
        if (!repo.existsById(dto.getOrderID())){
            Orders orders = mapper.map(dto, Orders.class);
            repo.save(orders);
        } else {
            throw new RuntimeException("Customer already exist..!");
        }
    }

    @Override
    public void updateOrder(OrdersDTO dto) {

    }

    @Override
    public ItemDTO searchOrder(String id) {
        return null;
    }

    @Override
    public void deleteOrder(String id) {

    }

    @Override
    public List<OrdersDTO> getAllOrder() {
        return null;
    }
}
