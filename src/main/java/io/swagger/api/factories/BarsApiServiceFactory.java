package io.swagger.api.factories;

import io.swagger.api.BarsApiService;
import io.swagger.api.impl.BarsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-09T14:55:37.598-04:00")
public class BarsApiServiceFactory {
    private final static BarsApiService service = new BarsApiServiceImpl();

    public static BarsApiService getBarsApi() {
        return service;
    }
}
