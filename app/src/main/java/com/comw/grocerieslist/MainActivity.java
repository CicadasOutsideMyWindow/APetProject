package com.comw.grocerieslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<GroceryItem> groceryItems = new ArrayList<GroceryItem>();

    ExpandableListView expandableListView;
    HashMap<String, List<String>> listItems;
    List<String> categoryTitles;
    ExpandableListAdapter expandableListAdapter;


    public void onCheckboxClicked(View view) {
//        boolean checked = ((CheckBox) view).isChecked();
//
//        switch(((CheckBox) view).getId()) {
//
//            case R.id.checkBox:
//                TextView listItem1 = findViewById(R.id.listItem1);
//                if(checked) {
//                    listItem1.setTextColor(Color.GRAY);
//                    listItems.add(listItem1);
//                    System.out.println("OLOLOLOLO: " + listItems);
//                    Log.i(listItem1.toString(), " added to grocery list");
//                    Toast.makeText(MainActivity.this, listItem1.getText() + " added to grocery list", Toast.LENGTH_SHORT ).show();
//
//            } else {
//                    listItems.remove(listItem1);
//                    System.out.println("OLOLOLOLO: " + listItems);
//                    Log.i(listItem1.toString(), " moved from grocery list");
//                    Toast.makeText(MainActivity.this, listItem1.getText() + " moved from grocery list", Toast.LENGTH_SHORT ).show();
//                }
//
//        }
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
            listItems = MockData.getData();
            categoryTitles = new ArrayList<String>(listItems.keySet());
            expandableListAdapter = new ExpandableListAdapter(this, categoryTitles, listItems);
            expandableListView.setAdapter(expandableListAdapter);

            final List<GroceryItem> currentGroceryList = new ArrayList<GroceryItem>();

            expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

                @Override
                public void onGroupExpand(int groupPosition) {
                    Toast.makeText(getApplicationContext(),
                            categoryTitles.get(groupPosition) + " List Expanded.",
                            Toast.LENGTH_SHORT).show();
                }
            });

            expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

                @Override
                public void onGroupCollapse(int groupPosition) {
                    Toast.makeText(getApplicationContext(),
                            categoryTitles.get(groupPosition) + " List Collapsed.",
                            Toast.LENGTH_SHORT).show();

                }
            });

            expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
                @Override
                public boolean onChildClick(ExpandableListView parent, View v,
                                            int groupPosition, int childPosition, long id) {

                    String groceryItemName = listItems.get(categoryTitles.get(groupPosition)).get(childPosition);
                    GroceryItem groceryItem = new GroceryItem(groceryItemName);

                    groceryItems.add(groceryItem);

                    Toast.makeText(
                            getApplicationContext(),
                            groceryItemName + " added to the grocery list", Toast.LENGTH_SHORT
                    ).show();

                    //TODO:
                    // grey out
                    // make not clickable (?)
                    // add to the current list

                    System.out.println(Arrays.asList(groceryItems));



                    return false;
                }
            });
        }

    }

//    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
////    }
//}
