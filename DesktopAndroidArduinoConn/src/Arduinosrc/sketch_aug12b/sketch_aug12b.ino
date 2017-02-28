
void setup() {
  Serial.begin(9600);
  pinMode(4, OUTPUT);
}

void loop()
{
  char c;
  
if(Serial.available())
  {
   Serial.print("AVAILABLE");
   c = Serial.read();
   Serial.print(c);
   if(c=='1'){
   digitalWrite(4, HIGH);
   Serial.print(" CONNECTED");
   }
}
}

