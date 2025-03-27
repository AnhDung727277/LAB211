/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.Geographic;

public class Country {
    protected String countryCode;
    protected String countryName;
    protected float totalArea;


    public Country() {
        this.countryCode = "";
        this.countryName = "";
        this.totalArea = 0;
    }

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        setTotalArea(totalArea);
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        if (totalArea > 0) {
            this.totalArea = totalArea;
        } else {
            System.out.println("Diện tích phải lớn hơn 0.");
        }
    }

    public void display() {
        System.out.printf("ID: %s, Name: %s, Total Area: %.2f\n", countryCode, countryName, totalArea);
    }
}
