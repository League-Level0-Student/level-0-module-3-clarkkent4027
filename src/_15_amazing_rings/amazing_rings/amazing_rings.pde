int x = 500;
int leftbullseye = 250;
int rightbullseye = 750;
int leftspeed = -5;
int rightspeed = 5;
void setup() {
  size(1000, 1000);
}


void draw() {
  background(255);
  noFill();

  for (int i = 8; i >=1; i--) {
    ellipse(leftbullseye, x, i*50, i*50  );
  }
  for (int p = 8; p >=1; p--) {
    ellipse(rightbullseye, x, p*50, p*50  );
  }



  leftbullseye += leftspeed;
  rightbullseye += rightspeed;

  if (leftbullseye <= 0) {
    leftspeed = 5;
  }
  if (rightbullseye >= 1000) {
    rightspeed = -5;
  }
  if (leftbullseye >= 1000) {
    leftspeed = -5;
  }
  if (rightbullseye <= 0) {
    rightspeed = 5;
  }
    
}
