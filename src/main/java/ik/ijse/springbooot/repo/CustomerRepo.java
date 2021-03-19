package ik.ijse.springbooot.repo;

import ik.ijse.springbooot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/18/2021
 **/
public interface CustomerRepo extends JpaRepository<Customer,String> {


}
