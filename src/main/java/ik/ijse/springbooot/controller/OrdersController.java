package ik.ijse.springbooot.controller;

import ik.ijse.springbooot.dto.CustomerDTO;
import ik.ijse.springbooot.dto.OrdersDTO;
import ik.ijse.springbooot.sevice.OrderDetailService;
import ik.ijse.springbooot.sevice.OrdersService;
import ik.ijse.springbooot.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addOrder(@RequestBody OrdersDTO dto) {

        orderService.saveOrder(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity updateOrder(@RequestBody OrdersDTO dto) {
        orderService.updateOrder(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteOrder(@RequestParam String id) {
        System.out.println("controller"+id);
        orderService.deleteOrder(id);

        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity getAllOrders() {
        List<OrdersDTO> allCustomers = orderService.getAllOrder();
        return new ResponseEntity(new StandradResponse(200, "Success", allCustomers), HttpStatus.OK);
    }
}


