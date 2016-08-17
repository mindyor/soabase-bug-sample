package com.hello.config;

import com.hello.resources.HelloWorldResource;
import io.soabase.guice.JerseyGuiceModule;

public class GuiceModule extends JerseyGuiceModule {

    @Override
    protected void configureServlets() {
        this.bind(HelloWorldResource.class);
    }
}
