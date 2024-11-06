import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Tests for CM111 GradeBook Project
 * @author  Joseph Kendall-Morwick <Joseph.Kendall-Morwick@washburn.edu>
 */
public class StudentTest {
    
        
    @Test
    public void checkpoint1Test1() {
        assertEquals(75, Student.getExamAverage(54, 82, 64, 73, 81));
    }

    @Test
    public void checkpoint1Test2() {
        assertEquals(100, Student.getExamAverage(100, 100, 100, 100, 0));
    }

    @Test
    public void checkpoint1Test3() {
        assertEquals(75, Student.getExamAverage(100, 100, 100, 0, 0));
    }

    @Test
    public void checkpoint1Test4() {
        assertEquals(75, Student.getExamAverage(100, 0, 100, 100, 0));
    }

    @Test
    public void checkpoint1Test5() {
        assertEquals(85, Student.getExamAverage(81, 100, 10, 90, 70));
    }

    @Test
    public void checkpoint1Test6() {
        assertEquals(86, Student.getExamAverage(83, 100, 13, 90, 70));
    }


}

