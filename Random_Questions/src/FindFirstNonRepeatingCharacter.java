public class FindFirstNonRepeatingCharacter {

        // 1). O(n2)
        // public static int firstNonRepeating(String s){
        //     for(int i=0;i<s.length();i++){
        //         boolean unique= true;

        //         for(int j=0;j<s.length();j++){
        //             if(i!=j && s.charAt(i) == s.charAt(j)){
        //                 unique = false;
        //                 break;
        //             }
        //         }
        //         if(unique)
        //             return i;
        //     }
        //     return -1;
        // }

        // 2). O(n)
        public static int firstNonRepeating(String s){
            int freq[] = new int[256];

            // count frequency
            for(char c: s.toCharArray()){
                freq[c]++;
            }

            //find first with freq:1
            for(int i=0;i<s.length();i++){
                if(freq[s.charAt(i)] == 1){
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            String s = "swiss";
            System.out.println("YOUR ANSWER IS: "+firstNonRepeating(s));
        }
    }
