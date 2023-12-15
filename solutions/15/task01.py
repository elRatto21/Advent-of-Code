entries = open('inputs/15.txt', 'r').readline().split(',')
sum = 0

def getValue(chars):
    value = 0
    for char in chars:
        value = ((value + ord(char)) * 17) % 256
    return value

for entry in entries:
    sum += getValue(list(entry))

print('Sum: ', sum)