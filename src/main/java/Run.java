import repository.IStudentRepository;
import repository.InMemStudentRepository;
import service.IStudentService;
import service.StudentService;
import utils.ExcelUtils;

import java.io.IOException;
import java.util.Scanner;

/**
 * this class to run the program
 */
public class Run {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        IStudentRepository studentRepository = new InMemStudentRepository();
//        IStudentService studentService = new StudentService(studentRepository);
//
//        StudentManager studentManager = new StudentManager(studentService, scanner);
//
//        studentManager.run();
        ExcelUtils.createChart();
    }
}