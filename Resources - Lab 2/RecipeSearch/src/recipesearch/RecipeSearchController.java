/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipesearch;

import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.lab2.Recipe;
import se.chalmers.ait.dat215.lab2.RecipeDatabase;
import se.chalmers.ait.dat215.lab2.SearchFilter;

/**
 *
 * @author Anton
 */
public class RecipeSearchController{
    RecipeDatabase db;
    public RecipeSearchController(){
       db = RecipeDatabase.getSharedInstance();
       
    }
    
    public List<Recipe> getResults(SearchFilter filter){
        List<Recipe> temp = db.search(filter);
        List<Recipe> result = new ArrayList<Recipe>();
        for (Recipe r: temp){
            if (((r.getCuisine().equals(filter.getCuisine()) || filter.getCuisine() == null) && (r.getMainIngredient().equals(filter.getMainIngredient()) || filter.getMainIngredient() == null) && (r.getPrice() < filter.getMaxPrice() || filter.getMaxPrice() == 0) && (r.getTime() < filter.getMaxTime() || filter.getMaxTime() == 0))){
                if (filter.getDifficulty() == null || r.getDifficulty().equals(filter.getDifficulty()) || r.getDifficulty().equals("Lätt") || (r.getDifficulty().equals("Mellan") && filter.getDifficulty().equals("Svår"))){
                    result.add(r);
                }
            }
        }
        return result;
    }
}
