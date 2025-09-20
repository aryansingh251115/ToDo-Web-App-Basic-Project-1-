package com.todoapp.service;

import com.todoapp.models.Task;
import com.todoapp.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {


    private final TaskRepository taskRepository;


    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String title, Date date) {
        Task task = new Task();
        task.setTaskName(title);
        task.setTaskCreationDate(LocalDate.now());
        task.setDeadline(date);
        task.setStatus("Not Done Yet");

        taskRepository.save(task);
    }


    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task id"));

        if ("Completed".equals(task.getStatus())) {
            task.setStatus("Pending");
        } else {
            task.setStatus("Completed");
        }

        taskRepository.save(task);
    }


}
