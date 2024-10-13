# Import the library tkinter 
from tkinter import *
app = Tk() 
app.title("Menu Bar") 
app.geometry("800x500") 

menubar = Menu(app, background='blue', fg='white') 

file = Menu(menubar, tearoff=False, background='yellow') 
edit = Menu(menubar, tearoff=False, background='pink') 

# Add commands in in file menu 
file.add_command(label="New") 
file.add_command(label="Exit", command=app.quit) 

# Add commands in edit menu 
edit.add_command(label="Cut") 
edit.add_command(label="Copy") 
edit.add_command(label="Paste") 

# Display the file and edit declared in previous step 
menubar.add_cascade(label="File", menu=file) 
menubar.add_cascade(label="Edit", menu=edit) 

# Displaying of menubar in the app 
app.config(menu=menubar) 

# Make infinite loop for displaying app on screen 
app.mainloop() 
