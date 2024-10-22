package com.example.spoonacularapp.model

data class AnalyzeRecipeRequest(
    val title: String,
    val ingredients: List<String>,
    val servings: Int
)