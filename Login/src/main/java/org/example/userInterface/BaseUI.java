package org.example.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BaseUI {

    public static final Target USERNAME_FIELD = Target.the("username field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

    public static final Target PASSWORD_FIELD = Target.the("password field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

    public static final Target MY_INFO_MENU = Target.the("My Info menu option")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a"));

    public static final Target FIRST_NAME_FIELD = Target.the("first name input field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input"));

    public static final Target LAST_NAME_FIELD = Target.the("last name input field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input"));

    public static final Target SAVE_BUTTON = Target.the("save button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"));

    // 👇 Nuevos targets para sección PIM y Salary
    public static final Target PIM_MENU = Target.the("PIM menu option")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span"));

    public static final Target EMPLOYEE_NAME_SEARCH = Target.the("employee name search input")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));

    public static final Target SEARCH_BUTTON = Target.the("search button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));

    public static final Target EMPLOYEE_RESULT = Target.the("employee search result")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div"));

    public static final Target SALARY_TAB = Target.the("Salary tab in employee profile")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[7]/a"));

    public static final Target ADD_SALARY_BUTTON = Target.the("Add salary button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button"));

    public static final Target SALARY_COMPONENT_INPUT = Target.the("Salary component input")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"));

    public static final Target PAY_GRADE = Target.the("Pay grade dropdown")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));

    public static final Target PAY_GRADE_OPTION_GRADE1 = Target.the("Pay Grade option Grade 1")
            .located(By.xpath("//div[@role='listbox']//span[text()='Grade 1']"));

    public static final Target PAY_FREQUENCY = Target.the("Pay frequency dropdown")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));

    public static final Target PAY_FREQUENCY_OPTION_MONTHLY = Target.the("Pay Frequency option Monthly")
            .located(By.xpath("//div[@role='listbox']//span[text()='Monthly']"));

    public static final Target CURRENCY = Target.the("Currency dropdown")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));

    public static final Target CURRENCY_OPTION_USD = Target.the("Currency option USD")
            .located(By.xpath("//div[@role='listbox']//span[text()='United States Dollar']"));

    public static final Target AMOUNT = Target.the("Amount input")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input"));

    public static final Target COMMENTS = Target.the("Comments textarea")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div/div/div[2]/textarea"));

    public static final Target SAVE_SALARY_BUTTON = Target.the("Save salary button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button[2]"));

    // 👇 Targets para la sección de Buzz
    public static final Target BUZZ_TAB = Target.the("Buzz tab")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a"));

    public static final Target MOST_LIKED_POST_BUTTON = Target.the("Most liked post button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/button[2]"));

    public static final Target FIRST_POST_LIKE_BUTTON = Target.the("Like button on the first post")
            .located(By.xpath("//*[@id=\"heart\"]"));

    public static final Target FIRST_POST_COMMENT_BUTTON = Target.the("Comment input on the first post")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/div/div[3]/div[1]/button[1]/i"));

    public static final Target FIRST_POST_COMMENT_INPUT = Target.the("Comment input on the first post")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/div/div[4]/div/form/div/div[2]/input"));

    // Cierre de sesion
    public static final Target PROFILE_DROPDOWN = Target.the("profile dropdown")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p"));

    public static final Target LOGOUT_BUTTON = Target.the("logout button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a"));

}
