package com.joocy.helloworld.api

import com.fasterxml.jackson.annotation.JsonProperty


data class Saying(@JsonProperty val id: Long, @JsonProperty val content: String)