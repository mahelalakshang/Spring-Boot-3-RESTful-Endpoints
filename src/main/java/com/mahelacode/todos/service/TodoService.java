package com.mahelacode.todos.service;

import com.mahelacode.todos.request.TodoRequest;
import com.mahelacode.todos.response.TodoResponse;

import java.util.List;

public interface TodoService {
    List<TodoResponse> getAllTodos();
    TodoResponse createTodo(TodoRequest todoRequest);
    TodoResponse toggleTodoCompletion(long id);
    void deleteTodo(long id);
}
