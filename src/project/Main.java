
package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Scanner in = new Scanner(System.in);
    private ArrayList<String> city = new ArrayList<String>();
    private int distance[][];

    public void addCity() {
        String tmp = in.next();
        while (!tmp.equals("###")) {
            this.city.add(tmp);
            tmp = this.in.next();
        }
    }

    public void addDistance() {
        int[][] tmpDistance = new int[this.city.size()][this.city.size()];
        for (int counterA = 0; counterA < this.city.size(); counterA++) {
            for (int counterB = 0; counterB < this.city.size(); counterB++) {
                tmpDistance[counterA][counterB] = this.in.nextInt();
            }
        }
        this.distance = tmpDistance;
    }

    public int getDistance() {
        String cityA = this.in.next();
        String cityB = this.in.next();
        if (this.city.contains(cityA) && this.city.contains(cityB)) {
            return this.distance[this.city.indexOf(cityA)][this.city.indexOf(cityB)];
        } else {
            return -2;
        }
    }

    public static void main(String[] args) {
        Main city = new Main();
        city.addCity();
        city.addDistance();
        System.out.println(city.getDistance());
        city.in.close();
    }

}
