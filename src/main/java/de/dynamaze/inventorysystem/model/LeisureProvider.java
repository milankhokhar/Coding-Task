package de.dynamaze.inventorysystem.model;

import lombok.*;


import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter
public class LeisureProvider {

    private UUID providerId=UUID.randomUUID();
    private String url;
    private String providerName;
    private Map<UUID , LeisureActivity> activityDetails;

    public LeisureProvider(String url, String providerName, Map<UUID, LeisureActivity> activityDetails) {
        this.url = url;
        this.providerName = providerName;
        this.activityDetails = activityDetails;
    }


}
