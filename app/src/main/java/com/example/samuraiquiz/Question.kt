package com.example.samuraiquiz

data class Question (

    val id: Int,
    val question: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctOption: Int,
)