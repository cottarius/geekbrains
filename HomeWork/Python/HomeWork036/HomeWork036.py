"""
Напишите функцию print_operation_table(operation, num_rows=6, num_columns=6), которая принимает в качестве аргумента
функцию, вычисляющую элемент по номеру строки и столбца. Аргументы num_rows и num_columns указывают число строк и
столбцов таблицы, которые должны быть распечатаны. Нумерация строк и столбцов идет с единицы (подумайте, почему не
с нуля). Примечание: бинарной операцией называется любая операция, у которой ровно два аргумента, как, например, у
операции умножения.
*Пример:*

**Ввод:** `print_operation_table(lambda x, y: x * y) `
**Вывод:**
"""


def print_operation_table(operation, rows, columns):
    for i in range(1, rows + 1):
        for j in range(1, columns + 1):
            print(*list(map(operation, [i], [j])), end="\t")
        print()


row = int(input("Введите количество строк: "))
column = int(input("Введите количество столбцов: "))
print_operation_table(lambda x, y: x * y, row, column)
