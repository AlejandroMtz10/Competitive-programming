def sphere_volume(r):
 pi = 3.14159

 volume =  (4.0 / 3.0) * pi * (r * r * r)

 return volume

def main():
 r = int(input())
 volume = sphere_volume(r)
 print(f"VOLUME = {volume:.3f}")

if __name__ == "__main__":
    main()