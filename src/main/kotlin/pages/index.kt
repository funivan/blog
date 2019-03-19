package com.funivan.blog.pages

import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.html
import kotlinx.html.stream.createHTML

fun index() = createHTML().html {
    body {
        div {
            +"Hello world"
        }
    }
}