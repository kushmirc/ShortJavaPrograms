package BuildARobot;

public class Robot {
    //instance fields:
    String name;
    int batteryLevel;

    //constructor method:
    public Robot(String robotName){
        name = robotName;
        batteryLevel = 100;
    }
    //toString to print robot name:
    public String toString() {
        return "Hello, I'm the robot: " + name;
    }
    //perform task method:
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }
    //energy report method:
    public void energyReport(){
        System.out.println(name + " has a remaining battery level of: " + batteryLevel);
    }

    public static void main(String[] args) {
        Robot codey = new Robot("Codey");
        System.out.println(codey);
        codey.performTask("wiggle");
        codey.performTask("bring Kush a snack");
        codey.energyReport();

        Robot buzz = new Robot("Buzz");
        System.out.println(buzz);
    }

}
