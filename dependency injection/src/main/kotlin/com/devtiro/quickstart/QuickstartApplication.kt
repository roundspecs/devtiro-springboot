package com.devtiro.quickstart

import com.devtiro.quickstart.services.ColorPrinter
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.logging.Logger

val logger = Logger.getLogger(QuickstartApplication::class.java.name)

@SpringBootApplication
class QuickstartApplication(val colorPrinter: ColorPrinter) : CommandLineRunner {
    override fun run(vararg args: String?) {
        logger.info(colorPrinter.print())
    }
}

fun main() {
    runApplication<QuickstartApplication>()
}
