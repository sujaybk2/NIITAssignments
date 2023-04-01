package Course1.Sprint1MC2PrimeNumberCheck;

/*
Algorithm
Step 1- Start
Step 2- Input min and max //get the minimum and maximum range from the user
Step 3- Loop for i=min, i<max-1, i++, repeat this step in
Check if primeNo = primeNo%primeNo = 0 && primeNo/1   //check in the range if the number is prime.
Step 4- Print all the primeNo
Step 5- Check if(sumOfPrimeNo = 2; sumOfPrimeNo < length.max; sumOfPrimeNo++)
Step 6- Print sumOfPrimeNo
Step 7- Stop

Pseudocode:
Begin
count
for(i=min; i<=max; i++){

count = 0
    for(j=2; j<i-1; j++){

                if(i%j == 0){
                count = count + 1
                }
    }

    if (count = 0) {
            print i;

     }


    }

End


 */
