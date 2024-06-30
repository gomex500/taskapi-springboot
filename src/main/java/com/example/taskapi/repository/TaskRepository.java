package com.example.taskapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taskapi.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
