package com.joocy.helloworld.health

import com.codahale.metrics.health.HealthCheck

class TemplateHealthCheck(val template: String) : HealthCheck() {

    override fun check(): Result {
        val saying = template.format("TEST")
        return if (saying.contains("TEST")) Result.healthy()
               else Result.healthy("template does not include name")
    }
}