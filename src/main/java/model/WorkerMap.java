package main.java.model;



import java.time.LocalDateTime;
import java.util.*;

public class WorkerMap {
   private static Map<LocalDateTime,Worker> workers = new HashMap<>();
 

    static {
        workers.put(LocalDateTime.of(2008,2,12,2,1),
                (new Worker("Arthur","Dobrya",22,new ArrayList<String>(){{
            add("Russia");
            add("France");
        }})));
        workers.put(LocalDateTime.of(2007,1,12,2,1),
                (new Worker("Valera","vovani4",33,new ArrayList<String>(){{
            add("Moldova");
            add("Italia");
        }})));

        workers.put(getTime(),(new Worker("Dima","Dobrya",22,new ArrayList<String>(){{
            add("Moldova");
            add("Italia");
        }})));
        workers.put(getTime(),(new Worker("Anton","Dobrya",22,new ArrayList<String>(){{
            add("Moldova");
            add("Italia");
        }})));
        workers.put(getTime(),(new Worker("Petea","Dobrya",22,new ArrayList<String>(){{
            add("Moldova");
            add("Italia");
        }})));
        workers.put(getTime(),(new Worker("Vasea","Dobrya",22,new ArrayList<String>(){{
            add("China");
            add("Italia");
        }})));
        workers.put(getTime(),(new Worker("Oleg","Dobrya",22,new ArrayList<String>(){{
            add("China");
            add("Italia");
        }})));
        workers.put(getTime(),(new Worker("Jenia","Dobrya",22,new ArrayList<String>(){{
            add("Moldova");
            add("Italia");
        }})));
        workers.put(getTime(),(new Worker("Orel","Dobrya",22,new ArrayList<String>(){{
            add("Moldova");
            add("Italia");
        }})));
        workers.put(getTime(),(new Worker("Vitea","Dobrya",22,new ArrayList<String>(){{
            add("Moldova");
            add("Italia");
        }})));
        workers.put(getTime(),(new Worker("Valea","Dobrya",22,new ArrayList<String>(){{
            add("Moldova");
            add("Italia");
        }})));
        workers.put(getTime(),(new Worker("Olga","Dobrya",22,new ArrayList<String>(){{
            add("Moldova");
            add("China");
        }})));
        workers.put(getTime(),(new Worker("Vika","Voronina",22,new ArrayList<String>(){{
            add("Moldova");
            add("China");
        }})));
        workers.put(getTime(),(new Worker("Lera","Dobrya",22,new ArrayList<String>(){{
            add("Tailand");
            add("Hincu");
        }})));
        workers.put(getTime(),(new Worker("Natasha","Dobrya",22,new ArrayList<String>(){{
            add("Maringos");
            add("Varnica");
        }})));
        workers.put(getTime(),(new Worker("Borea","Dobrya",22,new ArrayList<String>(){{
            add("Xerox");
            add("Moscow");
        }})));
        workers.put(getTime(),(new Worker("DEiniris","Bure",22,new ArrayList<String>(){{
            add("Sevostopoli");
            add("Bavaria");
        }})));
        workers.put(getTime(),(new Worker("Fi","LOr",22,new ArrayList<String>(){{
            add("Habar");
            add("Grmany");
        }})));
        workers.put(getTime(), (new Worker("Ilya","Val",22,new ArrayList<String>(){{
            add("Germany");
            add("France");
        }})));
        workers.put(getTime(),(new Worker("Ilya","Fisk",22,new ArrayList<String>(){{
            add("Moldova");
            add("Italia");
        }})));

    }

    public static Map<LocalDateTime, Worker> getWorkers() {

        return workers;
    }

    public static void setWorkers(Map<LocalDateTime, Worker> workers) {
        WorkerMap.workers = workers;
    }

    public static LocalDateTime getTime() {

        return  LocalDateTime.now().minusDays(new Random().nextInt(100));
    }


}
