package ik.ijse.springbooot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/18/2021
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemDTO {
    String code;
    String name;
    String type;
    String contity;
    double unitPrice;
}
