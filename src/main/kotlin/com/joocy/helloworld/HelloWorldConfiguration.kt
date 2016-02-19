package com.joocy.helloworld

import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration

class HelloWorldConfiguration(@JsonProperty val template: String = "", @JsonProperty val defaultName: String = "") : Configuration() {
}