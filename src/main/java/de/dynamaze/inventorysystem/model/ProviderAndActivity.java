package de.dynamaze.inventorysystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.mail.MailProperties;

import java.util.Map;

import java.util.Map;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class ProviderAndActivity {
    private LeisureProvider provider;
    private Map<UUID,LeisureActivity> leisureActivity;

    public ProviderAndActivity(LeisureProvider provider, Map<UUID, LeisureActivity> leisureActivity) {
        this.provider = provider;
        this.leisureActivity = leisureActivity;
    }
}
