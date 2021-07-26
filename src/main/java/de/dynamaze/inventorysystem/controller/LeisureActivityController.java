package de.dynamaze.inventorysystem.controller;

import de.dynamaze.inventorysystem.model.LeisureActivityDetails;
import de.dynamaze.inventorysystem.model.LeisureProviders;
import lombok.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@RestController
public class LeisureActivityController {


    LeisureProviders provider;
    List<LeisureActivityDetails> date;

    @PostMapping("/provider")
    private void getProviderData(@RequestBody LeisureProviders providerReq){
        provider=providerReq;
    }

//    @PostMapping("/customer/selectedDate")
//    private String dateSelection(@RequestBody List<LeisureActivityDetails> customerDate){
//        date.set();
//        return "Date Selected";
//    }

    @GetMapping("/leisureActivity")
    @Scheduled(cron = "* * * * 7 *")
    private LeisureProviders displayLeisureActivity(){
        return provider;
    }
}
