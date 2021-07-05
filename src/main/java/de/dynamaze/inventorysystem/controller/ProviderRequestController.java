package de.dynamaze.inventorysystem.controller;

import de.dynamaze.model.DataModel;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableScheduling
public class ProviderRequestController {

    DataModel datamodel=new DataModel();

    @PostMapping("/provider")
    public DataModel getData(@RequestBody DataModel model){

        datamodel.setLink(model.getLink());
        datamodel.setHeadLine(model.getHeadLine());
        datamodel.setDescription(model.getDescription());
        datamodel.setHint(model.getHint());

        return datamodel;
    }

    @PostMapping("customer/date")
    public String date(@RequestBody DataModel model){
        datamodel.setDate(model.getDate());

        return "Date Selected";
    }

    @GetMapping("/display")
    @Scheduled(cron = "* * * * 7 *")
    public DataModel displayData(){
        datamodel.getDescription();
        datamodel.getHint();
        datamodel.getHeadLine();
        datamodel.getLink();

        return datamodel;

    }
}
