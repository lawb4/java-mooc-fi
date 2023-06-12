package Fundamentals_I.Part_6.JunitTesting.ExerciseManagement;

import org.junit.*;
import static org.junit.Assert.*;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    ///

    @Test
    public void exerciseListEmptyAtBeginning(){
        //ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        //ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList(){
        //ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }

    @Test   // mySample #1
    public void removingExerciseReducesListByOne() {
        management.remove("Write a test");
        assertEquals(0, management.exerciseList().size());
    }

    @Test   // mySample #2
    public void removedExerciseIsNotInList(){
        management.remove("Write a test");
        assertFalse(management.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
}

