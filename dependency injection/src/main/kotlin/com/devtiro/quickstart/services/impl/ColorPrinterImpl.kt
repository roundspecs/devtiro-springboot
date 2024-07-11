package com.devtiro.quickstart.services.impl

import com.devtiro.quickstart.services.*

class ColorPrinterImpl(val redPrinter: RedPrinter, val greenPrinter: GreenPrinter, val bluePrinter: BluePrinter) :
    ColorPrinter {
    override fun print(): String {
        return "${redPrinter.print()} ${greenPrinter.print()} ${bluePrinter.print()}"
    }
}