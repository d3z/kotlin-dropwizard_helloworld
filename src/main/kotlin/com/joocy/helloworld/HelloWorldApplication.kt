package com.joocy.helloworld

import com.joocy.helloworld.health.TemplateHealthCheck
import com.joocy.helloworld.resources.HelloWorldResource
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class HelloWorldApplication : Application<HelloWorldConfiguration>() {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = HelloWorldApplication().run(*args)
    }

    override fun getName() = "hello-world"

    override fun run(config: HelloWorldConfiguration, env: Environment) {
        env.jersey().register(HelloWorldResource(config.template, config.defaultName))
        env.healthChecks().register("template", TemplateHealthCheck(config.template))
    }

    override fun initialize(bootstrap: Bootstrap<HelloWorldConfiguration>?) {
        super.initialize(bootstrap)
    }
}