package com.funivan.blog

import com.funivan.blog.build.HtmlFile
import com.funivan.blog.pages.decoratorsA1
import com.funivan.blog.pages.index

fun main() {
    val files = listOf(
        HtmlFile("index", index()),
        HtmlFile("decorators", decoratorsA1())
    )
    files.forEach { it.create() }
}
