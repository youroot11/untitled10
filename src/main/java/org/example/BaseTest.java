import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://only.digital/");
        try {
            WebElement elementByXPath = driver.findElement(By.xpath("/html/body/main/footer"));
            System.out.println("Элемент 1 найден: " + elementByXPath.getText());
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Элемент 1 не найден.");
        }
        try {
            WebElement elementByXPath = driver.findElement(By.xpath("html/body/main/footer/div[1]"));
            System.out.println("Элемент 2 найден: " + elementByXPath.getText());
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Элемент 2 не найден.");
        }
        try {
            WebElement elementByXPath = driver.findElement(By.xpath("html/body/main/footer/div[1]/button"));
            System.out.println("Элемент 3 найден: " + elementByXPath.getText());
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Элемент 3 не найден.");
        }
        try {
            WebElement elementByXPath = driver.findElement(By.xpath("html/body/main/footer/div[1]/button/ук32к432е34е"));
            System.out.println("Элемент 4 найден: " + elementByXPath.getText());
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Элемент 4 не найден.");
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement elementToBePresent = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/main/footer/div[1]/button/ук32к432е34е")));
            System.out.println("Элемент, ожидаемый WebDriverWait, найден: " + elementToBePresent.getTagName());
        } catch (org.openqa.selenium.TimeoutException e) {
            System.out.println("Элемент не появился в течение 10 секунд.");
        }
        driver.quit();
    }
}
