package com.todolist.controller;

import com.todolist.model.TodoDTO;
import com.todolist.model.TodoMapper;
import com.todolist.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    @Transactional
    public void kaydet(TodoDTO todoDTO){
        this.todoRepository.save(TodoMapper.INSTANCE.DTOtoEntity(todoDTO));
    }

    @Transactional(readOnly = true)
    public List<TodoDTO> getAllTodo(){
        return this.todoRepository.findAll().stream().map( todo -> TodoMapper.INSTANCE.entityToDTO(todo)).collect(Collectors.toList());
    }
}
