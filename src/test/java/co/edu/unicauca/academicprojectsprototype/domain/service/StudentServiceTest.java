package co.edu.unicauca.academicprojectsprototype.domain.service;

import co.edu.unicauca.academicprojectsprototype.access.IStudentRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import co.edu.unicauca.academicprojectsprototype.domain.services.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MockStudentRepository implements IStudentRepository {
    private List<Student> students = new ArrayList<>();

    @Override
    public void initializeDatabase() {
        // No-op for mock
    }

    @Override
    public boolean save(Student newStudent) {
        return students.add(newStudent);
    }

    @Override
    public List<Student> listAll() {
        return new ArrayList<>(students);
    }

    @Override
    public Student search(String code) {
        return students.stream()
                .filter(student -> student.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}

public class StudentServiceTest {
    private StudentService studentService;
    private IStudentRepository repository;

    @BeforeEach
    public void setUp() {
        // Initialize the mock repository
        repository = new MockStudentRepository();

        // Create an instance of StudentService
        studentService = StudentService.getInstance(repository);
    }

    @Test
    public void testSaveStudent() {
        // Arrange
        Student student = new Student("123", "John Doe", "1234567890", "john.doe@example.com", "password");

        // Act
        boolean result = studentService.save(student);

        // Assert
        assertTrue(result, "El estudiante debe ser guardado exitosamente");
        List<Student> students = repository.listAll();
        assertEquals(1, students.size(), "Debe haber un estudiante registrado");
        assertEquals(student, students.get(0), "El estudiante guardado debe coincidir");
    }
    /*
    @Test
    public void testListAllStudents() {
        // Arrange
        Student student1 = new Student("123", "John Doe", "1234567890", "john.doe@example.com", "password");
        Student student2 = new Student("456", "Jane Doe", "0987654321", "jane.doe@example.com", "password");
        Student student3 = new Student("145","Oscar t", "1234569","oscar.t@example.com", "password");
        studentService.save(student1);
        studentService.save(student2);
        studentService.save(student3);

        // Act
        List<Student> students = studentService.listAll();

        // Assert
        assertEquals(2, students.size(), "Debe haber dos estudiantes registrados");
        assertTrue(students.contains(student1), "La lista debe contener al primer estudiante");
        assertTrue(students.contains(student2), "La lista debe contener al segundo estudiante");
    }

    @Test
    public void testSearchStudent() {
        // Arrange
        Student student = new Student("123", "John Doe", "1234567890", "john.doe@example.com", "password");
        studentService.save(student);

        // Act
        Student foundStudent = studentService.Search("123");

        // Assert
        assertNotNull(foundStudent, "El estudiante debe ser encontrado");
        assertEquals(student, foundStudent, "El estudiante encontrado debe coincidir");
    }
    */
    @Test
    public void testSearchStudent_NotFound() {
        // Act
        Student foundStudent = studentService.Search("999");

        // Assert
        assertNull(foundStudent, "No debe encontrar un estudiante con un código inexistente");
    }
}