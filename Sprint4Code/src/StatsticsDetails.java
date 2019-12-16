/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class StatsticsDetails {

    int NumberOfProducts_viewed = 0;
    int NumberOfStores_visited = 0;
    int NumberOfProducts_bought = 0;
    Database DB = new Database();

    public int getNumberOfProducts_viewed() {
        return NumberOfProducts_viewed;
    }

    public void setNumberOfProducts_viewed(int NumberOfProducts_viewed) {
        this.NumberOfProducts_viewed = NumberOfProducts_viewed;
    }

    public int getNumberOfStores_visited() {
        return NumberOfStores_visited;
    }

    public void setNumberOfStores_visited(int NumberOfStores_visited) {
        this.NumberOfStores_visited = NumberOfStores_visited;
    }

    public int getNumberOfProducts_bought() {
        return NumberOfProducts_bought;
    }

    public void setNumberOfProducts_bought(int NumberOfProducts_bought) {
        this.NumberOfProducts_bought = NumberOfProducts_bought;
    }

}
