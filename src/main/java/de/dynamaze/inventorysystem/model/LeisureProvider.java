package de.dynamaze.inventorysystem.model;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
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

    
    LeisureProvider provider;

    @PostMapping("/provider")
    private void getProviderData(@RequestBody LeisureProvider provider_req){
    provider=provider_req;
    }

    @GetMapping("/leisureActivity")
    private LeisureProvider getData(){
        return provider;

    }
}
