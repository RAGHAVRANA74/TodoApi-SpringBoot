package com.conceptandcoding.learingspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController

public class TodoController {

    private static List<Todo> todoList;

    public TodoController(){
        todoList = new ArrayList<>();
        todoList.add(new Todo (1,false , "todo 1", 1));
        todoList.add(new Todo (2,true  , "todo 2", 2));
    }

 @GetMapping("/todos")
 public List <Todo> getTodos()
 {
     return todoList;
 }

 @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo newTodo){ //RequestBody tells that the data of  newTodo(just a variable name) is of same type as of the request springboot will create the object itself .
        todoList.add(newTodo);
        return newTodo;

 }



}
