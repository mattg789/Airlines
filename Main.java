
import java.util.*;
import java.io.*;

public class Main {

    public static void loadArrays(int[] num) throws Exception {
        File file = new File("inputs.txt");
        Scanner scan = new Scanner(file);
        int index = 0;

        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                num[index] = scan.nextInt();
                index++;
            } else {
                scan.nextLine();
            }
            if (index >= num.length) {
                break;
            }
        }
        scan.close();
    }

    public static void loadArraysTwo(String[] string) throws Exception {
        File file = new File("inputs2.txt");
        Scanner scan = new Scanner(file);
        int index = 0;

        while (scan.hasNext()) {
            if (scan.hasNextLine()) {
                string[index] = scan.nextLine();
                index++;
            } else {
                scan.nextLine();
            }
            if (index >= string.length) {
                break;
            }
        }
        scan.close();
    }



    public static void main(String[] args) throws Exception{

        int[] numInputs = new int[4];
        String[] stringInputs = new String[2];
        loadArrays(numInputs);
        loadArraysTwo(stringInputs);

        System.out.println(Arrays.toString(numInputs));
        System.out.println(Arrays.toString(stringInputs));



        Employee emp = new Employee("Mike", "baggage", 5, 60, 541255);
        Pilot usPilot = new Pilot(stringInputs[0], stringInputs[1], numInputs[0], numInputs[1], numInputs[2], numInputs[3]);

        System.out.println(emp.toString());
        System.out.println(usPilot.toString());


        usPilot.setBadge(465465);
        usPilot.setLicenseNum(46464646);
        usPilot.setName("jimmy");
        usPilot.setDepart("Lead Pilot");
        System.out.println(usPilot.toString());

        usPilot.eject();

    }
}
