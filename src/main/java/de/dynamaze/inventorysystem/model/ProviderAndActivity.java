package de.dynamaze.inventorysystem.model;

import de.dynamaze.inventorysystem.commands.CreateActivity;
import de.dynamaze.inventorysystem.commands.CreateProvider;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.UUID;

@Getter
@NoArgsConstructor
public class ProviderAndActivity {

    private Map<UUID, LeisureActivity> activityDetails;

    public ProviderAndActivity(ProviderAndActivity providerAndActivity){
        this.activityDetails=providerAndActivity.getActivityDetails();
    }
}
