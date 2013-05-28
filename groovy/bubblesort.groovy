/* Bubblesort implementation.
 *
 */

def bsort(someList) {
    def swappedSomething = true
    while(swappedsomething) {
        def swappedSomething = false
        for(def i=1; i < someList.size()-1; i++) {
            if(someList[i-1] > someList[i]) {
                someList[i-1] += someList[i]
                someList[i] = someList[i-1] - someList[i]
                someList[i-1] -= someList[i]
                swappedSomething = true
            }
        }
    }
    someList
}

def main() {
    fh = new File("../_data/longnums.dat")
    bigList = fh.getText().trim().split(",") 
    bigList = bigList.collect { Integer.valueOf(it) }
    shortList = [0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1337]
    println msort(shortList)
}

main()
