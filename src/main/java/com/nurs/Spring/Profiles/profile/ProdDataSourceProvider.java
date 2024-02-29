package com.nurs.Spring.Profiles.profile;

import com.nurs.Spring.Profiles.DataSourceProvider;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdDataSourceProvider implements DataSourceProvider {
    @Override
    public String getDataSource() {
        return "Prod DataSource";
    }
}
