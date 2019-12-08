void setup(){
size(500,500);
    }

    void draw(){
for (int i = 8; i > 0;i--){

ellipse(250, 250, i*50, i*50  );

if (i % 2 == 0 ) 
      fill(255, 0, 0);
      
      else {if (i % 1 == 0)
      fill(5, 5, 5);
}
    }
    
    
    
    
    }
