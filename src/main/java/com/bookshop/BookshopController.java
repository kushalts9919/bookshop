package com.bookshop;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/bookshop")
public class BookshopController {

    @Get
    public String getDefault() {
        return "Hello World";
    }

    @Get("/rahul")
    public String getRahul() {
        return "Hello Rahul";
    }
}
