package ik.ijse.springbooot.controller;

import ik.ijse.springbooot.dto.CustomerDTO;
import ik.ijse.springbooot.dto.ItemDTO;
import ik.ijse.springbooot.sevice.ItemService;
import ik.ijse.springbooot.util.StandradResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/18/2021
 **/
@RestController
@RequestMapping("/api/v1/item")
@CrossOrigin
public class ItemController {

    @Autowired
    ItemService itemService;



    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addCustomer(@RequestBody ItemDTO dto) {

        itemService.saveItem(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity updateItem(@RequestBody ItemDTO dto) {
        itemService.updateItem(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteItem(@RequestParam String id) {
        System.out.println("controller"+id);
        itemService.deleteItem(id);

        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity getAlleItems() {
        List<ItemDTO> allCustomers = itemService.getAllItems();
        return new ResponseEntity(new StandradResponse(200, "Success", allCustomers), HttpStatus.OK);
    }

}
