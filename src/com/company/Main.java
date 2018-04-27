package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String answer;
        Event anevent;
        Speaker aspeaker;


        ArrayList<Event> events = new ArrayList<>();
        ArrayList<Speaker> speakers = new ArrayList<>();


     do{

      showMenu();

      System.out.println("Enter a Menu Number ");

      switch(Integer.valueOf(scan.nextLine())){

        case 1:

        do{

            System.out.println("Add an Event");
            anevent=addEvent(scan.nextLine());
            events.add(anevent);

            System.out.println("Add Another Event");

            if(scan.nextLine().equalsIgnoreCase("no"))

                done=true;

            }while(!done);

        break;

        case 2:

            done=false;
          do{

              System.out.println("Add a Speaker");
              aspeaker=addSpeaker(scan.nextLine());

              speakers.add(aspeaker);
              System.out.println("Add another Speaker");

              if(scan.nextLine().equalsIgnoreCase("no"));
              done=true;

          }while(!done);

         break;

     case 3:

          System.out.println("Add speaker to events");

          System.out.println("******Events******");
          showEvents(events);
          System.out.println("Select Event");
          String eventName=scan.nextLine();
          Event theEvent=new Event();

          for(Event eachEvent:events){

              if(eachEvent.getTitle().equalsIgnoreCase(eventName))
                  theEvent=eachEvent;
          }

          events.remove(theEvent);

    }



}while(done);





    }




    public static void showMenu(){
        System.out.println("1. Create an event\n" +
                "        2. Add a speaker to an event\n" +
                "        3. Show all the speakers for all events\n" +
                "        4. Show all the speakers for a given event (selected by the user)");


    }

    public static Event addEvent(String name)
    {
        Event e = new Event(name);
        return e;

    }


    public static Speaker addSpeaker(String name)
    {
        Speaker s = new Speaker(name);
        return s;
    }




    public static void showSpeakers(ArrayList<Speaker> speakers)
    {
        for (Speaker speaker:speakers
                ) {
            System.out.println(speaker.getName());

        }
    }

    public static void showEvents(ArrayList<Event> events)
    {
        for (Event event:events
                ) {
            System.out.println(event.getTitle());

        }
    }





}











































//      do {

//
//    System.out.println("1. Creat an event");
//    System.out.println("2. Add a speaker to an event");
//    System.out.println("3. The Speakers for all event");
//    System.out.println("4. The speakers for a given event");
//    System.out.println("5. show upcoming events");
//    System.out.println("6. show past events");
//    System.out.println("7. Enter a day to search for past and upcoming events");
//
//          System.out.println("Enter your choice from the menu");
//          choice=scan.nextInt();
//          scan.nextLine();
//
//
//
//          if(choice==1){
//
//           do{
//               System.out.println("Enter the title of event");
//
//
//
//
//           }while();
//
//
//
//          }
//
//       }while();

//    }
//}
