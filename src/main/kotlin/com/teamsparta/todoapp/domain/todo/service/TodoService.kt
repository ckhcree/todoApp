package com.teamsparta.todoapp.domain.todo.service

import com.teamsparta.todoapp.domain.card.dto.AddCardRequest
import com.teamsparta.todoapp.domain.card.dto.CardResponse
import com.teamsparta.todoapp.domain.card.dto.UpdateCardRequest
import com.teamsparta.todoapp.domain.todo.dto.CreateTodoRequest
import com.teamsparta.todoapp.domain.todo.dto.TodoResponse
import com.teamsparta.todoapp.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.todoapp.domain.todoapplication.dto.AddTodoRequest
import com.teamsparta.todoapp.domain.todoapplication.dto.TodoApplicationResponse

interface TodoService {
    fun getAllTodoList(): ArrayList<TodoResponse>

    fun getTodoById(todoId: Long): TodoResponse

    fun createTodo(todo: CreateTodoRequest): TodoResponse

    fun updateTodo(todoId: Long, request: UpdateTodoRequest): TodoResponse

    fun deleteCourse(courseId: Long)

    fun  getTodoListByIds(listId: Long): List<CardResponse>

    fun getTodo(todoId: Long, cardId: Long): CardResponse

    fun addCard(todoId: Long, request: AddCardRequest): CardResponse

    fun updateCard(
        todoId: Long,
        cardId: Long,
        request: UpdateCardRequest
    ): CardResponse

    fun removeCard(todoId: Long, cardId: Long)

    fun addTodo(todoId: Long, request: AddTodoRequest): TodoApplicationResponse

    fun getTodoApplication(
        todoId: Long,
        applicationId: Long
    ): TodoApplicationResponse

    fun getTodoApplicationList(todoId: Long): List<TodoApplicationResponse>

}