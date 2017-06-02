package cobra;

import java.awt.Point;

public class obj_cobra {
    int vida=3,tamanho=5;
    int[][] corpo = new int[tamanho][2];
    int[][] cabeca = new int[2][2];
    Point[] pf = new Point[5];

    public obj_cobra() {
        pf[0].x=4;
        pf[0].y=5;
        cabeca[0][0] = 5;
        cabeca[1][0] = 0;
        corpo[0][0] = 0;
        corpo[1][0] = 0;
        corpo[2][0] = 0; 
        corpo[3][0] = 0;
        corpo[4][0] = 0;
    }   
}
