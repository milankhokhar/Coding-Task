package de.dynamaze.inventorysystem.controller;


import de.dynamaze.inventorysystem.descriptionModel.Description;
import de.dynamaze.inventorysystem.headLineModel.HeadLine;
import lombok.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Getter
@Setter
@RestController
@EnableScheduling
public class ProviderRequestController {

//    ProviderRequestController providerActivityData=new ProviderRequestController();

//    private List<String> headLine;

    Description description=new Description();
    HeadLine headLine=new HeadLine();
//    private List<String> hint;
//    private String link;
//
//    @DateTimeFormat(pattern = "yyyy-mm-dd")
//    private Date date;



    @PostMapping("/provider")
    private void getData(@RequestBody Description descriptionInfo, @RequestBody HeadLine headLineInfo){



//        providerActivityData.setHeadLine(providerActivity.getHeadLine());
        description.setDescription(descriptionInfo.getDescription());
        headLine.setHeadLine(headLineInfo.getHeadLine());
//        providerActivityData.setHint(providerActivity.getHint());
//        providerActivityData.setLink(providerActivity.getLink());
        System.out.println(description+"headline"+headLine);
    }

//    @PostMapping("/customer/date")
//    private String date(@RequestBody ProviderRequestController providerActivity){
//
//        providerActivityData.setDate(providerActivity.getDate());
//
//        return "Date Selected";
//    }
//
//    @GetMapping("/display")
//    @Scheduled(cron = "* * * * 7 *")
//    public ProviderRequestController displayData(ProviderRequestController providerActivityData){
//        return providerActivityData;
//
//    }
}
