package com.comw.grocerieslist;

public class ExampleItem {

    private int image;
    private String productName;
    private String productDescription;

    public ExampleItem(int image, String productName, String productDescription) {
        this.image = image;
        this.productName = productName;
        this.productDescription = productDescription;

    }

    public int getImage() {
        return image;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }
}
