#polymorphism
#operator overloading
# implicit overloading
# print(1+2) #3
# print("apna"+"college") #apnacollege (concatenate)
# print([1,2,3]+[4,5,6]) #[1,2,3,4,5,6] (merge)

# creating complex number using class
# class Complex:
#     def __init__(self,real,img):
#         self.real=real
#         self.img=img
        
#     def showNumber(self):
#         print(self.real,"i+",self.img,"j")
    
# complex1=Complex(1,2)
# complex1.showNumber()
# complex2=Complex(2,4)
# complex2.showNumber()

#adding two complex number
# class Complex:
#     def __init__(self,real,img): # __init__ is a dunder function
#         self.real=real
#         self.img=img
        
#     def showNumber(self):
#         print(self.real,"i+",self.img,"j")
        
#     def add(self,num2):
#         newReal=self.real+num2.real
#         newImg=self.img+num2.img
#         return Complex(newReal,newImg)
    
# complex1=Complex(1,2)
# complex1.showNumber()
# complex2=Complex(2,4)
# complex2.showNumber()
# complex3=complex1.add(complex2) #function
# complex3.showNumber()
# complex3=complex1+complex2 (error because two complex number cannot be add using '+' operator as '+' operator is not defined in complex number class)

#adding two complex number using dunder function
# class Complex:
#     def __init__(self,real,img):
#         self.real=real
#         self.img=img
        
#     def showNumber(self):
#         print(self.real,"i+",self.img,"j")
        
#     def __add__(self,num2):
#         newReal=self.real+num2.real
#         newImg=self.img+num2.img
#         return Complex(newReal,newImg)

# complex1=Complex(1,2)
# complex1.showNumber()
# complex2=Complex(2,4)
# complex2.showNumber()
# complex3=complex1+complex2
# complex3.showNumber()
# (complex1+complex2).showNumber()

# subtracting two complex number using dunder function
# class Complex:
#     def __init__(self,real,img):
#         self.real=real
#         self.img=img
        
#     def showNumber(self):
#         print(self.real,"i+",self.img,"j")
        
#     def __sub__(self,num2):
#         newReal=self.real-num2.real
#         newImg=self.img-num2.img
#         return Complex(newReal,newImg)
    
# complex1=Complex(1,2)
# complex1.showNumber()
# complex2=Complex(2,4)
# complex2.showNumber()
# (complex1-complex2).showNumber()

# define a circle class to create a circle with radius r using the constructor.Define an Area() method of the class which calculates the area of the circle.
# define a perimeter() method of the class which allows you to claculate the perimeter of the circle.
class Circle:
    def __init__(self,radius):
        self.radius=radius
         
    def Area(self):
        return (22/7)*self.radius**2
    
    def Perimeter(self):
         return 2*(22/7)*self.radius
    
circle1=Circle(21)
print("Radius of a circle is : ",circle1.radius)
print("Area of a circle is : ",circle1.Area())
print("Perimeter of the circle is : ",circle1.Perimeter()) 

#Define a Employee class with attributes role,department and salary.This class also has the showdetails() method.
# Create an Engineer class that inherits the properties from Employee and has additional attributes:name and age.  
# class Employee():
#     def __init__(self,role,dept,salary):
#         self.role=role
#         self.dept=dept
#         self.salary=salary
        
#     def showdetails(self):
#         print("role = ",self.role)
#         print("dept = ",self.dept)
#         print("salary = ",self.salary)
        
# emp1=Employee("Accountant","Finance","70,000")
# emp1.showdetails()

class Employee:
     def __init__(self,role,dept,salary):
         self.role=role
         self.dept=dept
         self.salary=salary
        
     def showdetails(self):
         print("role = ",self.role)
         print("dept = ",self.dept)
         print("salary = ",self.salary)
        
class Engineer(Employee):
     def __init__(self,name,age):
         self.name=name
         self.age=age
         super().__init__("Engineer","IT","80,000")
        
     def showDetails(self):
         print("name = ",self.name)
         print("age = ",self.age)
        
engg1=Engineer("Deepanshi Bansal",22)
engg1.showdetails()
engg1.showDetails()

# Create a class called order which stores items and its price.
# use dunder function __gt__() (greater than) to convey that: order1 > order2 if price of order1 > price of order2
class Order():
    def __init__(self,item,price):
        self.item=item
        self.price=price
        
    def __gt__(self,order2):
        return self.price>order2.price
        
order1=Order("Chips",20)
order2=Order("Tea",15)
print(order1.item,order1.price)
print(order2.item,order2.price)
print(order1>order2) #True
