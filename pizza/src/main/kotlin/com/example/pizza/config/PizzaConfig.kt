package com.example.pizza.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "pizza")
data class PizzaConfig(
    var sauce: String? = null,
    var crust: String? = null,
    var toppings: String? = null,
)
