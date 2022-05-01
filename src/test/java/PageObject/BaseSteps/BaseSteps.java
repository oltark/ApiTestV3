package PageObject.BaseSteps;

import PageObject.BaseElements.FindElements;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.Assert.assertTrue;


/*
 public class BaseSteps extends FindElements {
    public static void login(){
        loginPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        loginPath.setValue("otarkhanov");
        passwordPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        passwordPath.setValue("123Qwerty");
        enterPath.click();
    }
    public static void authorizeAssertion(){
        authorizeAssert.shouldBe(visible);
        authorizeAssert.shouldHave(attribute("title", "Пользовательский профиль для otarkhanov"));
    }
    public static void hrefTasksClick(){
        hrefProject.click();
        hrefTestProject.click();
        tasks.click();
    }
     public static void issueCounting(){
        System.out.println(issueCount.getText());
    }

    public static void taskTestSelenium(){
        findTask.doubleClick();
        findTask.setValue("TestSelenium");
        testSeleniumTask.click();
        String actualStatusString = statusSeleniumTask.getText();
        System.out.println(actualStatusString);
        assertTrue(actualStatusString.contains("В РАБОТЕ"));
        String actualVersString = versionSeleniumTask.getText();
        System.out.println(actualVersString);
        assertTrue(actualVersString.contains("Version 2.0"));

    }

    public static void createBugReport(){

        createBugReportButton.click();
        issueType.click();
        summaryInput.shouldBe(visible, Duration.ofSeconds(60)).click();
        summaryInput.setValue("AutoTesting321");
        descriptionTxtButton.click();
        description.doubleClick();
        description.setValue("Description123");
        createIssueSubmit.click();
    }
    public static void changeStatus() {
        tasksHref.click();
        reportedByMeTasks.click();
        needToDoStatus.click();
        inWorkStatus.click();
        closedStatusDropdown.click();
        closedStatus.click();

    }
}
*/