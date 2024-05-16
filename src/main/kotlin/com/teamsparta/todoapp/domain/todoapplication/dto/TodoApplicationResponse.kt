package com.teamsparta.todoapp.domain.todoapplication.dto

import com.teamsparta.todoapp.domain.todo.dto.TodoResponse
import com.teamsparta.todoapp.domain.user.dto.UserResponse

data class TodoApplicationResponse (
    val id: Long,
    val todo: TodoResponse,
    val user: UserResponse,
    val status: String
)
