package com.teamsparta.todoapp.domain.todo.dto

data class CreateTodoRequest(
    val label: String,
    val title: String,
    val due: String?,
)