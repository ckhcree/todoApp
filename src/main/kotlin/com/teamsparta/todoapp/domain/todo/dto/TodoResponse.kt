package com.teamsparta.todoapp.domain.todo.dto

data class TodoResponse(
    val id: Long,
    val label: String,
    val title: String,
    val due: String?,
    val status: String,
    val time: Long,
)