## REST API's

- we use @ResponseEntity to get the request manually interpreted by the developer
  
- we can add http status code according the textbook format like 201,202 etc and how the data will be represented to the user 
example  return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);

- we can also use ResponseEntity.ok to set the status code to 200 ok 
we can pass return ResponsEntity.ok(todo or what object or param we are working on).

- here we also used route with parameter to filter out the result on the basis of the param given in the route
@GetMapping("/todos/{todoid}")
  
- we use @PathVariable to tell the todoid parameter to take the value from the param pass with the route
eg: public ResponseEntity<Todo> getTodoById(@PathVariable long todoid)

## Versioning of API'S

- we can use different version of our api to use in our project

- we use @RequestMapping  to make versions of api like "/api/v1/todos"

- if any request start from particular route like "/api/v1/todos" i am gonna be map it to this .any request to this api i will map to this  
  so remove all the todos from the httpmapping below bcoz dont want double-double todos.

-we then tell our front end to work on the version1 for some time then after some time when it alacamatize with the new api we deprecate the old api with the help of @Deprecated annonation  
 
- we can deprecate or continue it we can use or hit version 2 of api like "/api/v2/todos"
which contains new features and existing features as well
 