from Lamp import Lamp
import random

def main():

    lamps = [Lamp() for i in range(30)]
        
    for ll in lamps:
        v = random.randint(0,1)
        ll.setLamp(v)

    print("Start Lamps: ")
    #display(lamps)
    cnt=0
    for j in range(6):
        for h in range(5):
            print(lamps[cnt], end="\t")
            cnt+=1
        print()

    # flip switch on first 10 lamps
    for i in range(11):
        lamps[i].flip()
        
    #turn next 10 off
    for i in range(11, 21):
        lamps[i].turnOff()

    #Turn last 10 on 
    for i in range(21, 30):
        lamps[i].turnOn()

    print()
    print("New Lamps: ")
    #display(lamps)
    cnt=0
    for j in range(6):
        for h in range(5):
            print(lamps[cnt], end="\t")
            cnt+=1
        print()


main()