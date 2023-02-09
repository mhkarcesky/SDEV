####
#Madison Karcesky
#Homework A-1
#This is my own original work
####

import math


def display(lst):
    idx = 0
    for f in range(len(lst)//7):
        for i in range(7):
            print(lst[idx], end = "   ")
            idx+=1
        print()


def computeVals(lstx):
    y = []
    for i in lstx:
        z = math.sin(i)+math.sin(i**2)
        y.append("%.2f"%z)

    return y

    
def main():
    lstx = [.5*x for x in range(21)]
    lst = computeVals(lstx)
    display(lst)

    
main()