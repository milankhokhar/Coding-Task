package de.dynamaze.inventorysystem.commands;

import de.dynamaze.inventorysystem.model.LeisureActivity;
import lombok.Getter;

import java.util.Map;
import java.util.UUID;

@Getter
public class CreateProvider {

    private String url;
    private String providerName;
    private Map<UUID , LeisureActivity> activityDetails;

    public CreateProvider(String url, String providerName, Map<UUID, LeisureActivity> activityDetails) {

        this.url = url;
        this.providerName = providerName;
        this.activityDetails = activityDetails;
    }
}
