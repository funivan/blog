package com.funivan.blog.pages

import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.html
import kotlinx.html.stream.createHTML

fun decoratorsA1() = createHTML().html {
    body {
        div {
            +"Decorators Title"
        }
    }
}