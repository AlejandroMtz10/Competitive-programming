operation = input().strip()

total_sum = 0.0
count = 0

for row in range(12):
    for col in range(12):
        value = float(input())
        if col > row:
            total_sum += value
            count += 1

if operation == 'S':
    print(f"{total_sum:.1f}")
elif operation == 'M':
    average = total_sum / count
    print(f"{average:.1f}")
