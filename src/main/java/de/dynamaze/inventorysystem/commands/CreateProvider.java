package de.dynamaze.inventorysystem.commands;

import de.dynamaze.inventorysystem.model.LeisureActivity;

import java.util.Map;
import java.util.UUID;

public class CreateProvider {
    private UUID providerId=UUID.randomUUID();
    private String url;
    private String providerName;
    private Map<UUID , LeisureActivity> activityDetails;

    public CreateProvider(UUID providerId, String url, String providerName, Map<UUID, LeisureActivity> activityDetails) {
        this.providerId = providerId;
        this.url = url;
        this.providerName = providerName;
        this.activityDetails = activityDetails;
    }
}
