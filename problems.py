# product = 1
# for i in range(1, 16):   # loop from 1 to 15
#     product = product * i
# print("Product =", product)



# age = int(input("Enter age: "))
# if age >= 0 and age <= 10:
#     print("Child")
# elif age > 10 and age <= 25:
#     print("Adult")
# elif age > 25 and age <= 100:
#     print("Old")
# else:
#     print("Invalid age")


# from cmath import cos


# def calculate_total_price(ticket_price):
#     tax = ticket_price * 0.18
#     final_price = ticket_price + tax
#     return final_price

# # Now call it anywhere in one line!
# cost1 = calculate_total_price(1500)
# cost2 = calculate_total_price(2500)

# print(f"Ticket 1 Total: Rs.{cost1}")
# print(f"Ticket 2 Total: Rs.{cost2}")

# temp = cost1
# cost1 = cost2
# cost2 = temp
# print(f" tax is {cost1} and final  price is {cost2}")
# print("Line 1", end=" ")
# print("Line 2", end="\n\n")
# print("Line 3")



# print("Receipt:",  end="\n")
# print("    \tItem 1: 250")
# print("    \tItem 2: 450")

# print("csk", " vs ", sep=" >>> ", end=" >>>  ")
# print("MI (MATCH 01)")
# print("Receipt:\n\tItem 1: 250\n\tItem 2: 450")

#day 2


# x = 10
# x = 20
# print(x)

# a = "5"
# b = "10"
# print(a + b)

# x = 10
# y = x
# x = 50
# print(y)
# name = "hjg"
# quantity = 5
# unit_price = 10.5
# is_available = True

# print(f"name: {name}, quantity: {quantity}, unit_price: {unit_price}, is_available: {is_available}")

# a = 10
# b = 20
# print(f"a: {a}, b: {b}")
# temp = a
# a = b
# b = temp
# print(f" a: {a}, b: {temp}")

# val1 = 100       # integer
# val2 = "100"     # string
# val3 = 100.0     # float

# print(type(val1), type(val2), type(val3), sep=" | ")

# Fibonacci Series in Python

# I am learning Python since 20 days
# Trying Fibonacci series with simple loop

n = int(input("Enter how many numbers: "))

a = 0   
b = 1   

print("Fibonacci series list are :")

for i in range(n):
    print(a, end=" ")
    c = a + b
    a = b      

