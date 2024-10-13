from Calc import functions

radius=int(input("Enter radius of sphere: "))
sphere_area=functions.area_sphere(radius)
sphere_vol=functions.vol_sphere(radius)
print(f"Area of sphere: {sphere_area}\nVolume of sphere: {sphere_vol}\n\n")
side=int(input("Enter side of cube: "))
cube_area=functions.area_cube(side)
cube_vol=functions.vol_cube(side)
print(f"Area of cube: {cube_area}\nVolume of cube:{cube_vol}")

