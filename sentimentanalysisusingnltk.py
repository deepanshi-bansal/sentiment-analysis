#Sentiment Analysis with NLTK Python

#Cleaning text steps
# 1) Create a text file and take text from it.
# 2) Convert the letter into lower case ('Apple' is not equal to 'apple')
# 3) Remove punctuations like .,?! etc. ( Hi! This is buildwithpython.)

import string
from collections import Counter
from nltk.tokenize import word_tokenize
from nltk.corpus import stopwords
from nltk.sentiment.vader import SentimentIntensityAnalyzer
import matplotlib.pyplot as plt
text=open('read2.txt',encoding='utf-8').read()
lower_case=text.lower()

# str1 : Specifies the list of characters that need to be replaced.
# str2 : Specifies the list of characters with which the characters need to be replaced.
# str3 : Specifies the list of characters that needs to be deleted.
# str1 : 'abc'
# str2 : 'gef'

#print(lower_case)
print(string.punctuation)
cleaned_text = lower_case.translate(str.maketrans('','',string.punctuation))
#print(cleaned_text)

#splitting text into words
tokenized_words = word_tokenize(cleaned_text,"english")

# Removing stop words from the tokenized words list
final_words = []
for word in tokenized_words:
    if word not in stopwords.words('english'):
        final_words.append(word)
        
print(final_words)

#NLP Emotion Algorithm
# 1) Check if the word in the final word list is also present in emotions.text
# - open the emotion file
# - Loop through each line and clear it
# - Extract the word and emotion using split
# 2) If word is present -> Add the emotion to emotion_list
# 3) Finally count each emotion in the emotion_list

emotion_list=[]
with open('emotions.txt','r') as file:
    for line in file:
        clear_line = line.replace("\n",'').replace(",",'').replace("'",'').strip()
        word, emotion = clear_line.split(':')
       # print("Word :" + word + " " + "Emotion :" + emotion)
       
        if word in final_words:
           emotion_list.append(emotion)
           
print(emotion_list)
w = Counter(emotion_list)
print(w)

def sentiment_analyse(sentiment_text):
    score = SentimentIntensityAnalyzer().polarity_scores(sentiment_text)
    print(score)
    neg = score['neg']
    pos = score['pos']
    if neg > pos :
        print("Negative Sentiment")
    elif pos > neg :
        print("Positive Sentiment")
    else:
        print("Neutral Vibe")
    
sentiment_analyse(cleaned_text)

# Plotting the emotions on the graph

fig,ax1 = plt.subplots()
ax1.bar(w.keys(), w.values())
fig.autofmt_xdate()
plt.savefig('graph.png')
plt.show()
   
        

