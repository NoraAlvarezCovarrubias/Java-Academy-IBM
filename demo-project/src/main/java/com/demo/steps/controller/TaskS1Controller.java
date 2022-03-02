package com.demo.steps.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.demo.steps.entities.Task;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/tasks")
public class TaskS1Controller {
	
	private final List<Task> taskList= new ArrayList<>();

	@GetMapping("")
	public ResponseEntity< List<Task> > fetchAllTask(){
		
        return ResponseEntity.ok().body(taskList);
	}

	@PostMapping("")
	public ResponseEntity<Task> postTask(@RequestBody Task newTask){
		newTask.setActive(false);
		newTask.setCreateAt(LocalDateTime.now());
		
		long id = taskList.size()+1;
		
		newTask.setId(id);
		taskList.add(newTask);
		return ResponseEntity.status(HttpStatus.CREATED).body(newTask);
	}	
	
	@GetMapping("/{taskId}")
	public ResponseEntity< Task > fetchTaskById(@PathVariable("taskId") Long taskId){
		
		return taskList
			.stream()
			.filter( current -> taskId == current.getId() ) //Por cada elemento en la lista va a hacer la comparacion
			.findFirst() //Cuando encuentra la primer coincidencia de la condicion de arriba (lo cual significa que no regresa null), hace la siguiente linea de map
			.map(task -> ResponseEntity.ok().body(task) )
			.orElse( ResponseEntity.status(HttpStatus.NOT_FOUND).build()); //Quiere decir que regreso null en la condicion del filter
		
       // return ResponseEntity.ok().body(taskList);
	}

	@DeleteMapping("/{taskId}")
	public ResponseEntity<?> deleteTask( @PathVariable("taskId") Long taskId){
		return taskList
				.stream()
				.filter( current -> taskId == current.getId() )
				.findFirst()
				.map( task -> {
					taskList.remove(task);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				})
				.orElse( ResponseEntity.status(HttpStatus.NOT_FOUND).build());
		
		//return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

    @PutMapping("/{taskId}")
	public ResponseEntity<Task>  putTask( @PathVariable("taskId") Long taskId, @RequestBody Task updatesTask){
    	
    	return taskList
				.stream()
				.filter( current -> taskId == current.getId() )
				.findFirst()
				.map(task -> {
					task.setTitle( updatesTask.getTitle());
					task.setDescription( updatesTask.getDescription());
					task.setUpdatedAt(LocalDateTime.now());
					return ResponseEntity.ok().body(task);
				})
				.orElse( ResponseEntity.status(HttpStatus.NOT_FOUND).build());
        //ResponseEntity.ok().body("update");
	}

}
