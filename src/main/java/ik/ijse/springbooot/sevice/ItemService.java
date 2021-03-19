package ik.ijse.springbooot.sevice;

import ik.ijse.springbooot.dto.ItemDTO;

import java.util.List;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/18/2021
 **/
public interface ItemService {
    void saveItem(ItemDTO dto);

    void updateItem(ItemDTO dto);

    ItemDTO searchItem(String id);

    void deleteItem(String id);

    List<ItemDTO> getAllItems();

}
