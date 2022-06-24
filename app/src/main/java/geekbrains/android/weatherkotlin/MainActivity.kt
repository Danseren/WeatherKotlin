package geekbrains.android.weatherkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import geekbrains.android.weatherkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
Урок 1
    Создать новый проект в Android Studio без поддержки Kotlin.
    Сконфигурировать Kotlin в новом проекте (лучше вручную).
    Перевести MainActivity на Kotlin.
Добавить кнопку в разметку и повесить на неё clickListener в Activity.
Потренироваться в создании классов и функций, описанных в уроке, и убедиться, что всё работает. Например, создать тестовое приложение:
Сформировать data class с двумя свойствами и вывести их на экран приложения.
Создать Object. В Object вызвать copy и вывести значения скопированного класса на экран.
Вывести значения из разных циклов в консоль, используя примеры из методических материалов.
Изучить API погоды «Яндекса», посмотреть примеры и зарегистрироваться в качестве разработчика, получить свой ключ разработчика.
Изучить API КиноПоиска и зарегистрироваться в качестве разработчика, подключиться к API.
Определиться с экранами и инструментарием своего будущего приложения с фильмами на основе возможностей API.
Переведите проект с заметками на Kotlin. Курс «Базовый уровень».
 */