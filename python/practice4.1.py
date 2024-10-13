#Import the required libraries
from tkinter import *
from random import shuffle
import time
win = Tk()
win.geometry("700x250")
win.option_add("*Font", "aerial")
def change_color():
   colors= ['#e9c46a','#e76f51','#264653','#2a9d8f','#e85d04','#a2d2ff','#06d6a0','#4d908e']
   while True:
      shuffle(colors)
      for i in range(0,len(colors)):
         win.config(background=colors[i])
         win.update()
         time.sleep(1)
label=Label(win, text="Hello World", bg= 'white')
label.pack(pady= 40, padx= 30)
btn=Button(win, text="Button", command= change_color)
btn.pack(pady= 10)
win.mainloop()

