8.15 LAB: Instrument information (derived classes)
Given main() and the Instrument class, define a derived class, StringInstrument, with methods to set and get private fields of the following types:

int to store the number of strings
int to store the number of frets
boolean to store whether the instrument is bowed
Ex. If the input is:

Drums
Zildjian
2015
2500
Guitar
Gibson
2002
1200
6
19
false
the output is:

Instrument Information: 
   Name: Drums
   Manufacturer: Zildjian
   Year built: 2015
   Cost: 2500
Instrument Information: 
   Name: Guitar
   Manufacturer: Gibson
   Year built: 2002
   Cost: 1200
   Number of strings: 6
   Number of frets: 19
   Is bowed: false