package com.teamsparta.todoapp.domain.card.controller

import com.teamsparta.todoapp.domain.card.dto.AddCardRequest
import com.teamsparta.todoapp.domain.card.dto.CardResponse
import com.teamsparta.todoapp.domain.card.dto.UpdateCardRequest
import com.teamsparta.todoapp.domain.todo.service.TodoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/todos/{todoId}/cards")
@RestController
class CardController(private val todoService: TodoService) {

    @GetMapping
    fun getCardList(@PathVariable todoId: Long): ResponseEntity<List<CardResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getCardList(todoId))
    }

    @GetMapping("/{cardId}")
    fun getCard(@PathVariable todoId: Long, @PathVariable cardId: Long): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getCard(todoId, CardId))
    }

    @PostMapping
    fun addCard(
        @PathVariable todoId: Long,
        @RequestBody addCardRequest: AddCardRequest
    ): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.addCard(todoId, addCardRequest))
    }

    @PutMapping("/{cardId}")
    fun updateCard(
        @PathVariable todoId: Long,
        @PathVariable cardId: Long,
        @RequestBody updateCardRequest: UpdateCardRequest
    ): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.updateCard(todoId, cardId, updateCardRequest))
    }

    @DeleteMapping("/{cardId}")
    fun removeCard(
        @PathVariable todoId: Long,
        @PathVariable cardId: Long
    ): ResponseEntity<Unit> {
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }
}