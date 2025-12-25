package com.conceptandcoding.learingspringboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1/todos")


/*
@RequestMapping if any request start from particular route like "/api/v1/todos" i am gonna be map it to this .any request to this api i will map to this
so remove all the todos from the mapping below dont want double double todos

 */

public class TodoController
{

    private static List<Todo> todoList;

    public TodoController(){
        todoList = new ArrayList<>();
        todoList.add(new Todo (1,false , "todo 1", 1));
        todoList.add(new Todo (2,true  , "todo 2", 2));
    }

 @GetMapping("/")
 public ResponseEntity<List<Todo>> getTodos()
 {
     return ResponseEntity.ok(todoList);
 }

 @PostMapping("/")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo newTodo) {



        /* responseEntity help you to handle that what you are actually sending to the client manually.
          we can use this annonation to set the status code @RespoonseStatus(HttpStatus.CREATED)



         */
     todoList.add(newTodo);
     return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);

 }

 @GetMapping("/{todoid}")
    public ResponseEntity<Todo> getTodoById(@PathVariable long todoid)
 {

     /*
     @pathVariable is used to tell that the long todoid is the path param {todoid}and it have to take
     that value as a parameter.
      */
     for(Todo todo : todoList)
     {
         if (todo.getId() == todoid)
         {
             return ResponseEntity.ok(todo);
         }
     }
     return ResponseEntity.notFound().build();
 }



 }




