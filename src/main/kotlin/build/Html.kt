package com.funivan.blog.build

import kotlinx.html.HTML
import kotlinx.html.html
import kotlinx.html.stream.createHTML

fun html(block: HTML.() -> Unit = {}) = Html(block = block)

class Html(private val block: HTML.() -> Unit = {}) {
    fun toHtml() = createHTML().html(block = block)
}