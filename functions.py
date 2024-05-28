# def print_hello():
#     print("Hello!")
    
# print_hello()
# print_hello()

# def calc_sum(a,b): #function definition;parameters
#     sum=a+b
#     return sum
    
# s=calc_sum(2,3) #function call;arguments
# print(s)

# def print_hi(): 
#     print("hiiiiii") #ye func return mein kuch return nhi kar raha
# output=print_hi()
# print(output) #to output mein 'None' aayega

#average of 3 numbers
# def avg_3numbers(a,b,c):
#     avg=(a+b+c)/3
#     return avg

# Avg=avg_3numbers(4,5,6)
# print(Avg)

# # Built-in functions
# #already defined in print() function
# print("apnacollege","Deepanshi Bansal",end=" ") #sep=" "
# print("Heyyyy") #end="\n" 

# #default parameters when no argument has been passed
# def product(a=4,b=2):
#     prod=a*b   
#     print("Product = ",prod)
#     return prod

# product()

# def product(a,b=7):
#     prod=a*b
#     print("Product of a and b is : ",prod)
#     return prod

# product(4)

# #waf to print the length of a list(list is the parameter)
# cities=["delhi","bhilai","raipur","hyderabad","telangana"]
# def len_list(list):
#     return len(list)

# length=len_list(cities)
# print(length)

# #waf to print the elements of a list in a single line(list is the parameter)
# heroes=["captain america","ironman","thor","avatar"]
# def print_list(list):
#      print("Elements of list are : ",end=" ")
#      for item in list:
#          print(item,end=",")
        
# print_list(heroes)

#waf to find the factorial of n (n is the parameter)
# def factorial(n):
#         i=1
#         f=1
#         while(i<=n):
#             f*=i
#             i+=1
            
#         print("Factorial of a number",n,"is : ",f)
    
# factorial(5)

# # waf to convert usd to inr
# def converter(usd_value):
#     inr_value=usd_value*83
#     print(usd_value,"USD",":",inr_value,"INR")

# converter(1000)

# def checkoddoreven(n):
#     if(n%2!=0):
#         print("ODD")
#     else:
#         print("EVEN")
    
# print("The number is :",end=" ")
# checkoddoreven(8)

# recursive function
# def show(n):
#     if(n==0):
#         return
#     print(n)
#     show(n-1)
#     print("END")
    
# show(6)

# calculate factorial of a number using recursion
# def factorial(n):
#     if(n==0 or n==1):
#         return 1
#     return factorial(n-1)*n

# fact=factorial(6)
# print("Factorial of a number",6,"is : ",fact)

# # write a recursive function to calculate the sum of first n natural numbers
# def sum(n):
#     if(n==0):
#         return 0
#     return n+sum(n-1)
    
# print("sum of a number",5,"is:",sum(5))

# write a recursive function to print all the elements in a list. Hint:use list and index as parameters.
# def print_list(list,index=0):
#     if(index==len(list)):
#         return
#     print(list[index])
#     print_list(list,index+1)
    
# cities=["delhi","bhubnashewar","chennai","durg","raipur"]
    
# print_list(cities)

cities=["delhi","bhubnashewar","chennai","durg","raipur"]
for val in cities: #using loop
    print(val)


    
    
