//Страница входа в систему

//Класс содержит веб-элементы и соответствующие действия, показанные в приведенном ниже коде.

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    //Этот конструктор вызывается, как только создается объект класса LoginPage
    public LoginPage(WebDriver driver) {this.driver = driver;
    }

    //Локатор кнопки "У меня  уже есть аккаунт"
    By account = By.cssSelector("div.text-center a");

    //Локатор поля "Имя пользователя"
    By uName = By.id("email");

    //Локатор поля "Пароль"
    By pswd = By.id("pass");

    //Локатор кнопки входа в систему
    By loginBtn = By.cssSelector("button.btn.btn-success");



    //Метод нажимает на кнопку "У меня  уже есть аккаунт"
    public void clickAccount() {driver.findElement(account).click();
    }

    //Метод вводит имя пользователя
    public void enterUsername(String user) {driver.findElement(uName).sendKeys(user);
    }

    //Метод вводит пароль
    public void enterPassword(String pass) {driver.findElement(pswd).sendKeys(pass);
    }

    //Метод нажимает кнопку подтверждения входа
    public void clickLogin() {driver.findElement(loginBtn).click();
    }
}


//Начальная часть кода будет одинаковой для всех классов страницы,
//представляет собой Конструктор для инициализации фактического драйвера.

//By uName = By.id("userName") , By pswd = By.id("password") and By loginBtn = By.id("login") :
//Локаторы веб-элементов для поля имени пользователя, поля пароля и кнопки входа хранятся в uName, pswd и loginBtn
//соответственно с использованием класса By.

//Созданы методы, соответствующие каждому из действий веб-элемента, которые содержат код для действий веб-элементов.
// - Введите имя пользователя в поле username- public void enterUsername(String user): метод принимает строковое значение
//для имени пользователя, которое передается методу SendKeys с помощью кода driver.findElement(uName).SendKeys(user)
// - Введите пароль в поле password- public void enterPassword(String pass): метод принимает строковое значение
//для пароля, которое передается методу SendKeys с помощью кода driver.findElement(pswd).SendKeys(pass)
// - Нажмите на кнопку подтверждения входа- public void clickLogin() : метод не имеет аргумента и содержащегося в нем кода,
//т.е. driver.findElement(loginBtn).click() используется для нажатия на кнопку подтверждения входа