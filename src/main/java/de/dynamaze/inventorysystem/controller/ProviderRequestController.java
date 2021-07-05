package de.dynamaze.inventorysystem.controller;

import de.dynamaze.inventorysystem.model.ProviderActivityData;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableScheduling
public class ProviderRequestController {

    ProviderActivityData datamodel=new ProviderActivityData();

    @PostMapping("/provider")
    public void getData(@RequestBody ProviderActivityData model){

        datamodel.setLink(model.getLink());
        datamodel.setHeadLine(model.getHeadLine());
        datamodel.setDescription(model.getDescription());
        datamodel.setHint(model.getHint());

        
    }

    @PostMapping("customer/date")
    public String date(@RequestBody ProviderActivityData model){
        datamodel.setDate(model.getDate());

        return "Date Selected";
    }

    @GetMapping("/display")
    @Scheduled(cron = "* * * * 7 *")
    public ProviderActivityData displayData(){
        datamodel.getDescription();
        datamodel.getHint();
        datamodel.getHeadLine();
        datamodel.getLink();

        return datamodel;

    }
}
