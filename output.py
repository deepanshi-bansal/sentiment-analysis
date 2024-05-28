# f=open("read.txt","r")
# data=f.read()
# print(data)
# print(type(data))
# f.close()

# f=open("reads.txt","r")
# data=f.read(6)
# print(data)
# f.close()

# f=open("demo.txt","r")
# data=f.read()
# print(data)
# line1=f.readline()
# print(line1)
# line2=f.readline()
# print(line2)
# line3=f.readline()
# print(line3)
# f.close()

# f=open("demo.txt","w")
# f.write("Pursuing Master's degree in computer applications") #overwrites in the file
# f.close()

# f=open("demo.txt","a")
# f.write("\nMy name is deepanshi bansal") #adds the data into the end of the file
# f.close()
# #if the file doesn't exists ,then through write or append mode,it gets created automatically
# f=open("sample.txt","w")
# f.close()

# f=open("sample.txt","a")
# f.close()
# #"r+" is used for both reading and writing.it is used for truncating(overwrites) the file in the beginning.when we read the file then words after overwriting the words where cursor is placed gets printed on the screen.
#no truncating the whole file. pointer is placed in the beginning.
# f=open("demo.txt","r+")
# f.write("abcd")
# print(f.read())
# f.close()

# f=open("demo.txt","w+") #pointer is placed in the beginning.truncates
# print(f.read())
# f.write("abc")
# f.close()

# f=open("demo.txt","a+") #used for appending in the file.the stream is positioned at the end of the file.no truncate.
# print(f.read())
# f.write("abc")
# f.close()

#using with syntax.in with closing of file is not necessary.
# with open("demo.txt","r") as f:
#     data=f.read()
#     print(data)

# with open("demo.txt","w") as f:
#     f.write("new data")
    
#deleting a file using os module.os module is preinstalled in the python.other modules such as tensorflow is not preinstalled in python so we have to download using pip(package installer for python)
# import os
# os.remove("sample.txt") 

# create a new file "practice.txt" using python.add the following data in it:
# f=open("practice.txt","w")
# f.write("Hi everyone\nwe are learning File I/O\n")
# f.write("using Java.\nI like programming in Java.")
# f.close()

# search if the word "learning" exists in the file or not.
# def check_for_word():
#          word="zlearning"
#          with open("practice.txt","r") as f:
#              data=f.read()
#          if(data.find(word)!= -1):
#              print("FOUND!")
#          else:
#              print("NOT FOUND!")
        
# check_for_word()

# waf that replaces all occurrences of "java" with "python" in aBOVE FILE.(first we have to read the file and apply changes and then overwrite it.)
def replacing_word():
    with open("practice.txt","r") as f:
        data=f.read()
        new_data=data.replace("Java","Python")
        print(new_data)

    with open("practice.txt","w") as f:
        f.write(new_data)
        
replacing_word() 

# search if the word "learning" exists in the file or not.
# def check_for_word():
#           word="zlearning"
#           with open("practice.txt","r") as f:
#               data=f.read()
#           if(word in data):
#               print("FOUND!")
#           else:
#               print("NOT FOUND!")
# check_for_word()

# waf to find in which line of the file does the word "learning" occur first.Print -1 if word not found.
# def check_for_line():
#     word="using"
#     data=True
#     line_no=1
#     with open("practice.txt","r") as f:
#         while data:
#             data=f.readline()
#             if(word in data):
#                 print("Found in line no.",line_no)
#                 return
#             line_no+=1
#     return -1

# print(check_for_line())

# from a file containing numbers separated by comma,print the count of even number
# count=0
# with open("practice2.txt","r") as f:
#     data=f.read()
#     print(data)
#     nums=data.split(",") #we create a list 'num' using ',' operator
#     print(nums) #we print 'nums' list
#     for val in nums: 
#         if(int(val)%2==0): #here we typecaste value in nums using int because first values in nums is stored as string values
#             count+=1
        
# print(count)
        
        
    
        
    












