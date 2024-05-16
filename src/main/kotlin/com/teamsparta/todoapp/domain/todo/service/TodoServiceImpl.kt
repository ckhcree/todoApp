package com.teamsparta.todoapp.domain.todo.service

import com.teamsparta.todoapp.domain.card.dto.AddCardRequest
import com.teamsparta.todoapp.domain.card.dto.CardResponse
import com.teamsparta.todoapp.domain.card.dto.UpdateCardRequest
import com.teamsparta.todoapp.domain.exception.ModelNotFoundException
import com.teamsparta.todoapp.domain.todo.dto.CreateTodoRequest
import com.teamsparta.todoapp.domain.todo.dto.TodoResponse
import com.teamsparta.todoapp.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.todoapp.domain.todoapplication.dto.AddTodoRequest
import com.teamsparta.todoapp.domain.todoapplication.dto.TodoApplicationResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class TodoServiceImpl: TodoService {

    override fun getAllTodoList(): ArrayList<TodoResponse> {
        TODO("Not yet implemented")
    }

    override fun getTodoById(todoId: Long): TodoResponse {
        TODO("Not yet implemented") //코드작성 필요
        throw ModelNotFoundException(modelName = "Todo", id = 1L)
    }

    @Transactional
    override fun createTodo(todo: CreateTodoRequest): TodoResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateTodo(todoId: Long, request: UpdateTodoRequest): TodoResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun deleteCourse(courseId: Long) {
        TODO("Not yet implemented")
    }

    override fun getTodoListByIds(listId: Long): List<CardResponse> {
        TODO("Not yet implemented")
    }

    override fun getTodo(todoId: Long, cardId: Long): CardResponse {
        TODO("Not yet implemented")
    }

    override fun addCard(todoId: Long, request: AddCardRequest): CardResponse {
        TODO("Not yet implemented")
    }

    override fun updateCard(todoId: Long, cardId: Long, request: UpdateCardRequest): CardResponse {
        TODO("Not yet implemented")
    }

    override fun removeCard(todoId: Long, cardId: Long) {
        TODO("Not yet implemented")
    }

    override fun addTodo(todoId: Long, request: AddTodoRequest): TodoApplicationResponse {
        TODO("Not yet implemented")
    }

    override fun getTodoApplication(todoId: Long, applicationId: Long): TodoApplicationResponse {
        TODO("Not yet implemented")
    }

    override fun getTodoApplicationList(todoId: Long): List<TodoApplicationResponse> {
        TODO("Not yet implemented")
    }

}