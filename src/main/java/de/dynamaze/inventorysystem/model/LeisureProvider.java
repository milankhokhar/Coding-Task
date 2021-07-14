package de.dynamaze.inventorysystem.model;

import lombok.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RestController
public class LeisureProvider extends LeisureActivity {
    
    private String url;
    private String provider_name;

    @PostMapping("/provider")
    private LeisureProvider getProviderData(@RequestBody LeisureProvider provider){

       return provider;
    }
}
