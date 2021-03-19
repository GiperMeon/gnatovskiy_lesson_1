package com.example.gnatovskiyer_lesson_1.data

import java.time.Year

data class Students (
    val id : Int = 0,
    val name : String = "none",
    val surname : String = "none",
    val grade : String = "none",
    val birthdayYear: Year = Year.now()
)