# Autotest_Java_Test
## Тестовый проект по автоматизации тестирования на Java
### В качестве объект тестирования использовано тестовое веб-приложение: [PetFriends](https://petfriends.skillfactory.ru)
___
В рамках проекта показан пример реализации автоматизированного тестирования веб-интерфейса с применением Selenium Webdriver и паттерна PageObject.
Сам проект Java реализован с помощью инструмента сборки Maven. 

Тест проверяет:
* Открытие домашней страницы в веб-браузере Chrome
* Авторизацию в приложении
* Выход из приложения
___
**В корневой директории расположены:**
* директория src
* директория target, содержащая классы
* файл pom.xml, содержащий информация для программного проекта, в т.ч. все необходимые зависимости

**В директории /src расположены:**
* папка main
* папка test

**Директория /main/java** содержит пакет **pages**, в котором в соответствующих классах размещены объекты страниц приложения:
* HomePage - домашняя страница
* LoginPage - страница авторизации в приложении
* Dashboard - страница панели управления после входа в систему

Каждая страница содержит в себе конструктор класса, который вызывается, как только создается объект класса и описание методов конкретной страницы

**Директория /test/java** содержит пакет **testCases**, в котором в соответствующих классах размещены непосредственно тест-кейсы, проверяющие приложение:
На данный момент времени здесь пока 1 тестовый случай в качестве примера:
* Login_Test_1 - проверяет успешную авторизацию в приложении PetFriends
___
Окружение: Windows 11 Домашняя версия 21H2

Браузер: Google Chrome 124.0.6367.91 (64-bit)

[![What-is-Page-Object-Pattern.png](https://i.postimg.cc/RFGtn5JB/What-is-Page-Object-Pattern.png)](https://postimg.cc/sQQxtLJ6)
