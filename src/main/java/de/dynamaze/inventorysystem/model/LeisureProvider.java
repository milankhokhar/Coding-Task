package de.dynamaze.inventorysystem.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@RestController
public class LeisureProvider extends LeisureActivity {

    private String url;
    private String provider_name;

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date selected_date;


    LeisureProvider provider;

    @PostMapping("/provider")
    private void getProviderData(@RequestBody LeisureProvider provider_req){
        provider=provider_req;
    }

    @PostMapping("/customer/selected_Date")
    private String dateSelection(@RequestBody LeisureProvider customer_date){
        provider.setSelected_date(customer_date.getSelected_date());
        return "Date Selected";
    }

    @GetMapping("/leisureActivity")
    @Scheduled(cron = "* * * * 7 *")
    private LeisureProvider displayLeisureActivity(){
        return provider;
    }
}
