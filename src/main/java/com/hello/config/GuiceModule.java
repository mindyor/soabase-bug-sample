package com.hello.config;

import com.google.inject.AbstractModule;
import com.hello.resources.HelloWorldResource;

public class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(HelloWorldResource.class);
    }
}
