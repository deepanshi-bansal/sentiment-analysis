# del keyword
# class Student:
#       def __init__(self,name):
#           self.name=name
         
# s1=Student("Deepanshi")
# print(s1.name) #public (cause we can access it outside the class)
# del s1.name
# print(s1.name)

# class Student:
#      def __init__(self,name):
#         self.name=name
        
# s1=Student("Deepanshi")
# print(s1)
# del s1
# print(s1)

# concept of public and private

# class Account:
#     def __init__(self,acc_no,acc_pass):
#          self.acc_no=acc_no #public
#          self.__acc_pass=acc_pass #private
        
#     def reset_pass(self):
#          print(self.__acc_pass)
        
# acc1=Account("12345","abcde")
# print(acc1.acc_no)
# print(acc1.reset_pass())

# class Person:
#     __name="Deepanshi"
    
# p1=Person()
# print(p1.__name) #can't access private attribute outside of the class

# class Person:
#      def __init__(self,name): 
#          self.__name=name #private
    
#      def __hello(self): #private method
#          print("Hello!",self.__name)        
    
#      def welcome(self): 
#         self.__hello() #calling private method
        
# p1=Person("Deepanshi")
# p1.welcome() #calling normal method

# # Inheritance example
# class Car():
#     color="black"
    
#     @staticmethod
#     def start():
#         print("Car started!")
        
#     @staticmethod
#     def stop():
#         print("Car stopped!")
        
# class Toyotacar(Car):
#     def __init__(self,name):
#         self.name=name
        
# car1=Toyotacar("Fortuner")
# car2=Toyotacar("Prius")

# print(car1.name) #Fortuner
# print(car2.start()) #Car started!
# print(car1.stop()) #Car stopped!
# print(car1.color) #black
# print(car2.color) #black
# print(car2.name) #Prius

# example of single-level inhheritance
# class Car():
#     color="black"
#     @staticmethod
#     def start():
#         print("Car started!")
#     @staticmethod
#     def stop():
#         print("Car stopped!")
        
# class Toyotacar(Car):
#     def __init__(self,name):
#         self.name=name
    
# car1=Toyotacar("Fortuner")
# car2=Toyotacar("Prius")

# print(car1.name)
# print(car2.name)
# print(car1.color)
# print(car2.color)
# car1.start() 
# car2.stop()

# # example of multi-level inheritance
# class Car():
#     color="black"
#     @staticmethod
#     def start():
#         print("Car started!")
#     @staticmethod   
#     def stop():
#         print("car stopped!")
        
# class Toyotacar(Car):
#     def __init__(self,brand):
#         self.brand=brand
        
# class Fortuner(Toyotacar):
#     def __init__(self,type):
#         self.type=type
        
# car1=Fortuner("Diesel")
# car1.start()

# # example of multiple inheritance
# class A():
#     VarA="Welcome to class A"
# class B():
#     VarB="Welcome to class B"
# class C(A,B):
#     VarC="Welcome to class C"

# c1=C()
# print(c1.VarA)
# print(c1.VarC)
# print(c1.VarB)

# super()method (for parent class)
# class Car():
#     def __init__(self,type):
#         self.type=type
        
#     @staticmethod   
#     def start():
#         print("Car has started!")
        
#     @staticmethod
#     def stop():
#         print("Car has stopped!")
        
# class Toyotacar(Car):
#     def __init__(self,name,type):
#         super().__init__(type)
#         self.name=name
#         super().start()
        
# car1=Toyotacar("Fortuner","electric")
# print(car1.type)

# use of classmethod
# class Person():
#     name="Anonymous"
    
#     def changeName(self,name):
#         self.name=name #not using classmethod,doesn't change name of the class attribute
        
# p1=Person()
# p1.changeName("Rahul Kumar")
# print(p1.name) #Rahul Kumar
# print(Person.name) #Anonymous

# first way to change the name of the class attribute
# class Person():
#     name="Anonymous"
    
#     def changeName(self,name):
#         Person.name=name #that's one way to change the name of the class attribute
        
# p1=Person()
# p1.changeName("Rahul kumar")
# print(p1.name) #Rahul kumar
# print(Person.name) #Rahul kumar

# second way to change the name of the class attribute
# class Person():
#     name="Anonymous"
    
#     def changeName(self,name):
#         self.__class__.name=name #that's another way to change the name of the class attribute
        
# p1=Person()
# p1.changeName("Rahul kumar")
# print(p1.name) #Rahul kumar
# print(Person.name) #Rahul kumar 

# third way to change the name of the class attribute by using classmethod
# class Person():
#     name="Anonymous"
    
#     @classmethod
#     def changeName(cls,name): 
#         cls.name=name #changes the name of the class attribute using classmethod 
        
# p1=Person()
# p1.changeName("Rahul kumar")
# print(p1.name) #Rahul kumar
# print(Person.name) #Rahul kumar

# using property decorator
# class Student():
#     def __init__(self,phy,chem,maths):
#         self.phy=phy
#         self.chem=chem
#         self.maths=maths
#         self.percentage=str((self.phy+self.chem+self.maths)/3) + "%"
        
# s1=Student(97,98,99)
# print(s1.percentage)
# s1.phy=86
# print(s1.phy)
# print(s1.percentage) #doesn't change percentage according to new marks of phy

class Student():
     def __init__(self,phy,chem,maths):
        self.phy=phy
        self.chem=chem
        self.maths=maths
        self.percentage=str((self.phy+self.maths+self.chem)/3) + "%"
        
     def calcPercentage(self):
         return str((self.phy+self.maths+self.chem)/3) + "%"
        
        
s1=Student(97,98,99)
print(s1.percentage) #98.0%
s1.phy=86
print(s1.phy) #86
print(s1.calcPercentage()) #94.333333% , percentage change according to the changes in the new marks of the sub

# using property attribute
# class Student():
#     def __init__(self,phy,chem,maths):
#         self.phy=phy
#         self.chem=chem
#         self.maths=maths
        
#     @property #property acts as an attribute 
#     def percentage(self):
#         return str((self.phy+self.chem+self.maths)/3)+"%"
    
# s1=Student(97,98,99)
# print(s1.percentage)
# s1.phy=86
# print(s1.phy)
# print(s1.percentage)

        

   
 

