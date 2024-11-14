package com.example.lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class PasswordComplexityTest {

    private final MainActivity mainActivity = new MainActivity();

    @Test
    public void testMissingUpperCase() {
        Assertions.assertFalse(mainActivity.checkPasswordComplexity("password1#"), "Password missing uppercase should fail");
    }

    @Test
    public void testMissingLowerCase() {
        Assertions.assertFalse(mainActivity.checkPasswordComplexity("PASSWORD1#"), "Password missing lowercase should fail");
    }

    @Test
    public void testMissingNumber() {
        Assertions.assertFalse(mainActivity.checkPasswordComplexity("Password#"), "Password missing number should fail");
    }

    @Test
    public void testMissingSpecialCharacter() {
        Assertions.assertFalse(mainActivity.checkPasswordComplexity("Password1"), "Password missing special character should fail");
    }

    @Test
    public void testAllRequirementsMet() {
        Assertions.assertTrue(mainActivity.checkPasswordComplexity("Password1#"), "Password with all requirements should pass");
    }
}