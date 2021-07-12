package de.dynamaze.inventorysystem.controller;


import de.dynamaze.inventorysystem.descriptionModel.Description;
import lombok.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;


@Getter
@Setter
@RestController
@EnableScheduling
public class ProviderRequestController {

//    ProviderRequestController providerActivityData=new ProviderRequestController();

//    private List<String> headLine;

    Description description=new Description();
//    private List<String> hint;
//    private String link;
//
//    @DateTimeFormat(pattern = "yyyy-mm-dd")
//    private Date date;



    @PostMapping("/provider")
    private Description getData(@RequestBody Description descriptionInfo){



//        providerActivityData.setHeadLine(providerActivity.getHeadLine());
        this.description.setDescription(descriptionInfo.getDescription());
//        providerActivityData.setHint(providerActivity.getHint());
//        providerActivityData.setLink(providerActivity.getLink());
        return description;
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
