/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package works.old;

/**
 *
 * @author seshasayana
 */
class StartEndList {
    
    private int point;
    private int marker;

    public StartEndList(int point, int marker) {
        this.point = point;
        this.marker = marker;
    }
    
    
    public int  getPoint(){
        
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setMarker(int marker) {
        this.marker = marker;
    }
    
      public int  getMarker(){
        
        return marker;
    }
    
}
