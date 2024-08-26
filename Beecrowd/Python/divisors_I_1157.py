def main():
    number = int(input())
    i = 1
    for i in range(i,number+1,1):
        model = number % i
        if model == 0:
            print(i)



main()