package com.teamsparta.todoapp.domain.todoapplication.controller

import com.teamsparta.todoapp.TodoAppApplication
import com.teamsparta.todoapp.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.todoapp.domain.todoapplication.dto.AddTodoRequest
import com.teamsparta.todoapp.domain.todoapplication.dto.TodoApplicationResponse
import com.teamsparta.todoapp.domain.todoapplication.dto.UpdateApplicationStatusRecuest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping(value = arrayOf("/todos/{todoId}/applications"))
@RestController
class TodoApplicationController {

    @GetMapping
    fun getApplicationList(@PathVariable todoId: Long): ResponseEntity<List<TodoApplicationResponse>>{
        TODO()
    }

    @GetMapping("/{applicationId}")
    fun getApplication(@PathVariable todoId: Long,
    @PathVariable applicationId: Long
    ) : ResponseEntity<TodoApplicationResponse> {
        TODO()
    }

    @PostMapping
    fun addTodo(
        @PathVariable todoId: Long,
        addTodoRequest: AddTodoRequest
    ) : ResponseEntity<TodoApplicationResponse>{
        TODO()
    }

    @PatchMapping("/{applicationId}")
    fun updateTodoStatus(
        @PathVariable todoId: Long,
        @PathVariable applicationId: Long,
        @RequestBody updateApplicationstatusRequest: UpdateApplicationStatusRecuest,
    ) : ResponseEntity<TodoApplicationResponse>{
        TODO()
    }

}