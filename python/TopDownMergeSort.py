"""
Top-down merge sort implementation.
"""

class TopDownMergeSort:
    def merge(self, left, right):
        result = []
        while len(left) > 0 or len(right) > 0:
            if(len(left) > 0 and len(right) > 0):
                if(left[0] < right[0]):
                    result.append(left[0])
                    left = left[1:]
                else:
                    result.append(right[0])
                    right = right[1:]
            elif(len(left) > 0):
                result.append(left[0])
                left = left[1:]
            elif(len(right) > 0):
                result.append(right[0])
                right = right[1:]

        return result

    def sort(self, sortable_list):
        if(len(sortable_list) <= 1):
            return sortable_list

        left = self.sort(sortable_list[len(sortable_list)/2:])
        right = self.sort(sortable_list[:len(sortable_list)/2])

        return self.merge(left, right)


if __name__ == '__main__':
    tdms = TopDownMergeSort()
    print tdms.sort([0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1337])
