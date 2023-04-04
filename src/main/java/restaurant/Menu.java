package restaurant;

import java.util.ArrayList;
import java.util.Date;
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
}
