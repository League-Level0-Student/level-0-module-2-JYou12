//Make a variable to hold the X co-ordinate of the dot and set it to 
int xc = 0;
void setup() {
    size(800, 200);
    
}

void draw() {
  //make it a nice color
    background(#CBC9C9);
rect(750,0,1,800);
 ellipse(xc, 100, 10, 10);
    //if the mouse is pressed...
if (mousePressed == true){
xc += 25;
}

if(xc == 800){

  stop();

}

}

    //... change the X co-ordinate so that the dot moves to the right
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.
    //Make your dot move really fast so that it can win the race 
        //(you have to figure out what part of your code to change)
    //Use this method to play a ding when your dot crosses the finish line. 


/*boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }
}*/