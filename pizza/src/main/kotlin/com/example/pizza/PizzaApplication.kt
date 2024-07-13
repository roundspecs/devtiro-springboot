package com.example.pizza

import com.example.pizza.config.PizzaConfig
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.logging.Logger

val logger = Logger.getLogger("PizzaApplication")!!

@SpringBootApplication
class PizzaApplication(val pizzaConfig: PizzaConfig) : CommandLineRunner {
	override fun run(vararg args: String?) {
		logger.info("${pizzaConfig.crust} ${pizzaConfig.sauce} ${pizzaConfig.toppings}")
	}
}

fun main(args: Array<String>) {
	runApplication<PizzaApplication>(*args)
}
