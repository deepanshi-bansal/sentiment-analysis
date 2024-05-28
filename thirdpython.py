# Taking input from user and printing it
name=input("name : ")
age=int(input("age : "))
price=float(input("price : "))
print("My name is ",name,"and I am ",age,"years old.")

# Expression Execution
# String and numeric values can operate together with *
A,B=2,3
Txt="@"
print(2*Txt*3)

# String and string can operate with +
A,B="2",3
Txt="@"
print((A+Txt)*B)

# Numeric values can operate with all arithmetic operators
A,B=2,3
C=4
print(A+B*C)

# Arithmetic expression with integer and float will result in float
A=10
B=5.0
C=A/B
print(C)

# Result of division operator with two integers will be float
A,B=1,2
C=A/B
print(C)

# Integer Division with float and int will give int displayed as float
A,B=1.5,3
C=A//B
print(C,A/B)




