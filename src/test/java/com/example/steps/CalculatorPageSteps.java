package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class CalculatorPageSteps extends BaseTest {
    @And("user input Angka 1 {string}")
    public void userInput(String angka1) {
        calculatorPage.inputAngka1(angka1);
    }

    @And("user input Angka 2 {string}")
    public void userInputAngka(String angka2) {
        calculatorPage.inputAngka2(angka2);
    }

    @And("user click addition symbol")
    public void userClickAdditionSymbol() {
        calculatorPage.operator();
        calculatorPage.addition();
    }

    @And("user click button equals")
    public void userClickButtonEquals() {
        calculatorPage.equals();
    }

    @Then("user successfully do it")
    public void userSuccessfullyDoIt() {
        //getText
        String resultText = calculatorPage.getResult();
        String finalResult = resultText.substring(8);
        Assertions.assertEquals("3",  finalResult);
    }

    @And("user click subtraction symbol")
    public void userClickSubtractionSymbol() {
        calculatorPage.operator();
        calculatorPage.subtraction();
    }

    @Then("user successfully do subtraction")
    public void userSuccessfullyDoSubtraction() {
        String resultText = calculatorPage.getResult();
        String finalResult = resultText.substring(8);
        Assertions.assertEquals("8",  finalResult);
    }

    @And("user click multiplication symbol")
    public void userClickMultiplicationSymbol() {
        calculatorPage.operator();
        calculatorPage.multiplication();
    }

    @Then("user successfully do multiplication")
    public void userSuccessfullyDoMultiplication() {
        String resultText = calculatorPage.getResult();
        String finalResult = resultText.substring(8);
        Assertions.assertEquals("15",  finalResult);
    }

    @And("user click division symbol")
    public void userClickDivisionSymbol() {
        calculatorPage.operator();
        calculatorPage.division();
    }

    @Then("user successfully do division")
    public void userSuccessfullyDoDivision() {
        String resultText = calculatorPage.getResult();
        String finalResult = resultText.substring(8);
        Assertions.assertEquals("2",  finalResult);
    }


    @And("user do long press")
    public void userDoLongPress() {
        calculatorPage.longPress();
    }

    @And("user do tap multiple times")
    public void userDoTapMultipleTimes() {
        calculatorPage.tapMultipleTimes();
    }
}
