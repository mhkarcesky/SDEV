//Madison Karcesky
//Lamp C-1
//This is my own original work

public class App {
    public static void main(String[] args) throws Exception {

        Lamp[] lamps = new Lamp[30];

        for (int i = 0; i < lamps.length; i++) {
            lamps[i] = new Lamp();
        }

        // write out all lamps using 5 columns
        int idx = 0;
        for (int n = 1; n <= 6; n++) {
            for (int m = idx; m < idx + 5; m++) {
                if (lamps[m].isOn() == false) {
                    System.out.print("Off" + "\t");
                } else {
                    System.out.print("On" + "\t");
                }

            }
            idx += 5;
            System.out.println();
        }

        // flip switch on first 10
        for (int j = 0; j < 10; j++) {
            lamps[j].flip();
        }

        // turn next 10 off
        for (int h = 10; h < 20; h++) {
            lamps[h].turnOff();
        }

        // turn final 10 on
        for (int k = 20; k < 30; k++) {
            lamps[k].turnOn();
        }

        System.out.println();
        // write out all lamps using 5 columns
        int cnt = 0;
        for (int n = 1; n <= 6; n++) {
            for (int m = cnt; m < cnt + 5; m++) {
                if (lamps[m].isOn() == false) {
                    System.out.print("Off" + "\t");
                } else {
                    System.out.print("On" + "\t");
                }
            }
            cnt += 5;
            System.out.println();
        }

    }

}
