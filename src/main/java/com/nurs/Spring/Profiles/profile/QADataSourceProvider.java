package com.nurs.Spring.Profiles.profile;

import com.nurs.Spring.Profiles.DataSourceProvider;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QADataSourceProvider implements DataSourceProvider {
    @Override
    public String getDataSource() {
        return "QA DataSource";
    }
}
