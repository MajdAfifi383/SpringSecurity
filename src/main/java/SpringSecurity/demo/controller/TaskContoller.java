package SpringSecurity.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/api/v1/task")
public class TaskContoller {
    @GetMapping("/taskdetails")
    public String getEmployeeDetails(){

        return "task details";
    }
}
