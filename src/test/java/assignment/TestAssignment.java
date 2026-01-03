package assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junitpioneer.jupiter.DisableIfTestFails;
import assignment.testing.framework.BaseAssignment;

import static org.junit.jupiter.api.Assertions.*;
import static assignment.testing.framework.Utilities.*;

import java.lang.reflect.AccessFlag;
import java.util.List;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Assignment Title")
public class TestAssignment extends BaseAssignment
{
    @DisplayName("Assignment Task #01")
    @Order(1)
    @Test()
    public void searchTest() {

        int[] arr = {76,87,89,95,1,56,34,22};
        int target = 33;

        Search ls = new Search(arr);
        int actualResult = ls.linearSearch(target);
        assertEquals(actualResult,-1);
        assertEquals(ls.linearSearch(34),6);
        assertEquals(ls.linearSearch(76),0);
        assertEquals(ls.linearSearch(22),7);


    }
    @DisplayName("Assignment Task #02")
    @Order(2)
    @Test()
    public void stepsTest() {

        int[] arr = {76,87,89,95,1,56,34,22};
        int target = 33;

        Search ls = new Search(arr);
        int actualResult = ls.stepsLinearSearch(target);
        assertEquals(actualResult,8);
        assertEquals(ls.stepsLinearSearch(34),7);
        assertEquals(ls.stepsLinearSearch(76),1);
        assertEquals(ls.stepsLinearSearch(22),8);

    }


}
