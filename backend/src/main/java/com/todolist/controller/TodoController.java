package com.todolist.controller;

import com.todolist.model.TodoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/todo-control")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    public ResponseEntity kaydet(@RequestBody TodoDTO todoDTO){
        try {
            todoService.kaydet(todoDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
        }
    }

    @GetMapping
    public ResponseEntity getAllTodo(){
        try{
            return ResponseEntity.ok(todoService.getAllTodo());
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
