input = open('inputs/02.txt', 'r')
Lines = input.readlines()

sum = 0

for line in Lines:
    gameResults = line.split(': ')[1]
    games = gameResults.split(';')
    red = 0
    blue = 0
    green = 0
    for game in games:
        results = game.split(',')
        for result in results:
            result = result.strip()
            parts = result.split(' ')
            print(parts)
            if parts[1] == 'red':
                if int(parts[0]) > red:
                    red = int(parts[0])
            elif parts[1] == 'green':
                if int(parts[0]) > green:
                    green = int(parts[0])
            elif parts[1] == 'blue' :
                if int(parts[0]) > blue:
                    blue = int(parts[0])
    sum += red * blue * green
    print(sum)
    print()

print('Result: ' + str(sum))