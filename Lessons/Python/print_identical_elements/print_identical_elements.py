"""
Напишите программу, которая принимает на вход список чисел в одной строке и выводит на экран в одну строку значения,
которые встречаются в нём более одного раза.

Для решения задачи может пригодиться метод sort списка.

Выводимые числа не должны повторяться, порядок их вывода может быть произвольным.
"""

numbers, new_numbers = [str(i) for i in input().split()], []
for i in numbers:
    if i not in new_numbers and numbers.count(i) > 1:
        new_numbers.append(i)
        print(i, end=' ')
