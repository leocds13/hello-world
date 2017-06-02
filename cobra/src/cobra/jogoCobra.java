package cobra;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jogoCobra extends JFrame{
    
    JPanel painel = new JPanel(); 
    int x, y;
    Barra[][] barra = new Barra[50][50];
    boolean pc=false,pd=false,pe=false,pb=false;
        
    public jogoCobra(){
        x=0;
        y=0;
        
        while(y<50){    
            while(x<50){
                barra[x][y] = new Barra(x*10, y*10);
                barra[x][y].setVisible(false);
                painel.add(barra[x][y]);
                x++;
            }
            x=0;
            y++;
        }
        
        x=0; y=0;
        
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==37){//esquerda
                    mudD(1);
                }else if(e.getKeyCode()==38){//seta p/ cima
                    mudD(0);
                }else if(e.getKeyCode()==39){//direita
                    mudD(3);
                }else if(e.getKeyCode()==40){//baixo
                    mudD(2);
                }
            }
        });
        
        janela();
        new test().run();
        
    }
    
    public void mudD(int d){
        if((d==0)&&(!pb)){
            pc=true;
            pe=false;
            pd=false;
            return;
        }else if((d==1)&&(!pd)){
            pb=false;
            pe=true;
            pc=false;
            return;
        }else if((d==2)&&(!pc)){
            pb=true;
            pe=false;
            pd=false;
            return;
        }else if((d==3)&&(!pe)){
            pd=true;
            pc=false;
            pb=false;
            return;
        }
    }
    
    public void print(int x, int y){
        barra[x][y].setVisible(true);
    }
    
    public void erase(int x, int y){
        barra[x][y].setVisible(false);
    }
    
    
    
    public class test extends Thread{
        public void run(){
            x=0;
            y=0;
            int a=0;
            int[][] corpo = new int[5][2];
            int px=0,py=0;
            while(true){
                try{sleep(100);}catch(Exception erro){}
                corpo[0][0]=corpo[1][0];
                corpo[0][1]=corpo[1][1];
                corpo[1][0]=corpo[2][0];
                corpo[1][1]=corpo[2][1];
                corpo[2][0]=corpo[3][0];
                corpo[2][1]=corpo[3][1];
                corpo[3][0]=corpo[4][0];
                corpo[3][1]=corpo[4][1];
                corpo[4][0]=x;
                corpo[4][1]=y;
                
                i
                
                if(pc){
                    y--;
                }
                if(pb){
                    y++;
                }
                if(pd){
                    x++;
                }
                if(pe){
                    x--;
                }
                print(x, y);
                erase(corpo[0][0], corpo[0][1]);
            }
        }
    }
    
    public void janela(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
        setLocationRelativeTo(null);
        setTitle("Velha#");
        
        painel.setBounds(0, 0, 500, 500);
        
        painel.setVisible(true);
        painel.setLayout(null);
        add(painel);
        
    }
    
    public static void main(String[] args){
        new jogoCobra();
    }
    
}
