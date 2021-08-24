package de.dynamaze.inventorysystem.controller;

import de.dynamaze.inventorysystem.commands.CreateActivity;
import de.dynamaze.inventorysystem.model.LeisureProvider;
import de.dynamaze.inventorysystem.model.ProviderAndActivity;
import lombok.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@RestController
public class LeisureActivityController {


    private ProviderAndActivity providerAndActivity;
    private LeisureProvider provider;

    @PostMapping("/provider/activity")
    private void getProviderAndActivityData(@RequestBody ProviderAndActivity providerAndActivity){
        this.providerAndActivity=providerAndActivity;

    }

    @PostMapping("/provider")
    private void getProviderData(@RequestBody LeisureProvider provider){
        this.provider=provider;
    }


    @PostMapping("/customer/selectedDate")
    private String dateSelection(@RequestBody CreateActivity customerDate){

        return "Date Selected";
    }

    @GetMapping("/provider/id")
    private LeisureProvider displayProviders(@RequestParam(required = false) UUID id){
        return provider;
    }

    @GetMapping("/leisureActivity/id")
    private ProviderAndActivity displayLeisureActivity(@RequestParam(required = false) UUID id){
        return providerAndActivity;
    }
}
