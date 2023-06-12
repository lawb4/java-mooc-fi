package Fundamentals_II.Part_8.ShortRecap.TodoList;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ": " + list.get(i));
        }
    }

    public void remove(int number) {
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 == number) {
                list.remove(list.get(i));
            }
        }
        /*int index = number - 1;
        if (index < 0 || index >= this.tasks.size()) {
            return;
        }

        this.tasks.remove(index);*/
    }

    public boolean contains(int taskNumber) {
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 == taskNumber) {
                return true;
            }
        }
        return false;
    }

    public boolean containsTasks(){
        return list.size() > 0;
    }

    public ArrayList<String> getList() {
        return list;
    }
}
