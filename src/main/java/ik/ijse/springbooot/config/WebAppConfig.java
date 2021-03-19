package ik.ijse.springbooot.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Akila Sasanka <akilasasanka1998@gmail.com>
 * @since : 3/17/2021
 **/
@Configuration
public class WebAppConfig {
    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }
}
