/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6;

/**
 *
 * @author lealemmum
 */
public class SimpleDotCom {
     int [] locationCells;
    int numOfHits=0;
    public void setLocationCells(int[] locs){
        locationCells=locs; 
    }
    public String checkYourself (String stringGuess){
        int guess= Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells){
            if (guess==cell){
                result= "hit";
                break;
            }
        }
    if( numOfHits==locationCells.length){
        result="kill";
    }
    System.out.println(result);
    return result;
    }

    void setLocationCellsCells(int[] laoctions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
