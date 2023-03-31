
package com.stir.cscu9t4practical1;

/**
 *
 * @author Ihsan
 */
class SprintEntry extends Entry {
    private int repetitions;
    private int recovery;
     
 public SprintEntry( String n, int d , int m, int y, int h , int min ,int s, float dist, int rr ,int rv ){
    super (n, d, m, y, h, min, s, dist);
    repetitions = rr ; 
    recovery = rv;
 }
 public  int getRepetitions(){ 
    return repetitions;}
 
 public int getRecovery(){
     return recovery; }
  

 public String getEntry (){  String result = getName() + " sprinted " + getRepetitions() + "x" + getDistance() + "m in "
                + getHour() + ":" + getMin() + ":" + getSec() +  " with "
                + getRecovery() + " minutes recovery on "
                + getDay() + "/" + getMonth() + "/" + getYear() +"\n";
        return result;
 }
}