package org.rover.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.rover.model.Student;
import org.rover.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class StudentResource {

    private final StudentService studentService;
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentResource.class);

    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "HelloWorld";
    }

    @RequestMapping("/student/{studentId}")
    @Operation(summary = "return a specific student", method = "GET")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Get student by studentId", content = {@Content (mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema (implementation = Student.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
    })
    public Student getStudent(@PathVariable("studentId") int studentId){
        return studentService.getStudentById(studentId);
    }
}
