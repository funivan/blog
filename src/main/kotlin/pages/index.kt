package com.funivan.blog.pages

import com.funivan.blog.build.html
import kotlinx.html.body
import kotlinx.html.div

fun index() = html {
    body {
        div {
            +"Hello world"
        }
    }
}