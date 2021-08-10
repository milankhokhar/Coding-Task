package de.dynamaze.inventorysystem.controller;

import de.dynamaze.inventorysystem.commands.CreateActivity;
import de.dynamaze.inventorysystem.commands.CreateProvider;
import de.dynamaze.inventorysystem.model.LeisureActivity;
import de.dynamaze.inventorysystem.model.LeisureProvider;
import de.dynamaze.inventorysystem.model.ProviderAndActivity;
import lombok.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@RestController
public class LeisureActivityController {


    private ProviderAndActivity providerAndActivity;


    @PostMapping("/provider")
    private void getProviderData(@RequestBody ProviderAndActivity providerAndActivity){
        this.providerAndActivity=providerAndActivity;

    }

    @PostMapping("/customer/selectedDate")
    private String dateSelection(@RequestBody CreateActivity customerDate){

        return "Date Selected";
    }

    @GetMapping("/leisureActivity")
    @Scheduled(cron = "* * * * 7 *")
    private ProviderAndActivity displayLeisureActivity(){
        return providerAndActivity;
    }
}
