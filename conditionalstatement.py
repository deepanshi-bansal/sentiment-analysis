# marks=int(input("Enter marks of the student : "))
# if(marks>=90):
#     print("A")
# elif(marks>=80 and marks<90):
#     print("B")
# elif(marks>=70 and marks<80):
#     print("C")
# else:
#     print("D")
    
# # nesting
# age=90
# if(age>=18):
#     if(age>=80):
#         print("Cannot drive!")
#     else:
#         print("Can drive!")
# else:
#     print("Cannot drive!")

# # write a program to check if a number entered by a user is odd or even
# num=int(input("Enter the number : "))
# if(num%2==0):
#     print("Even")
# else:
#     print("odd")
    
# # write a program to find the greatest of three numbers entered by the user
# x=int(input("Enter first number : "))
# y=int(input("Enter second number : "))
# z=int(input("Enter third number : "))
# if(x>=y and x>=z):
#     print("first no. is greatest")
# elif(y>=z):
#     print("second number is greatest")
# else:
#     print("third number is greatest")
    
# # write a program to check whether a number entered by a user is multiple of 7
# x=int(input("Enter number : "))
# if(x%7==0):
#     print("multiple of 7")
# else:
#     print("not a multiple of 7")
    
# write a program to find the greatest of four numbers entered by the user
a=int(input("Enter first number : "))
b=int(input("Enter second number : "))
c=int(input("Enter third number : "))
d=int(input("Enter fourth number : "))
if(a>=b and a>=c and a>=d):
    print("first number is greatest",a)
elif(b>=c and b>=d):
    print("second number is greatest",b)
elif(c>=d):
    print("third number is greatest",c)
else:
    print("fourth number is greatest",d)