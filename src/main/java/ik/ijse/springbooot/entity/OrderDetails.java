package ik.ijse.springbooot.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/19/2021
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class OrderDetails {
    @Id
    String odID;
    String qty;
    double unitPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderID",referencedColumnName = "orderID")
    private Orders orders;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "itemCode",referencedColumnName = "code")
    private Item item;
}
