void setup(){
size(500, 500); 
background(255, 255, 255); 
noStroke();
}
float x;
float y;
float j = 15;
void draw(){
for(int i = 0; i<j; i++){
float red = random(255);
float green = random(255);
float blue = random(255);
fill(red, green, blue);
x= getWormX(i);
y= getWormY(i);
ellipse (x, y, 20, 20);


}
makeMagical();
}
float frequency = .003;
float noiseInterval = PI/2; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}

void mouseClicked() {
  j = j+1;
}