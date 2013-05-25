/* 
 * A top-down mergesort implementation.
 */
def merge(left, right) {
    def result = []
    while(left.size() > 0 || right.size() > 0) {
        if(left.size() > 0 && right.size() > 0) {
            if(left.head() < right.head()) {
                result.add(left.head())
                left = left.tail()
            }
            else {
                result.add(right.head())
                right = right.tail()
            }
        }
        else if(left.size() > 0) {
            result.add(left.head())
            left = left.tail()
        }
        else if(right.size() > 0) {
            result.add(right.head())
            right = right.tail()
        }
    }
    return result
}


def msort(theList) {
    if(theList.size() <= 1) {
        return theList
    }
    

    def mid = (int)(theList.size()/2)

    leftRange = theList[0..mid-1]
    def left  = msort(leftRange)

    rightRange = theList[mid..theList.size()-1]
    def right = msort(rightRange)

    return merge(left, right)
}

def main() {
    println msort([0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1337])
}

main()
