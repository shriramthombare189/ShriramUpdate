T = (1, 7, 0, 9, 5, 6, 5, 4, 1, 2, 1)
RT = set([x for x in T if T.count(x) > 1])
print("Repeated items:", RT)