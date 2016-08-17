package com.hello;

import com.hello.config.GuiceModule;
import com.hello.config.AppConfiguration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.soabase.guice.GuiceBundle;
import io.soabase.guice.ConfigurationInjectorProvider;

public class Application extends io.dropwizard.Application<AppConfiguration> {
    public static void main(String... args) throws Exception {
        new Application().run(args);
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {

        bootstrap.addBundle(new GuiceBundle<>(new ConfigurationInjectorProvider<>(new GuiceModule())));
    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {
    }
}
