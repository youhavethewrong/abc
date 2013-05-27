"""
Singly linked list implementation.
"""

class Record:
    def __init__(self, datum, link=None):
        self.datum = datum
        self.link = link

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_beginning(self, item):
        item.link = self.head
        self.head = item

    def insert_after(self, target, item):
        item.link = target.link
        target.link = item

if __name__ == "__main__":
    ll = LinkedList()
    ll.insert_beginning(Record("apple"))
    print ll.head.datum
    ll.insert_after(ll.head, Record("banana"))
    print ll.head.datum,ll.head.link.datum
