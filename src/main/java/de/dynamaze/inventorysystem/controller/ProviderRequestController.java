package de.dynamaze.inventorysystem.controller;



import lombok.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;


@Getter
@Setter
@RestController
@EnableScheduling
public class ProviderRequestController {




    @PostMapping("/provider")
    private void getData(@RequestBody ProviderRequestController providerRequestControllerInfo){



    }

    @PostMapping("/customer/date")
    private void date(){


    }

    @GetMapping("/display")
 //   @Scheduled(cron = "* * * * 7 *")
    public void displayData(){


    }
}
