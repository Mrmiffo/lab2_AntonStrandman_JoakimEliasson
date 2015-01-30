/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipesearch;

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
        return db.search(filter);
    }
}
