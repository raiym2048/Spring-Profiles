package com.nurs.Spring.Profiles.profile;

import com.nurs.Spring.Profiles.DataSourceProvider;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class DevDataSourceProvider implements DataSourceProvider {
    @Override
    public String getDataSource() {
        return "Dev DataSource";
    }
}
