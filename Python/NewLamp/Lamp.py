import random

class Lamp:
    __isOn = None

    def __init__(self, *args):
        if len(args)== 1:
            self.__isOn = args[0]
        elif len(args)==0:
            self.__isOn = False
        else:
            raise Exception("Invalid constructor")

    def __str__(self):
        out = None
        if self.__isOn:
            out = "On"
        else:
            out = "Off"
        #out = ":3s".format(out)
        return out

    def turnOn(self):
        self.__isOn = True

    def turnOff(self):
        self.__isOn = False

    def flip(self):
        self.__isOn = not self.__isOn

    def isOn(self):
        return self.__isOn
    
    def setLamp(self, isOn):
        self.__isOn = isOn

    def __eq__(self, other):
        return self.__isOn == other.__isOn
    
    def display(self):
        cnt=0
        for j in range(6):
            for h in range(5):
                print(self[cnt], end="\t")
                cnt+=1

        

        

