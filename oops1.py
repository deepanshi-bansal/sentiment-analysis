# # class
# class Student:
#     name="Deepanshi"
    
# # object
# s1=Student()
# print(s1)
# print(s1.name) #Deepanshi
# s2=Student()
# print(s2.name) #Deepanshi

# # class
# class Car:
#     color="blue"
#     model="mercedes"
    
# # object
# c1=Car()
# print(c1.color) #blue
# print(c1.model) #mercedes
# c2=Car()
# print(c2.color) #blue
# print(c2.model) #mercedes

# # constructor
# class Student:
#     college_name="JNU" #class attribute
#     name="anonymous" #class attribute
#     # default constructor
#     def __init__(self):
#         pass
#     # parameterized constructor
#     def __init__(self,name,marks):
#         self.name=name #here,self.name is the instance attribute. self.name is the object attribute.here,object attribute>class attribute
#         self.marks=marks       
#         print("Adding new student in database...")

# s1=Student("Karan",89)
# print(s1.name,s1.marks) #karan 89
# s2=Student("arjun",87)
# print(s2.name,s2.marks) #arjun 87
# print(s1.college_name) #for accessing cladss attribute we can simply write s1.college_name or Student.college_name
# print(Student.college_name)

# class Student:
#     def __init__(self,name,marks): #constructor
#           self.name=name
#           self.marks=marks
     
#     @staticmethod    
#     def welcome(): #static method
#         print("Welcome!")
        
#     def hello(self): #method
#         print("Hello!",self.name)
        
#     def get_marks(self): #method
#         return self.marks
        
# s1=Student("Deepanshi",89)
# s1.hello()
# s1.welcome()
# print("Your marks is : ",s1.get_marks())

# create student class that takes name and marks of 3 subjects as arguments in constructor.then create a method to print the average.
# class Student:
#     def __init__(self,name,marks):
#         self.name=name
#         self.marks=marks
        
#     def get_avg(self):
#         sum=0
#         for val in self.marks:
#             sum+=val
#         print("Hi!",self.name,",","Your avg. score is : ",sum/3)
            
# s1=Student("Deepanshi",[98,97,96])
# s1.get_avg()

# s1.name="deep"
# s1.get_avg()

# example of abstraction
# class Car():
#     def __init__(self): #constructor
#         self.acc=False
#         self.brk=False
#         self.clutch=False
        
#     def start(self): #method
#         self.acc=True
#         self.clutch=True
#         print("Car has started!")
        
# c1=Car()
# c1.start()

# create Account class with two attributes-balance and account no. create methods for debit,credit and printing the balance.
# class Account():
#     def __init__(self,bal,acc): #constructor
#         self.balance=bal
#         self.account_no=acc
        
#         #debit method
#     def debit(self,amount):
#         self.balance-=amount
#         print("Rs.",amount,"has been debited from your account")
#         print("Total balance = ",self.get_balance())
        
#         # credit method
#     def credit(self,amount):
#             self.balance+=amount
#             print("Rs.",amount,"has been credited to your account")
#             print("Total balance = ",self.get_balance())
            
#         # printing the balance
#     def get_balance(self):
#             return self.balance
        
        
# acc1=Account(10000,12345)
# print("Your current balance is : ",acc1.balance)
# print("Your account no. is : ",acc1.account_no) 
# acc1.debit(1000)
# acc1.credit(500)
# acc1.credit(50000)
# acc1.debit(10000)   


