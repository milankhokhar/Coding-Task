package de.dynamaze.inventorysystem.model;

import de.dynamaze.inventorysystem.commands.CreateProvider;
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

    public LeisureProvider(CreateProvider command) {
        this.url = command.getUrl();
        this.providerName = command.getProviderName();
        this.activityDetails = command.getActivityDetails();
    }


}
