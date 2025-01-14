package com.example.webflux_example.config;

import com.example.webflux_example.handler.ItemHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ItemRouter {

    @Bean
    public RouterFunction<ServerResponse> itemRouters(ItemHandler itemHandler) {
        return RouterFunctions.route()
                .GET("/api/v1/functions/item", itemHandler::getAllItem)
                .GET("/api/v1/functions/item/{id}", itemHandler::findById)
                .POST("/api/v1/functions/item", itemHandler::createItem)
                .GET("/api/v1/functions/error", itemHandler::errorRequest)
                .build();
    }
}
