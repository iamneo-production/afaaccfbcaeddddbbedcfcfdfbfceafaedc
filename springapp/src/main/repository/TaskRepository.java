package com.examly.springapp.src.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.src.main.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long>{
  
}
