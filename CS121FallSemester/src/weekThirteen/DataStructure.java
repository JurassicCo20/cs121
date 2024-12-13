package weekThirteen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();
    int[] newList = new int[ageList.length - 1];

    public void addStudent(String name){
        studentList.add(name);
    }
    public void removeStudent(int num){
        studentList.remove(num);
    }

    public void displayStudents(){
        System.out.println("**** STUDENT LIST ****");
        for (String s : studentList ){
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
    public void addAge(int num, int age){
        ageList[num] = age;
    }

    public void removeAge(int num){
        int value = ageList[num];
        newList = new int[ageList.length - 1];

        for (int i = 0; i < newList.length; i ++)
        {
            if (ageList[i] == value)
                newList[i] = ageList[i + 1];
            else
                newList[i] = ageList[i];
        }
    }

    public void displayAges(){
        System.out.println("**** AGE LIST ****");
        if(newList[0] == ageList[0]){
            for (int i = 0; i < newList.length; i++) {
                System.out.printf("%d ", newList[i]);
            }
        }
        else{
            for (int i = 0; i < ageList.length; i++) {
                System.out.printf("%d ", ageList[i]);
            }
        }
    }

    public void addMajorGpaMap(String s, Double dub){
        majorGpaMap.put(s, dub);
    }
    public void removeMajorGpaMap(String s){
        majorGpaMap.remove(s);
    }
    public void displayAllGpas(){
        String newIdeas = majorGpaMap.values().toString();
        System.out.println(newIdeas);
    }

    public void addNationality(String nation){
        nationalityList.add(nation);
    }
    public void removeNationality(String nation){
        nationalityList.remove(nation);
    }
    public void displayNationality(){
        System.out.println("**** NATIONALITIES ****");
        for(String nation : nationalityList){
            System.out.println(nation);
        }
    }

    public void addHometown(String hometown){
        hometownStack.push(hometown);
    }
    public void removeHometown(String hometown){
        hometownStack.pop();
    }
    public void displayHometown(){
        System.out.println("**** HOMETOWNS ****");
        for (String s : hometownStack) {
            System.out.println(s);
        }
    }

    public void addHomeState(String state){
        homeStateQueue.add(state);
    }

    public void removeHomeState(){
        homeStateQueue.remove();
    }

    public void displayHomeStates(){
        for (String s : homeStateQueue) {
            System.out.print(s + " ");
        }
    }
}
