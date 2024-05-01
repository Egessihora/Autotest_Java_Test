//Страница панели управления после входа в систему

//Как только мы войдем в систему, мы увидим заголовок страницы и найдем кнопку выхода, чтобы выйти из приложения

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

    WebDriver driver;

    //Этот конструктор вызывается, как только создается объект класса Dashboard
    public Dashboard(WebDriver driver) {this.driver=driver;
    }

    //Локаторы главной страницы и кнопки выхода
    By heading = By.cssSelector("div[class='text-center']");
    By logoutBtn = By.cssSelector("div.header_button button");

    //Метод получает заголовок страницы
    public String getHeading() {
        String head = driver.findElement(heading).getText();
        return head;
    }

    //Метод нажимает на кнопку выхода из приложения
    public void clickLogout() {driver.findElement(logoutBtn).click();
    }
}

//By heading = By.xpath("//div[@class="main-header"]") and By logoutBtn = By.id("submit"):
//Класс By определяет местоположение заголовка, который мы ищем, на веб-странице, используя xpath,
//а кнопку выхода - используя идентификатор.

//Затем создайте метод, public String getHeading() для извлечения текста из веб-элемента heading.

//Мы используем метод getText() в виде строки, который возвращает заголовок.

//Мы создаем метод, public void clickLogout() для нажатия кнопки выхода с помощью метода click().