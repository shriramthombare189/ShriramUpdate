class str_mod:
    def get_string(self):
        self.str=input("Enter Your Name: ")

    def put_string(self):
        s=self.str
        print("String in Upper Case: " , s.upper())

        #String Reverse logic
        words = s.split(' ')
        string =[]
        for word in words:
            string.insert(0, word)

        print("String in Reverse & Lower case:")
        print(" ".join(string))


obj1=str_mod()
obj1.get_string()
obj1.put_string()
