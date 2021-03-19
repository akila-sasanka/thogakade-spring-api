package ik.ijse.springbooot.repo;


import ik.ijse.springbooot.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/19/2021
 **/
public interface OrdersRepo extends JpaRepository<Orders,String> {

}
