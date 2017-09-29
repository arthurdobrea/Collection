package main.java.service;

import main.java.model.Worker;
import main.java.model.WorkerMap;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class WorkerService {
    private static String country  = "China";
    private static Map<LocalDateTime,Worker> sorted = new TreeMap<>(WorkerMap.getWorkers());
    private static String startDate = "2017-06-08 12:30";
    private static String endDate = "2017-07-30 12:30";
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private static LocalDateTime start = LocalDateTime.parse(startDate, formatter);
    private static LocalDateTime end = LocalDateTime.parse(endDate, formatter);


    private static void sortByDate(){

        System.out.println(sorted);
    }
    private static void workersReadyForTrip(LocalDateTime startDate, LocalDateTime endDate){
        LocalDateTime localDateTime;
        Iterator<LocalDateTime> iterator = WorkerMap.getWorkers().keySet().iterator();

        while(iterator.hasNext()) {
            localDateTime = iterator.next();
            Worker worker = WorkerMap.getWorkers().get(localDateTime);
            if ((startDate.isBefore(localDateTime) && endDate.isAfter(localDateTime)) && worker.isReadyForTrip() )
                System.out.println("This " + worker.getFirstName() + " is able to trip");
        }

    }
    private static List canVisitCountry(String country){
        List<Worker> allowedWorkers = new ArrayList<>();
        for (Map.Entry<LocalDateTime, Worker> entity : WorkerMap.getWorkers().entrySet())
        {
            List<String> countrylist = entity.getValue().getCountries();
            if(countrylist.contains(country)) {
                entity.getValue().setReadyForTrip(true);
                System.out.println(entity.getValue().getFirstName() + " can visit "+ country);
                allowedWorkers.add(entity.getValue());
            }

        }
        return allowedWorkers;
    }

    public static void start(){
        System.out.println(WorkerMap.getWorkers());
        sortByDate();
        workersReadyForTrip(start,end);
        Map<String, List<Worker>> modifiableMap = new TreeMap<>();
        List<Worker> allowedWorkers = canVisitCountry(country);
        modifiableMap.put(country,allowedWorkers);
        System.out.println(Collections.unmodifiableMap(modifiableMap));
    }

}
