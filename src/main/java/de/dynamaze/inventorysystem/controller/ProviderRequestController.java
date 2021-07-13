package de.dynamaze.inventorysystem.controller;


import de.dynamaze.inventorysystem.descriptionModel.Description;
import de.dynamaze.inventorysystem.headLineModel.HeadLine;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Getter
@Setter
@RestController
@EnableScheduling
public class ProviderRequestController {


    @PostMapping("/provider")
    private void getData(){


    }

    @PostMapping("/customer/date")
    private void date(){


    }

    @GetMapping("/display")
 //   @Scheduled(cron = "* * * * 7 *")
    public void displayData(){


    }
}
