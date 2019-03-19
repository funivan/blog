package com.funivan.blog.build

import java.io.File

class HtmlFile(private val name: String, private val document: Html) {

    fun create() {
        val file = File("output/${name}.html")
        if (!file.exists()) {
            file.createNewFile()
        }
        file.writeText(document.toHtml())
    }
}