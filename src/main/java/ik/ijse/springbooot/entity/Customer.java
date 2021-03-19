package ik.ijse.springbooot.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/18/2021
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class Customer {
    @Id
    String custID;
    String name;
    String address;
    String contact;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Orders> orders=new ArrayList<>();
}
