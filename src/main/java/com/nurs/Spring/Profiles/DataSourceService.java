package com.nurs.Spring.Profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataSourceService {

    private final DataSourceProvider dataSourceProvider;

    @Autowired
    public DataSourceService(DataSourceProvider dataSourceProvider) {
        this.dataSourceProvider = dataSourceProvider;
    }

    public String getDataSource() {
        return dataSourceProvider.getDataSource();
    }
}
