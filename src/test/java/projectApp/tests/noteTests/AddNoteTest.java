package projectApp.tests.noteTests;

import org.junit.Test;
import projectApp.SampleTest;

public class AddNoteTest extends SampleTest {

    @Test
    public void firstTest1() {
        generalPageSteps.isPlusButton();
        generalPageSteps.clickOnPlusButton();
    }
}
