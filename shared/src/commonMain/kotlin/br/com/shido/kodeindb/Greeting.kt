package br.com.shido.kodeindb

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}