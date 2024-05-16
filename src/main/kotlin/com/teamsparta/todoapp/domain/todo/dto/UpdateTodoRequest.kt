package com.teamsparta.todoapp.domain.todo.dto

data class UpdateTodoRequest(
    val label: String,
    val title: String,
    val due: String?,
)
