public class NumberInWords {
    public static void main(String[] args) {
        System.out.println(numberInWords(3276702));    
    }
    static String numberInWords(int n){
        String out = "";
        String[] ones = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] tens = {"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        int num = n;
        int count = 0;
         while(num > 0){
           int rem = num%10;
            if(rem != 0){
                switch(count){
                    case 0 :{
                        out = ones[rem-1]+out;
                        break;
                    }
                    case 1:{
                        out = tens[rem-1]+out;
                        break;
                    }
                    case 2 :{
                        out = ones[rem-1]+"Hundred"+out;
                        break;
                    }
                    case 3:{
                        if(num/10 != 0){
                            out = tens[((num%100)/10)-1]+ones[rem-1]+"Thousand"+out;
                            count++;
                            num/=10;
                        }else{
                            out = ones[rem-1]+"Thousand"+out;
                        }
                        break;
                    }
                    case 5:{
                        if(num/10 != 0){
                            out = tens[((num%100)/10)-1]+ones[rem-1]+"Lakh"+out;
                            count++;
                            num/=10;
                        }else {
                            out = ones[rem-1]+"Lakh"+out;
                        }
                        break;
                    }
                    case 6 :{
                        out = tens[rem-1]+"Lakh"+out;
                        break;
                    }
                }
            }
            count++;
           num/=10;
         }
         return out;
       
    }
    // static String handleNumber(int num,int div){
    //     String[] ones = {"one","two","three","four","five","six","seven","eight","nine"};
    //     String[] tens = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    //     String out = "";
    //     int count = numberLength(div);
    //     while(num > 0){
    //         if(count == 0){
                
    //         }else if(count == 1){
            
    //         }else if(count )
    //     }
    //     return out;
    // }
    // static int numberLength(int n){
    //     return (int)Math.log10(n);
    // }
    /**
     *  if(num < 10){
                if(num == 0){
                    out+="zero";
                    break;
                }
                out+=ones[num-1];
            }else if(num < 100){
                int t = num/10;
                int o = num%10;
                if(o == 0){
                    out+=tens[o-1];
                    break;
                }else{
                    out+=tens[o-1];
                    out+=ones[o-1];
                    break;
                }  
            }else if(num < 1000){
                int o = num%10;
                int t = num/100;
                int h =num/10

            }
     */
    
}
