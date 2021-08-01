package com.functions.springcloudfunction;

import java.util.function.Function;

public class FunctionAsClass implements Function<String,String> {
    @Override
    public String apply(String s) {
        return "Serverless functional programming : " + s;
    }
}
