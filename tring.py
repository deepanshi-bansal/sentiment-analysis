str1="deepanshi"
str2="bansal"
final_str=str1+" "+str2
print(final_str)
len1=len(str1)
len2=len(str2)
len3=len(final_str)
print(len1)
print(len2)
print(len3)
str="deepanshi_bansal"
var=str[7]
print(var)
# slicing
str="Apna_College"
slice=str[5:9]
print(slice)
slicing=str[:8]
print(slicing)
slicing1=str[8:len(str)]
print(slicing1)
slicing2=str[8:]
print(slicing2)
slicing3=str[-5:-1]
print(slicing3)
str1="I am studying python from apna college."
print(str1.endswith("lege."))
str2="deepanshi_Bansal"
print(str2.capitalize())
str3=str2.capitalize()
print(str3)
print(str1.replace("a","o"))
print(str1.replace("python","java"))
print(str2.find("e"))
print(str1.find("studying"))
print(str1.count("a"))
# write a program to input user's first name and print it's length
firstname=input("Enter user's first name : ")
print("length of firstname is : ",len(firstname))
# write  aprogram to find the occurrence of $ in a string
name1="hiii! My name i$ deeepan$shi ban$al"
print(name1.count("$"))


