# info={ #dictionaries are mutable
#     "name":"deepanshi", #key: value pairs
#     "subjects":["python","java","c","c++"],
#     "topics":("lists","tuples","dictionary","sets"),
#     "age":22,
#     "marks":83.07, #value can be anything such as ,lists,tuples,int ,float,strings.
#     22:78.89 ,#key cannot be lists otherwise it can be anything such as tuples,strings,int,float numbers
#     "is_adult":True
# }
# print(info)
# print(type(info))
# print(info["name"]) #accessing the values of the keys
# info["name"]="deep"
# info["surname"]="bansal"
# print(info)
# null_dict={}
# print(null_dict)
# null_dict={"surname":"bansal"}
# print(null_dict)

# nested dictionaries
# student={
#     "name":"deepanshi",
#     "subjects":{
#         "phy":89,
#         "chem":87,
#         "bio":88
#     },
#     "div":"A grade"
#     }
# print(student)
# print(student["subjects"])
# print(student["div"])
# print(student["subjects"]["bio"])

# #dictionary methods
# print(student.keys())
# print(len(student))
# print(list(student.keys())) #type casting in list
# print(len(list(student.keys())))
# print(student.values())
# print(list(student.values()))
# print(student.items())
# print(list(student.items()))
# pairs=list(student.items())
# print(pairs[1])
# print(student.get("div")) #returns the value for the key
# print(student.get("div2")) #no error--> none type
# # print(student["div2"]) #error --> cannot executes the code after the error but it can execute the code before the error
# student.update({"name":"deep"}) #update the existing dictionary
# print(student)
# student.update({"surname":"bansal"}) #adds into the existing dictionary
# print(student)
# new_dict={"name":"deepika","age":19} #creating new dictionary and then adding new dictionary into the existing dictionary and overwriting the key name,thus not creating duplicate key "name"
# student.update(new_dict)
# print(student)

# sets
# collection={1,2,3,4,5,5,"hello","world"}
# print(type(collection))
# print(collection)
# print(len(collection))
# set1=set() #null set
# print(type(set1))
# print(len(set1))
# print(set1)
# set={} #empty dictionary
# print(type(set))
# print(set)
# print(len(set))
# set2={1,2,3}
# set2.add(4)
# set2.add(5)
# set2.remove(3)
# print(set2)
# set2.add("deepanshi_bansal")
# set2.add((1,3,4))
# print(set2)
# set2.clear()
# print(len(set2))
# print(collection.pop())
# print(collection.pop())
# print(collection.pop())
# set3={1,2,3}
# set4={3,4,5}
# print(set3.union(set4))
# print(set3)
# print(set4)
# print(set3.intersection(set4)) 


# wap to enter marks of 3 subjects from the user and store them in a dictionary.start with an empty dictionary and add them one by one.use subject name as key and marks as value.
# record={}
# x=int(input("Enter marks of phy : "))
# y=int(input("Enter marks of chem: "))
# z=int(input("Enter marks of maths : "))
# record.update({"phy":x})
# record.update({"chem":y})
# record.update({"maths":z})
# print(record)

# store following word meanings in a python dictionary:
# table:"a piece of furniture","list of facts and figures"
# cat : "a small animal"

wordmeaning={}
wordmeaning.update({"table":'"a piece of furniture","list of facts and figures"'})
wordmeaning.update({"cat":"a small animal"})
print(wordmeaning)

# you are given a list of subjects for students.assume one classroom is required for one subject.how many classrooms are needed by all students.
# "python","java","c++","python","javascript","java","python","java","c++","c"

classroom={"python","java","c++","python","javascript","java","python","java","c++","c"}
print(classroom)
print(len(classroom))

# figure out a way to store 9 and 9.0 as separate values in the set.

# method-1:
num={9,'9.0'} #in the form of string
print(num)

# method-2:
num2={("int",9),("float",9.0)} #store int and float number in the form of tuple in set.
print(num2)


