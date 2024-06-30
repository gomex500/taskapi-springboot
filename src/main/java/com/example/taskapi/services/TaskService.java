package com.example.taskapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskapi.models.Task;
import com.example.taskapi.repository.TaskRepository;

@Service
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTaskById(long id){
        return taskRepository.findById(id).orElse(null);
    }

    public Task createtask(Task task){
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task taskDetail){
        Task task = taskRepository.findById(id).orElse(null);
        if (task != null) {
            task.setTitle(taskDetail.getTitle());
            task.setDescription(taskDetail.getDescription());
            task = taskRepository.save(task);
        }
        return task;
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

}
