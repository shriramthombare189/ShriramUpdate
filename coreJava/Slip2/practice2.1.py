def countcase(s):
    upper = sum(1 for i in s if i.isupper())
    lower = sum(1 for i in s if i.islower())
    print(f"No. of Upper case characters: {upper}")
    print(f"No. of Lower case characters: {lower}")

countcase(input("Enter string: "))