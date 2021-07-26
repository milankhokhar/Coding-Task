package de.dynamaze.inventorysystem.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LeisureProviders  {

    private Long providerId;
    private String url;
    private String providerName;


    private Map<Long, LeisureActivityDetails> activityDetails;

}
