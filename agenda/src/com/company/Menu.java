package com.company;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class Menu {
    static Agenda agenda = new Agenda();
    static Menu menu = new Menu();
    public static void addentry(String entry, String date){
        agenda.entries.add(entry);
        agenda.date.add(date);
    }
    public static void list(){
        int length = agenda.entries.size();
        for (int i = 0; i < length; i++) {
            System.out.println("Entry: " + i + ": " + agenda.entries.get(i) + " DATE: " + agenda.date.get(i));
        }
    }
    public void delentry(){
        Scanner sc = new Scanner(System.in);
        list();
        int input = sc.nextInt();
        if (input < agenda.entries.size()) {
            agenda.entries.remove(input);
            agenda.date.remove(input);
        } else {
            delentry();
        }
    }
    public void searchby(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Search>>> ");
        String input = sc.next();
        for (int i = 0; i < agenda.entries.size(); i++) {
            if (input.contains(agenda.entries.get(i)) == true){
                System.out.println("Entry: " + i + ": " + agenda.entries.get(i) + " DATE: " + agenda.date.get(i));;
            }
        }
    }
    public void action(){
        System.out.println("1. add");
        System.out.println("2. del");
        System.out.println("3. list");
        System.out.println("4. searchby");
        System.out.println("5. quit");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1){
            System.out.println("Entry:");
            String entry = sc.next();
            String date = sc.next();
            Format dateFormatter = new SimpleDateFormat("dd-MM-yy");
            try {
                Date dt = (Date) dateFormatter.parseObject(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            addentry(entry, date);
        }
        if (input == 2){
            if (agenda.entries.size() > 0) {
                delentry();
            }
        }
        if (input == 3){
            if (agenda.entries.size() > 0) {
                list();
            }
        }
        if (input == 4){
            searchby();

        }
        if (input == 5){
            System.exit(0);
        }
        action();
    }
}
