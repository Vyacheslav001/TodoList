package com.example.todolist.Tasks

/*
Задание 1

Общие требования:
1)	реализовать дата класс Дела (TodoItem)
2)	реализовать класс-хранилище списка дел (TodoItemsRepository)
3)	реализовать UI ячейки Дела
4)	реализовать UI списка Дел
5)	реализовать кнопку добавления дела
6)	реализовать экран добавления/редактирования дела с обновлением данных

TodoItem:
1)	класс должен быть kotlin data class
2)	id дела, обязательный параметр – String
3)	текст дела, обязательный параметр – String
4)	важность/значимость дела, обязательный параметр, должно быть 3 значения: “низкая”, “обычная”, “срочная»
5)	дедлайн выполнения, опциональный параметр
6)	флаг выполнения (сделана или нет), обязательный параметр
7)	дата создания, обязательный параметр
8)	дата изменения, опциональный параметр
TodoItemsRepository
1)	класс должен возвращать список дел
2)	метод добавления нового дела (дело передаётся как аргумент функции)
3)	в текущей реализации список дел сейчас можно захардкодить (минимум 10-20 значений)
4)	дела должны быть максимально разнообразны, чтобы покрыть все комбинации возможных значений и проверить работу экрана наиболее полным образом

UI ячейки дела:
1)	UI должен быть реализован на xml
2)	флаг готовности задачи
3)	слева ячейки
4)	кружочек красного/зелёного дела, либо другой визуальный элемент с двумя состояниями
5)	текст дела
6)	текст занимает всё доступное пространство
7)	максимум 3 строки, при превышении – многоточие в конце

UI списка дел:
1)	должен быть реализован через RecyclerView
2)	в качестве ячеек должен выступать UI ячейки дела (из предыдущего пункта)
3)	список должен быть вертикальным и занимать всю ширину и высоту экрана
4)	передать в adapter список дел из TodoItemsRepository и отобразить

Кнопка добавления дела:
1)	Floating Action Button
2)	Открывает экран добавления дела
UI добавления дела:
1)	Отдельный экран
2)	Поле ввода, куда можно ввести описание дела
3)	Дедлайн (дату, которую можно выбрать в календаре, опционально)
4)	Приоритет дела (выпадающий список, по умолчанию стоит обычный приоритет)
5)	Кнопки закрытия / сохранения / удаления дела

Навигация:
1)	Экран списка дел и добавления дела должны быть сделаны на отдельных фрагментах
2)	Клик в существующее дело в списке открывает экран редактирования дела (такой же, как добавление)
3)	Любая кнопка (сохранение/удаление/закрытие) на экране редактирования/добавления ведет к закрытию экрана и возвращению на список дел


Дополнительное задание:
1)	использовать DiffUtil для обновления списка
2)	подписываться на изменения элементов в репозитории
a)	может быть реализовано через callback или Flow
3)	можете также добавлять все, что придумает ваша фантазия и что будет полезно приложению. Если знаете, как сделать какие-то моменты лучше, чем описано здесь - делайте.
 */