package com.comw.grocerieslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MockData {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> freshVeggies = new ArrayList<String>(Arrays.asList("Asparagus","Broccoli","Carrots",
                "Cauliflower","Celery","Corn","Cucumbers","Lettuce","Greens","Mushrooms","Onions",
                "Peppers","Potatoes","Spinach","Squash","Zucchini","Tomatoes"));

        List<String> fruits = new ArrayList<String>(Arrays.asList("Apples","Avocados","Bananas",
                "Berries","Cherries","Grapefruit","Grapes","Kiwis","Lemons", "Limes","Melon",
                "Nectarines","Oranges","Peaches","Pears","Plums"));

        List<String> refrigerated = new ArrayList<String>(Arrays.asList("Bagels","Chip dip","Eggs",
                "English muffins","Fruit juice", "Hummus", "Ready-bake breads","Tofu","Tortillas"));

        List<String> frozen = new ArrayList<String>(Arrays.asList("Breakfasts","Burritos","Fish sticks",
                "Fries","Ice cream","Juice concentrate","Pizza","Pizza Rolls","Popsicles","TV dinners",
                "Vegetables"));

        List<String> sauces = new ArrayList<String>(Arrays.asList("BBQ sauce","Gravy","Honey","Hot sauce","Jam",
                "Jelly","Preserves","Ketchup / Mustard","Mayonnaise","Pasta sauce","Relish","Salad " +
                "dressing","Salsa","Soy sauce","Steak sauce","Syrup","Worcestershire sauce"));

        List<String> canned = new ArrayList<String>(Arrays.asList("Canned foods","Applesauce","Baked " +
                "beans","Broth","Fruit","Olives","Tinned meats","Tuna / Chicken","Soup / Chili",
                "Tomatoes","Veggies"));

        List<String> herbs = new ArrayList<String>(Arrays.asList("Basil","Black pepper","Cilantro",
                "Cinnamon","Garlic","Ginger","Mint","Oregano","Paprika","Parsley","Red pepper",
                "Salt","Vanilla extract"));

        List<String> diary = new ArrayList<String>(Arrays.asList("Butter / Margarine","Cottage cheese",
                "Half & half","Milk","Sour cream","Whipped cream","Yogurt"));

        List<String> cheese = new ArrayList<String>(Arrays.asList("Bleu cheese","Cheddar","Cottage " +
                "cheese","Cream cheese","Feta","Goat cheese","Mozzarella","Parmesan","Provolone",
                "Ricotta","Sandwich slices","Swiss"));

        List<String> meat = new ArrayList<String>(Arrays.asList("Bacon / Sausage","Beef","Chicken",
                "Ground beef / Turkey","Ham / Pork","Hot dogs","Lunchmeat","Turkey"));

        List<String> seafood = new ArrayList<String>(Arrays.asList("Catfish","Crab","Lobster","Mussels",
                "Oysters","Salmon","Shrimp","Tilapia","Tuna"));

        List<String> beverages = new ArrayList<String>(Arrays.asList("Beer","Club soda / Tonic",
                "Champagne","Gin","Juice","Mixers","Red wine / White wine","Rum","Saké","Soda pop",
                "Sports drink","Whiskey","Vodka"));

        List<String> baked = new ArrayList<String>(Arrays.asList("Bagels / Croissants","Buns / Rolls",
                "Cake / Cookies","Donuts / Pastries","Fresh bread","Pie! Pie! Pie!","Pita bread","Sliced bread"));

        List<String> baking = new ArrayList<String>(Arrays.asList(",Baking","Baking powder / Soda",
                "Bread crumbs","Cake / Brownie mix","Cake icing / Decorations","Chocolate chips / Cocoa",
                "Flour","Shortening","Sugar","Sugar substitute","Yeast"));

        List<String> snacks = new ArrayList<String>(Arrays.asList("Candy / Gum","Cookies","Crackers",
                "Dried fruit","Granola bars / Mix","Nuts / Seeds","Oatmeal","Popcorn","Potato / Corn chips",
                "Pretzels"));

        expandableListDetail.put("Fresh Veggies", freshVeggies);
        expandableListDetail.put("Fruits", fruits);
        expandableListDetail.put("Refrigerated goods", refrigerated);
        expandableListDetail.put("Frozen goods", frozen);
        expandableListDetail.put("Sauces", sauces);
        expandableListDetail.put("Canned goods", canned);
        expandableListDetail.put("Herbs", herbs);
        expandableListDetail.put("Diary", diary);
        expandableListDetail.put("Cheese", cheese);
        expandableListDetail.put("Meat", meat);
        expandableListDetail.put("Seafood", seafood);
        expandableListDetail.put("Beverages", beverages);
        expandableListDetail.put("Baked", baked);
        expandableListDetail.put("Baking", baking);
        expandableListDetail.put("Snacks", snacks);

        return expandableListDetail;
    }
}
