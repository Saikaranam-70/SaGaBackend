package com.SaGa.Project.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dmqqn9fld",
                "api_key", "875331722775911",
                "api_secret", "PwvZtGOczu-N8-URFnPvdWhcxeY",
                "secure", true
        ));
    }
}
