package com.example.orderservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;
@RequestMapping("/courses")
@RestController
public class CourseController {
    private final List<Course> courses = Arrays.asList(
            new Course(1, 1, "Product A"),
            new Course(2, 1, "Product B"),
            new Course(3, 2, "Product C"),
            new Course(4, 1, "Product D"),
            new Course(5, 2, "Product E"));

    @GetMapping
    public List<Course> getAllCourses() {
        return courses;
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable int id) {
        return courses.stream()
                     .filter(course -> course.getId() == id)
                     .findFirst()
                     .orElseThrow(IllegalArgumentException::new);
    }
}