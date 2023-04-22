"""
Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B с помощью рекурсии.
"""


def pow_rec_a_b(a, b):
    if b == 0:
        return 1
    return a * pow_rec_a_b(a, b - 1)


print(pow_rec_a_b(3, 5))
