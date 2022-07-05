package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

        private final StudentService studentService;

        @Autowired
        public StudentController(StudentService studentService) {
            this.studentService = studentService;
        }

        @GetMapping
        public List<Student> getStudents(){
            return studentService.getStudents();
        }


//    @GetMapping
//    public List<Student> getStudents() {
//        return Arrays.asList(
//                new Student(
//                        id:1L, name:"William", email:"william@gmail.com", LocalDate.of(year:2000, Month.JANUARY, dayOfMonth:5 ), age:21
//                )
//        );
//    }


}
