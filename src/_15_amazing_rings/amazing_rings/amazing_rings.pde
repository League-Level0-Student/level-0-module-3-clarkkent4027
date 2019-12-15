int x = 250;


void setup(){
size(1000,1000);
noFill();
  }




void draw(){
background(255);
noFill();
for (int i = 10; i >=1;i--){

ellipse(x++, 250, i*50, i*50  );

      
      
    }
    
}
