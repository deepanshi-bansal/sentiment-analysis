light=input("light colour : ")
if(light=="red"):
    print("stop!")
elif(light=="green"):
    print("go!")
elif(light=="yellow"):
    print("look around!")
else:
    print("light is broken")

# conditional statements for grades of students
marks=int(input("Your marks is : "))
if(marks>=90):
    print("A")
elif(marks>=80 and marks<90):
    print("B")
elif(marks>=70 and marks<80):
    print("C")
else:
    print("D")
    
#some conditional statements examples
A=int(input("A : "))
G=input("M/F : ")
if((A==1 or A==2)and G=="M"):
    print("fees is 100")
elif(A==3 or A==4 or G=="F"):
    print("fees is 200")
elif(A==5 and G=="M"):
    print("fees is 300")
else:
    print("No fees")