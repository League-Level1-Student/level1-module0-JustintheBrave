import ddf.minim.*;             //at the very top of your sketch
Minim minim;        //as a member variable
AudioPlayer song;      //as a member variable
PImage pictureOfRecord;                        //as member variable
int ImageAngle = 10;

void setup(){
          size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.png");        //in setup method
                pictureOfRecord.resize(height,width);     //in setup method
                  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);   //in the setup method
}

void draw(){
         ImageAngle=ImageAngle + 10;
  if(mousePressed){
         rotateImage(pictureOfRecord, ImageAngle);
         song.play();
  }
  else{
     song.pause();
  }
         image(pictureOfRecord, 0,0);  //in draw method

}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
}
