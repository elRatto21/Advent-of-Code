input = open('inputs/04.txt', 'r')
Lines = input.readlines()

sum = 0

for line in Lines:
    nums = line.split(': ')[1]
    winning, available = map(str.split, nums.split(' | '))

    hits = len(set(winning) & set(available))
    if hits >= 1:
        points = 2 ** (hits -1)
    else:
        points = 0

    sum += points

print('Result: ' + str(sum))
