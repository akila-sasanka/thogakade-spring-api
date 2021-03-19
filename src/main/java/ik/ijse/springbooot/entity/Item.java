package ik.ijse.springbooot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Entity
public class Item {
    @Id
    String code;
    String name;
    String type;
    String contity;
    double unitPrice;
    @OneToMany(mappedBy = "item",cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails=new ArrayList<>();
}
