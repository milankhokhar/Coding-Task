package de.dynamaze.inventorysystem.controller;

import de.dynamaze.inventorysystem.model.LeisureActivity;
import de.dynamaze.inventorysystem.model.LeisureProvider;
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


    private LeisureProvider provider;


    @PostMapping("/provider")
    private void getProviderData(@RequestBody LeisureProvider providerReq){
        provider=providerReq;

    }

    @PostMapping("/customer/selectedDate")
    private String dateSelection(@RequestBody LeisureActivity customerDate){

        return "Date Selected";
    }

    @GetMapping("/leisureActivity")
    @Scheduled(cron = "* * * * 7 *")
    private LeisureProvider displayLeisureActivity(){
        return provider;
    }
}
