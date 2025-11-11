package com.hackathon.tasktracker.Repository;

import com.hackathon.tasktracker.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
