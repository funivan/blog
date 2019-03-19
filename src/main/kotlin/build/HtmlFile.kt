package com.funivan.blog.build

import java.io.File

class HtmlFile(private val name: String, private val content: String) {

    fun create() {
        val file = File("output/${name}.html")
        if (!file.exists()) {
            file.createNewFile()
        }
        file.writeText(content)
    }
}