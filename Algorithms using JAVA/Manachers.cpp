#include<iostream>
using namespace std;

int min(int a, int b) {
   return (a<b)?a:b;
}

string longestPalindrome(string mainString) {
   int n = mainString.size();
   if(n == 0)
      return "";
   n = 2*n + 1; //count the next position
   int longPal[n]; //array to store longest palindrome length
   longPal[0] = 0; longPal[1] = 1;
   int centerIndex = 1;
   int rightIndex = 2;
   int right = 0, left;
   int maxPalLength = 0, maxCenterIndex = 0;
   int start = -1, end = -1, diff = -1;

   for (right = 2; right < n; right++) {
      left  = 2*centerIndex-right; //calculate left position using center and right
      longPal[right] = 0;
      diff = rightIndex - right;

      if(diff > 0)
         longPal[right] = min(longPal[left], diff);
      while ( ((right + longPal[right]) < n && (right - longPal[right]) > 0) &&
         ( ((right + longPal[right] + 1) % 2 == 0) ||
         (mainString[(right + longPal[right] + 1)/2] == mainString[(right - longPal[right] - 1)/2] ))) {
         longPal[right]++;
      }

      if(longPal[right] > maxPalLength) {    //max palindrome length
         maxPalLength = longPal[right];
         maxCenterIndex = right;
      }

      if (right + longPal[right] > rightIndex) {
         centerIndex = right;
         rightIndex = right + longPal[right];
      }
   }

   start = (maxCenterIndex - maxPalLength)/2;
   end = start + maxPalLength - 1;
   string palindrome;

   for(int i=start; i<=end; i++)
      palindrome += mainString[i];
      return palindrome;
}

int main(int argc, char *argv[]) {
   string mainString, palindrome;
   cout << "Enter String:";
   cin >> mainString;
   palindrome = longestPalindrome(mainString);
   cout << "Longest palindrome is: " << palindrome << endl;
}