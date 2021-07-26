package de.dynamaze.inventorysystem.model;

import lombok.*;

import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LeisureProvider {

    private UUID providerId=UUID.randomUUID();
    private String url;
    private String providerName;
    private Hint hintsDetail;
    private Map<UUID , LeisureActivity> activityDetails;

}
