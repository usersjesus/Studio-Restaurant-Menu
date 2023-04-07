package restaurant;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu() {

    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addItem(MenuItem newItem) {
        this.menuItems.add(newItem);
    }

    public void removeItem(MenuItem menuItemToBeRemoved) {
        this.menuItems.remove(menuItemToBeRemoved);
    }

    public void isNewItem(MenuItem item) {
        if (item.getIsNew()) {
            System.out.println("NEW!");
        }

    }

    public Date dateUpdated () {
        return lastUpdated;
    }

//    public void upDate() {
//
//    }

    public void printMenu() {
        this.menuItems.forEach((menuItem -> System.out.println(menuItem.toString())));
    }

    public void menuItem(MenuItem item) {

    }

}

