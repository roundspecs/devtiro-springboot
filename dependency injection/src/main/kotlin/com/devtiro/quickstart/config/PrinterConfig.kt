package com.devtiro.quickstart.config

import com.devtiro.quickstart.services.*
import com.devtiro.quickstart.services.impl.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PrinterConfig {
    @Bean
    fun redPrinter(): RedPrinter = BnRedPrinterImpl()

    @Bean
    fun greenPrinter(): GreenPrinter = BnGreenPrinterImpl()

    @Bean
    fun bluePrinter(): BluePrinter = BnBluePrinterImpl()

    @Bean
    fun colorPrinter(): ColorPrinter = ColorPrinterImpl(redPrinter(), greenPrinter(), bluePrinter())
}