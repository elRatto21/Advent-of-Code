import re

sum = 0
input = open('../../inputs/01.txt', 'r')
Lines = input.readlines()

for line in Lines:
    result = re.sub(r'\D+', '', line)
    sum += int(result[0] + result[-1])

print(sum)