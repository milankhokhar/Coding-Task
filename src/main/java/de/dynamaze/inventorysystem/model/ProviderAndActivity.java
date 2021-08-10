package de.dynamaze.inventorysystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.mail.MailProperties;

import java.util.Map;

import java.util.Map;

@NoArgsConstructor
public class ProviderAndActivity {
    private Map<LeisureProvider,LeisureActivity> providerWithActivity;

    public ProviderAndActivity(Map<LeisureProvider, LeisureActivity> providerWithActivity) {
        this.providerWithActivity = providerWithActivity;
    }
}
