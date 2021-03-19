package ik.ijse.springbooot.sevice.impl;

import ik.ijse.springbooot.dto.ItemDTO;
import ik.ijse.springbooot.entity.Customer;
import ik.ijse.springbooot.entity.Item;
import ik.ijse.springbooot.repo.CustomerRepo;
import ik.ijse.springbooot.repo.ItemRepo;
import ik.ijse.springbooot.sevice.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/18/2021
 **/
@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveItem(ItemDTO dto) {
        if (!repo.existsById(dto.getCode())){
            Item item = mapper.map(dto, Item.class);
            repo.save(item);
        } else {
            throw new RuntimeException("Customer already exist..!");
        }

    }

    @Override
    public void updateItem(ItemDTO dto) {

    }

    @Override
    public ItemDTO searchItem(String id) {
        return null;
    }

    @Override
    public void deleteItem(String id) {

    }

    @Override
    public List<ItemDTO> getAllItems() {
        return null;
    }
}
