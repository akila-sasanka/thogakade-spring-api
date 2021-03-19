package ik.ijse.springbooot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
@Entity
public class Orders {
    @Id
    String orderID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "custID",referencedColumnName = "custID")
    private Customer customer;

    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails=new ArrayList<>();
}
