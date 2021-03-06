### Single Responsibility Principle - Task 4 for ShoppingListApplication
[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/dashboard?id=javaGuruBY_java-free-stream-5)  
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=javaGuruBY_java-free-stream-5&metric=coverage)](https://sonarcloud.io/dashboard?id=javaGuruBY_java-free-stream-5) 
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=javaGuruBY_java-free-stream-5&metric=code_smells)](https://sonarcloud.io/dashboard?id=javaGuruBY_java-free-stream-5)  
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=javaGuruBY_java-free-stream-5&metric=bugs)](https://sonarcloud.io/dashboard?id=javaGuruBY_java-free-stream-5) 
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=javaGuruBY_java-free-stream-5&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=javaGuruBY_java-free-stream-5)  

-[Х] New domain - ShoppingCart
Необходимо добавить новую сущность в проект - Shopping cart.
-[Х] У "корзины" должно быть название и список продуктов.
-[Х] Название корзины - обязательное поле

Функциональные требования:
-[х] Сохранение корзины
-[х] получение корзины
-[х] удаление корзины
-[х] Добавление продукта в корзину
-[х] Получение списка продуктов (в корзине)
-[х] Получение общей стоимости продуктов в корзине

### Maven/Gradle, JUnit + Mockito
Migrate to Maven/Gradle, add tests
Task 5 for ShoppingListApplication
Добавить в проект build tool Maven/Gradle.
*Примечание: изменится структура проекта
Добавить библиотеки: JUnit 4.12 + Mockito 2.23.4
Покрыть тестами уровни service/validation

### Dependency Injection, JUnit + Mockito
Task 6 for ShoppingListApplication
Переписать приложение с использованием Dependency Injection.
Перенести настройку необходимых объектов в main метод.
Покрыть код тестами и достигнуть > 50% покрытия кода тестами

### Spring framework
Spring Basics
Task 7 for ShoppingListApplication
Добавить в проект Spring Framework 4.3.22.RELEASE
Внедрить использование Spring Dependency Injection / IoC
https://docs.spring.io/spring/docs/4.3.22.RELEASE/spring-framework-reference/htmlsingle/

### SQL, JDBC Api
База данных MySQL
Task 8 for ShoppingListApplication
Необходимо установить MySQL.
Подключить базу данных в приложении. (Создать необходимые бины с настройками (@Bean)).
Для каждой сущности создать таблицу в базе данных.

### ORM Hibernate
Migrate to Hibernate
Task 9 for ShoppingListApplication
Необходимо переделать (или добавить новый) класс репозиторий и доменную модель, таким способом, чтобы приложение использовало ORM Hibernate.

### ORM Relations
Hibernate Relationships
Task 10 for ShoppingListApplication
Необходимо добавить новую сущность - ShoppingCart (если такой нет).
Установить отношения между таблицами.
У корзины может быть множество продуктов.
У продукта может быть множество корзин.

### Spring Web
Task 11 for ShoppingListApplication
Необходимо добавить Rest Controller для Product.
В случае если сущностей больше, то и для них соответственно. (ShoppingCart).
Контроллер должен выполнять стандартные операции (CRUD).

[-]Task 1-11 for ShoppingListApplication: Spring, Hibernate, jUnit
Необходимо отправить ссылку на github репозиторий с проектом.

-----------
-----------

 [+] Система учета продуктов
 Минимальные требования (возможные пункты меню):
1. Добавление продукта
2. Получение продукта по id
3. Получение списка всех продуктов
4. Удаление продукта по id

[+] Как минимум должен быть 1 интерфейс или абстрактный класс. Использование должно быть подкреплено необходимостью.
--- используется для реализации счетчика, чтобы не прописывать в каждом конструкторе метод счетчика.
не думаю что это достаточная необходимость.
[+] Как минимум 1 коллекция (любая из List, Map, Set)

[+] #Основная сущность - Product.
    String name;
    Long id;
    BigDecimal price;
    Enum Category productCategory;
    BigDecimal discount; (example: 0.05) (т.е 5%)
    String description - тип данных String (example: Tasty apples from Latvia)

[+] #Категория (productCategory) - enum 

- [+] В случае если основное поле не было введено - не записывать продукт,
        а сообщить пользователю о том, что поле не введено или введено некорректно.
- [+] При добавлении продукта пользователь не указывает id. Id присваивается в коде. 
        Например: при первом добавлении продукта id будет 0,
        при добавлении следующего продукта у нового будет уже 1 и т.д.
- [+] В случае если на продукт есть скидка то при отображении информации на консоли должно быть понятно,
 что есть скидка. Например:
Product information:
Id: 123
Name: Apple
Regular price: 0.14
Discount: 50%
Actual price: 0.07

[+] В качестве InMemoryDatabase можно использовать любую коллекцию.

Усложнения:
- [+] Необходимо иметь возможность легко внедрять новые фичи (features) и легко убирать.
- [+] Необходимо разделить функционал таким образом,
    -   чтобы UI Console
    -   бизнес логика (service)
    -   база (Database)
    были разделены по уровням (используйте разделение по packages).
- [+] На уровне UI-console только общение с пользователем (т.е меню)
- [ ] На уровне service вся бизнес логика приложения (так же валидация)
- [+] На уровне database только база данных (коллекция)

Функциональные усложнения:
- [ ] Добавить возможность получить список определенной категории
- [+] Добавить возможность менять информацию о продукте. Например поменять цену или добавить/убрать скидку
- [ ] Добавить возможность поставить скидку на все товары определенной категории
- [ ] Программа должны быть протестирована при помощи jUnit. (Можно и при помощи самописных тестов)
- [ ] Покрытие тестами (code coverage) > 70%

Супер уровень:
1. Познакомиться с build tool maven и внедрить в проект
Убедиться что работают команды clean, install
2. Залить проект на github




