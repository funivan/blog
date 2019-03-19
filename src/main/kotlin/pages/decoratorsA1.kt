package com.funivan.blog.pages

import com.funivan.blog.build.html
import kotlinx.html.body
import kotlinx.html.div

fun decoratorsA1() = html {
    body {
        div {
            +"Decorators Title"
        }
    }
}