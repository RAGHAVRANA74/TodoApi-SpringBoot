## New Annoantions used in REST API's

-we use @ResponseEntity to get the request manually interpreted by the developer
  
-we can add http status code according the textbook format like 201,202 etc and how the data will be represented to the user 
example  return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);

-we can also use ResponseEntity.ok to set the status code to 200 ok 
we can pass return ResponsEntity.ok(todo or what object or param we are working on).

-here we also used route with parameter to filter out the result on the basis of the param given in the route
@GetMapping("/todos/{todoid}")
we use @PathVariable to tell the todoid parameter to take the value from the param pass with the route
eg: public ResponseEntity<Todo> getTodoById(@PathVariable long todoid)
