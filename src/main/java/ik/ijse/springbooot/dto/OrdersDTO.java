package ik.ijse.springbooot.dto;

import lombok.*;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/19/2021
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class OrdersDTO {
    String orderID;
    String custID;
}
