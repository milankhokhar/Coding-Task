package de.dynamaze.inventorysystem.controller;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RestController
@EnableScheduling
public class ProviderRequestController {


    private List<String> headLine;
    private List<String> description;
    private List<String> hint;
    private String link;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date;


    ProviderRequestController datamodel=new ProviderRequestController();

    @PostMapping("/provider")
    public void getData(@RequestBody ProviderRequestController model){

        datamodel.setLink(model.getLink());
        datamodel.setHeadLine(model.getHeadLine());
        datamodel.setDescription(model.getDescription());
        datamodel.setHint(model.getHint());


    }

    @PostMapping("customer/date")
    public String date(@RequestBody ProviderRequestController model){
        datamodel.setDate(model.getDate());

        return "Date Selected";
    }

    @GetMapping("/display")
    @Scheduled(cron = "* * * * 7 *")
    public ProviderRequestController displayData(){
        datamodel.getDescription();
        datamodel.getHint();
        datamodel.getHeadLine();
        datamodel.getLink();

        return datamodel;

    }
}
