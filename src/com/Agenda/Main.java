package com.Agenda;
import java.util.*;

public class Main {

    public static List<Contact> contacte = new ArrayList<>();
    public static Scanner scn = new Scanner(System.in);
    public static String numeUtilizator;
    public static boolean utilizatorNou = true;
    public static int optiune;

    public static void main(String[] args)
    {
        Contact persoana = new Contact().CreareContact("Ion","Popescu","Str dragulesti, nr 5",0756789512L,0);
        if(utilizatorNou) PageUtilizatorNou();
        else MainPage();
    }

    //region print
    public static void print(Object obj)
    {
        System.out.print(obj);
    }
    //endregion

    //region Clear Screen Function
    public static void clrscr()
    {
        print("\033[H\033[2J");
        System.out.flush();
    }
    //endregion

    public static void MainPage()
    {
        print("Bine ai venit, "+numeUtilizator+".");
        print("Alege una din urmatoarele optiuni: \n(1) Afisare contacte \n(2) Creare contact nou");
        switch (optiune) {
            case 1:
                PageAfisareContacte();
                break;
            case 2:
                break;
            default: print("Optiunea selectata nu exista, incearca din nou.");
        }
    }

    public static void PageUtilizatorNou()
    {
        print("Bine ai venit!");
        print("\nEste prima data cand deschizi aceasta aplicatie, introdu numele detinatorului acestei agende electronice:\n");
        numeUtilizator = scn.next();
        //clrscr();
        MainPage();
    }

    public static void PageAfisareContacte()
    {
        for (Contact persoana : contacte)
        {
            persoana.AfisareContact();
        }
    }
}
