package ik.ijse.springbooot.controller;

import ik.ijse.springbooot.sevice.OrderDetailService;
import ik.ijse.springbooot.sevice.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/19/2021
 **/
@RestController
@RequestMapping("/api/v1/order")
@CrossOrigin
public class OrdersController {

    @Autowired
    OrdersService orderService;

    @Autowired
    OrderDetailService orderDetailService;

}
