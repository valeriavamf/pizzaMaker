/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.factory;

import com.pizzaMaker.model.SliceInfo;
import com.pizzaMaker.model.ingredients.EmptySize;
import com.pizzaMaker.model.ingredients.LargeSize;
import com.pizzaMaker.model.ingredients.MediumSize;
import com.pizzaMaker.model.ingredients.PersonalSize;
import com.pizzaMaker.model.ingredients.Size;
import com.pizzaMaker.model.ingredients.SmallSize;

/**
 *
 * @author vmejia
 */
public class SizeFactory {
    
    public static Size createSize(SliceInfo sliceInfo){
        Size result = null;
        switch(sliceInfo.getOption()){
            case 1: 
                result = new PersonalSize();
                break;
            case 2: 
                result = new SmallSize();
                break;
            case 3: 
                result = new MediumSize();
                break;    
            case 4: 
                result = new LargeSize();
                break;
            default:
                result = new EmptySize();
          
        }
        if (sliceInfo.getSlice() > 0) {
            result.setPizzaSlices(sliceInfo.getSlice());
        }
        return result;
    }
    
}
