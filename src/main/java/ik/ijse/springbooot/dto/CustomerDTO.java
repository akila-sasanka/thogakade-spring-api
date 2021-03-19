package ik.ijse.springbooot.dto;

import lombok.*;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/18/2021
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    String custID;
    String name;
    String address;
    String contact;
}
