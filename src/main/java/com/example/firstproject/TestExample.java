package com.example.firstproject;

public class TestExample {
    /**
     * Пример простой зависимости
     */
    // Проблема в том, что авторизация заточена только на работу с TestConectionUser
    // Решить проблему можно интерфейсом или абстрактным классом, который обощал бы соединения(для авторов, юзеров, админов)
    class TestConectionUser {
        //... Код для конекта пользователя
    }

    class Auth{
        private TestConectionUser testConectionUser;

        public void Auth(){
            testConectionUser = new TestConectionUser();
        }
    }

    /**
     * Второй пример с музыкой
     */
    /*
    class ClassicalMusic{

    }

    class PlayerMusic{
        private ClassicalMusic classicalMusic;

        public void playMusic()
        {
            classicalMusic = new ClassicalMusic();
        }
    }
    */

    /**
     * Слабая зависимость
     */
    // Проблема в том, что объекты создаются вручную. Все эти данные о создании мы хотим держать в другом месте
    // Решение. Использовать beans, которые будут хранится в конфигурационном файле.
}
