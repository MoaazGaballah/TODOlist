package com.todolist.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TodoMapper {

    TodoMapper INSTANCE = Mappers.getMapper(TodoMapper.class);

    TodoDTO entityToDTO(Todo todo);
    Todo DTOtoEntity(TodoDTO todoDTO);
}
