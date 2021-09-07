package com.company.model;

import com.company.BlockBuster;

import java.time.LocalDate;
import java.util.Date;

public  class Product {
    private BlockBuster store;
    private String name;
    private LocalDate dateOfRelease;
    private double rentalPrice;
    private double retailPrice;
    protected Platform platform;
    private ProductType productType;

    public Product(String name, LocalDate dateOfRelease, double rentalPrice, double retailPrice, Platform platform, boolean isSelect, ProductType productType) {
        this.name = name;
        this.dateOfRelease = dateOfRelease;
        this.rentalPrice = rentalPrice;
        this.retailPrice = retailPrice;
        this.platform = platform;
        this.isSelect = isSelect;
        this.productType = productType;
        this.platform = setPlatform(productType,dateOfRelease);
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    private Platform setPlatform(ProductType productType, LocalDate dateOfRelease){
        int releaseYear = dateOfRelease.getYear();
        Platform result = null;
        switch (productType){
            case TV_SHOW:
            case MOVIE:
                if (releaseYear < 2000){
                    result = Platform.VHS;
                    break;
                }else if (releaseYear>=2000 && releaseYear<=2010){
                    result =  Platform.CD;
                    break;
                }else{
                    result =  Platform.BLUE_RAY;
                    break;
                }
            case MUSIC:
                result =  Platform.CD;
                break;
            case VIDEO_GAME:
                result =  Platform.DVD;
        }
        return result;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


}
