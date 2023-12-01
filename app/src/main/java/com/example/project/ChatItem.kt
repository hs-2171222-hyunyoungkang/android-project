package com.example.project

data class ChatItem(
    val senderId: String,
    val message: String
){
    constructor(): this("","")
}