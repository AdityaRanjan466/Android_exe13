package com.example.mealmenu;

import java.util.ArrayList;
import java.util.List;

public class MenuDetails {
    public static class Data {
        public String _Name;
        public int _ResourceID;
        public double _Price;
        Data(String name, int resourceId, double price) {
            _Name = name;
            _ResourceID = resourceId;
            _Price = price;
        }
    }
    public static ArrayList<Data> MealList = new ArrayList<>();
    public static void initList() {
        Data None = new Data("None", R.drawable.img_no_image, 0.00);
        Data ChickenBurger = new Data("Chicken Burger",R.drawable.img_chicken_burger,7.00);
        Data VegBurger = new Data("Veg Burger",R.drawable.img_veg_burger,6.00);
        Data ChickenWrap = new Data("Chicken Wrap",R.drawable.img_chicken_wrap,9.00);
        Data VegWrap = new Data("Veg Wrap",R.drawable.img_veg_wrap,8.00);
        Data ChickenNuggets = new Data("Chicken Nuggets",R.drawable.img_chicken_nuggets,5.00);
        Data VegNuggets = new Data("Veg Nuggets",R.drawable.img_veg_nuggets,4.00);
        Data PotatoWedges = new Data("Potato Wedges",R.drawable.img_potato_wedges,3.00);
        Data FrenchFries = new Data("French Fries",R.drawable.img_french_fries,2.00);
        Data ColdDrink = new Data("Cold Drink",R.drawable.img_cold_drinks,1.00);
        Data HotBeverages = new Data("Hot Beverages",R.drawable.img_hot_beverages,1.50);
        MealList.add(None);
        MealList.add(ChickenBurger);
        MealList.add(VegBurger);
        MealList.add(ChickenWrap);
        MealList.add(VegWrap);
        MealList.add(ChickenNuggets);
        MealList.add(VegNuggets);
        MealList.add(PotatoWedges);
        MealList.add(FrenchFries);
        MealList.add(ColdDrink);
        MealList.add(HotBeverages);
    }
    public static int getIndex(String itemName) {
        int i = 0;
        for(Data data : MealList) {
            if(data._Name.equals(itemName)) {
                return i;
            } i++;
        }
        return -1;
    }
    public static int getImageResourceID(int index) {
        return MealList.get(index)._ResourceID;
    }
    public static double getPrice(int index) {
        return MealList.get(index)._Price;
    }
}
