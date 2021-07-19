package de.dynamaze.inventorysystem.controller;

import de.dynamaze.inventorysystem.model.Providers;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@RestController
public class LeisureActivityController extends Providers {



    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date selectedDate;


    LeisureActivityController provider;

    @PostMapping("/provider")
    private void getProviderData(@RequestBody LeisureActivityController providerReq){
        provider=providerReq;
    }

    @PostMapping("/customer/selectedDate")
    private String dateSelection(@RequestBody LeisureActivityController customerDate){
        provider.setSelectedDate(customerDate.getSelectedDate());
        return "Date Selected";
    }

    @GetMapping("/leisureActivity")
    @Scheduled(cron = "* * * * 7 *")
    private LeisureActivityController displayLeisureActivity(){
        return provider;
    }
}
