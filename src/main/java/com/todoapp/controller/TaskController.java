package com.todoapp.controller;


import com.todoapp.models.Task;
import com.todoapp.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
//@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;


    @GetMapping
    public String getTasks(Model model) {
        List<Task> allTasks = taskService.getAllTasks();
        model.addAttribute("tasks", allTasks);
        return "tasks";
    }

    @PostMapping("/")
    public String createTask(@RequestParam String title, Date date) {
        taskService.createTask(title, date);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTasks(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id) {
        taskService.toggleTask(id);
        return "redirect:/";
    }

}
