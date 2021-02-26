package Main.Practise5;

public class Start {
    public static void main(String[] args) {
       TrafficSignal[] arr = TrafficSignal.values();
        for (TrafficSignal signal: arr) {
            System.out.println("№" + (signal.ordinal() + 1) + " - " + signal);
        }

//       TrafficSignal someSignal = TrafficSignal.valueOf("green".toUpperCase());
//        System.out.println(someSignal);
    }
    public static void caCheckToGo(TrafficSignal trafficSignal){
        if (trafficSignal.equals(trafficSignal.GREEN)){
            System.out.println();
        }
    }
    public static void caCheckToGoStr(String color){
        if (color.equalsIgnoreCase(TrafficSignal.GREEN.name())){
            System.out.println();
        }
    }
//
//    for(Country country : Country.valuses()){
//
//    }

}
