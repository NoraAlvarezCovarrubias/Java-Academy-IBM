package com.demo.steps.controller;

import java.util.List;

import com.demo.steps.entities.Task;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/tasks")
public class TaskS1Controller {

	@GetMapping("/all")
	public ResponseEntity< List<Task> > fetchAllTask(){		
        return null;
        //ResponseEntity.ok().body("all tasks");
	}

	@PostMapping("/save")
	public ResponseEntity<Task> postTask(Task newTask){
		return null;
        // ResponseEntity.status(HttpStatus.CREATED).body("task created");
	}	

	@DeleteMapping("/delete")
	public ResponseEntity<Void> deleteTask( Long taskId){
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

    @PutMapping("/update")
	public ResponseEntity<Task>  putTask( Long TaskId, Task updatesTask){
		return null;
        //ResponseEntity.ok().body("update");
	}

}
