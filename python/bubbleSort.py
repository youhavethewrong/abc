

class BubbleSort:
    def sort(self, the_list):
        swapped = True
        while swapped:
            swapped = False
            for i in range(1, len(the_list)-1):
                if(the_list[i-1] > the_list[i]):
                    the_list[i], the_list[i-1] = the_list[i-1], the_list[i]
                    swapped = True
        return the_list

if __name__ == '__main__':
    bs = BubbleSort()
    fh = open("../_data/longnums.dat", 'r')
    bigList = fh.read().strip().split(',')
    bigList = map(lambda x: int(x), bigList)
    shortList = [0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1337]
    print bs.sort(bigList)
