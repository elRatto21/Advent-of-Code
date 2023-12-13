input = open('inputs/02.txt', 'r')
Lines = input.readlines()

sum = 0

for line in Lines:
    id = (line.split(': ')[0]).split(' ')[1]
    gameResults = line.split(': ')[1]
    games = gameResults.split(';')
    red = True
    blue = True
    green = True
    print('Game ' + id)
    for game in games:
        results = game.split(',')
        for result in results:
            result = result.strip()
            parts = result.split(' ')
            print(parts)
            if parts[1] == 'red':
                if int(parts[0]) > 12:
                    red = False
            elif parts[1] == 'green':
                if int(parts[0]) > 13:
                    green = False
            elif parts[1] == 'blue' :
                if int(parts[0]) > 14:
                    blue = False
    if (red != False and green != False and blue != False) :
        sum += int(id)
    print(sum)
    print()

print('Result: ' + str(sum))