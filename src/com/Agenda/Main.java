package com.Agenda;
import java.util.*;

public class Main {

    public List<Contact> contacte = new ArrayList<Contact>();
    public static Scanner scn = new Scanner(System.in);
    public static String numeUtilizator;
    public static boolean utilizatorNou = true;

    public static void main(String[] args)
    {
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
        print("Alege una din urmatoarele optiuni: \n(1) Afisare contacte \n(2)");
    }

    public static void PageUtilizatorNou()
    {
        print("Bine ai venit!");
        print("\nEste prima data cand deschizi aceasta aplicatie, introdu numele detinatorului acestei agende electronice:\n");
        numeUtilizator = scn.next();
        //.clrscr();
        MainPage();
    }
}
