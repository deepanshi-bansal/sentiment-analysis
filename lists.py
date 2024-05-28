# marks=[94.4,57.5,89.0,75.6,76.3] #lists
# print(marks)
# print(type(marks))
# print(len(marks))
# print(marks[0])
# print(marks[1])

# student=["karan",78.8,18,"Delhi"] #in lists different types of data are stored
# print(student)
# print(student[0])
# student[0]="Arjun"
# print(student)
# print(marks[0:]) #sublist
# print(marks[1:4])
# print(marks[:4])
# print(marks[-4:-1])

# #lists methods
# lists=[45,67,56,89,90]
# print(lists.append(4)) #None type
# lists.sort()
# print(lists.sort()) #None type
# print(lists)
# lists.sort(reverse=True) #descending order
# print(lists)
 
# #in strings in list also descending and ascending order is possible
# list=["banana","cherry","litchi","apple"]
# # list.sort()
# # print(list)
# # list.sort(reverse=True)
# # print(list)
# list.reverse()
# print(list)
# list1=[3,2,4,5,4]
# # list1.insert(3,6)
# # print(list1)
# # list1.pop(3)
# # print(list1)
# list1.remove(4)
# print(list1)

#tuples in python
# tup=(2,3,4,5,5)
# print(tup[0])
# tup1=() #empty tuple
# print(tup1)
# print(type(tup1))
# tup2=(1,) #single valued tuple
# print(tup2)
# print(type(tup2))
# tup3=(3,4,5,6,) #multivalued tuple
# print(tup3)
# print(type(tup3))
# print(tup[1:3]) #slicing in tuple

# #tuple methods
# print(tup.index(5))
# print(tup.count(5))

# #wap to ask the user to enter names of their 3 favourite movies and store them in a list
# a=input("first movie : ")
# b=input("second movie : ")
# c=input("third movie : ")
# list=[a,b,c]
# print(list)

# wap to count the number of students with grade "A" in the following tuple.
tuple=("C","D","A","A","B","B","A")
print(tuple.count("A"))

# store the above values in a list and sort them from "A" to "D"
list=["C","D","A","A","B","B","A"]
print(list)
list.sort()
print(list)

#wap to check if a list contains a palindrome of elements
list1=[1,2,1]
copy_list1=list1.copy()
copy_list1.reverse()
print(copy_list1)
if(copy_list1==list1):
    print("Palindrome")
else:
    print("Not Palindrome")
    
list2=[1,2,3]
copy_list2=list2.copy()
copy_list2.reverse()
print(copy_list2)
if(copy_list2==list2):
    print("Palindrome")
else:
    print("Not palindrome")
    
list3=["m","a","m"]
copy_list3=list3.copy()
copy_list3.reverse()
print(copy_list3)
if(copy_list3==list3):
    print("Palindrome")
else:
    print("Not palindrome")
