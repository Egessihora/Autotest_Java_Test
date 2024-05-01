//После создания необходимых классов для разных страниц мы теперь создадим тестовый класс с шагами выполнения.
//Эти шаги будут ссылаться на репозиторий объектов, созданный для разных элементов страницы.

package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.Dashboard;
import pages.HomePage;
import pages.LoginPage;


public class Login_Test_1 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nstart browser for test");
        System.out.println("Test_1 \nПроверка успешной авторизации в приложении PetFriends");

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://petfriends.skillfactory.ru");

        //Создаем объект домашней страницы
        HomePage home = new HomePage(driver);

        //Создаем объект страницы входа
        LoginPage login = new LoginPage(driver);

        //Создаем объект страницы панели управления
        Dashboard dashboard = new Dashboard(driver);

        //Нажимаем на кнопку входа
        home.clickLogin();

        //Нажимаем на "У меня  уже есть аккаунт"
        login.clickAccount();

        //Вводим имя пользователя и пароль
        login.enterUsername("test_mail_ab@inbox.ru");
        login.enterPassword("test_password_ab");

        //Нажимаем на кнопку подтверждения входа
        login.clickLogin();
        Thread.sleep(3000);

        //Получаем заголовок страницы и выводим его в консоли
        System.out.println("Заголовок страницы --- " +dashboard.getHeading());

        //Проверяем, что текст заголовка страницы - "Все питомцы наших пользователей"
        Assert.assertEquals(dashboard.getHeading(), "Все питомцы наших пользователей");

        //Нажимаем на кнопку выхода из системы
        dashboard.clickLogout();

        System.out.println("\nquit browser");

        //Закрываем браузер
        driver.quit();
    }

}

//System.setProperty("webdriver.chrome.driver", "---Точный путь к chromedriver.exe---"):
//Мы настроили системные свойства, чтобы найти chromdriver.exe в нашей локальной системе.

//WebDriver driver = new ChromeDriver(): Экземпляр драйвера Chrome создается с использованием объекта класса WebDriver.

//driver.get("https://www.demoqa.com/books"): Используя метод webdriver get(), мы переходим к тестовому URL.

//Далее мы создадим объекты всех трех созданных нами классов страниц:
//- HomePage home = new HomePage(driver);
//- LoginPage login = new LoginPage(driver);
//- Dashboard dashboard = new Dashboard(driver).
//Как обсуждалось в классе первой страницы (HomePage) о конструкторах, аргумент передается при создании объекта
//каждого класса. Этот драйвер является фактическим драйвером, который инициализирует драйвер в классе страницы.
//После создания объектов каждого класса мы теперь можем легко ссылаться на любой метод с классом.

//Теперь мы выполним наши тестовые шаги:
// - home.clickLogin(): Используя объект класса HomePage, мы ссылаемся на метод clickLogin().
//- Как только мы попадаем на страницу входа, мы используем объект класса Login для использования методов
//enterUsername("ваше имя пользователя"), enterPassword("ваш пароль"), и clickLogin().
//Обратите внимание, что вы можете создать свое собственное имя пользователя и пароль, а затем передать их
//в качестве аргументов метода.

//Далее мы запишем заголовок страницы и нажмем на выход из системы, используя объект класса Dashboard.
//
//Мы получим доступ к методам getHeading() и clickLogout().

//После выполнения всех действий мы закрываем экземпляр браузера с помощью driver.quit().