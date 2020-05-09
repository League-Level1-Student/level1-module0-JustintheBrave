int dotY=0;
int dotX;
int score=0;
void setup(){
 size(500,500); 
}

void draw(){
 background(96,101, 147);
 
 dotY=dotY+10;
 
 
 if(dotY==420){
    checkCatch(dotX);
      dotY=0;
      dotX=(int)random(1, 500);
      
    }
 
    fill(50, 23,255);
    stroke(50, 23, 198);
    ellipse(dotX, dotY, 20, 20);
    
    fill(149, 95, 14);
    rect(mouseX, 400, 40, 50);
    fill(100,98,95);
    rect(mouseX, 415, 40, 5);
    
      fill(255, 255, 255);
    textSize(16);
    text("Score: " + score, 20, 20);
    
}

void checkCatch(int x){
         if (x > mouseX && x < mouseX+40)
            score++;
         
        println("Your score is now: " + score);
    }
