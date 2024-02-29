package com.nurs.Spring.Profiles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {
    private final DataSourceService dataSourceService;


    @GetMapping("/getDataSource")
    public String getDataSource() {
        return dataSourceService.getDataSource();
    }
}
