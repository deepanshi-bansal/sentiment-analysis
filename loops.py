# # Print numbers from 1 to 5 using while loop
# i=1
# while(i<=5):
#     print(i)
#     i=i+1
    
# print("Loop ended")

# # Print numbers from 1 to 100 using while loop
# i=1
# while(i<=100):
#     print(i)
#     i=i+1

# print("Loop ended")

# Print numbers from 100 to 1 using while loop
# i=100
# while(i>=1): #stopping condition
#     print(i)
#     i=i-1
    
# print("Loop ended")

# print the multiplication table of a number n using while loop
# n=int(input("Enter the no. : "))
# i=1
# while(i<=10):
#     print(n*i)
#     i=i+1 
    
# print the elements of the following list using while loop: [1,4,9,16,25,36,49,64,81,100]
# list=[1,4,9,16,25,36,49,64,81,100]
# # traverse
# idx=0
# while(idx<=len(list)-1):
#     print(list[idx])
#     idx+=1
    
# Search for a number x in this tuple using while loop.
# nums=(1,4,9,16,25,36,49,64,81,100)
# x=36
# idx=0
# while(idx<=len(nums)-1):
#     if(nums[idx]==x):
#         print("number",nums[idx],"Found at idx",idx) linear search
#         break
#     else:
#         print("finding...") 
#     idx+=1
    
# print("End of loop")

#  #using break keyword   
# i=1
# while(i<=5):
#     print(i) 
#     if(i==3):
#      break
#     i+=1

# print("End of loop")

# #using continue keyword
# i=1
# while(i<=10):
#     if(i%2==0):
#         i+=1
#         continue #skip
#     print(i)
#     i+=1
    
#for loops
# tup=(1,2,3,4,5,6)
# for el in tup:
#     print(el)
    
# name="deepanshi"
# for char in name:
#     print(char)
    
# str="apnacollege"
# for char in str:
#     if(char=='o'):
#         print("o found!")
#         break
#     print(char)

# print("End") 

# str="apnacollege"
# for char in str:
#     if(char=='o'):
#         print("o found!")
#         break
#     print(char)
# else:
#     print("End")       

# # print the elements of the following list using for loop:
# list=[1,4,9,16,25,36,49,64,81,100]
# for el in list:
#     print(el)
    
# # search for a number x in this tuple using for loop
# tup=(1,4,9,16,25,36,49,64,81,100,49)
# x=49
# idx=0
# for el in tup:
#     if(el==x):
#         print("element",x,"found","at index",idx,"!") linear search
    
#     idx+=1
    
# print(range(5))
    
# for el in range(5): #range(stop) stop not included
#     print(el)
    
# for i in range(2,10): #range(start,stop) start included but stop not included
#     print(i)

# for i in range(2,10,2): #range (start,stop,step) start and step included but stop not included
#     print(i)
    
# for i in range(2,101,2):
#     print(i)
    
# print numbers from 1 to 100 using for loop
# for el in range(1,101):
#     print(el)
    
# print numbers from 100 to 1 using for loop
# for el in range(100,0,-1):
#     print(el)
    
# # print the multiplication table of a number n
# n=int(input("Enter the no. : "))
# for i in range(1,11):
#     print(n*i)
    
# for i in range(5):
#     pass
# print("some useless work")

# print the sum of first n natural numbers using while loop
# n=int(input("Enter the number : "))
# i=1
# sum=0
# while(i<=n):
#     sum+=i
#     i+=1

# print(sum)

# wap to find the factorial of first n numbers using for loop.
# n=int(input("Enter the number : "))
# f=1
# for i in range(1,n+1):
#     f=f*i
#     i+=1
    
# print(f)

# # print the sum of first n natural numbers using for loop
# n=int(input("Enter the number : "))
# sum=0
# for i in range(1,n+1):
#     sum+=i
#     i+=1
# print(sum)

# wap to find the factorial of first n numbers using while loop.
n =int(input("Enter the number : "))
f=1
i=1
while(i<=n):
    f*=i
    i+=1
print("Factorial of a number",n,"is : ",f)

    

    


