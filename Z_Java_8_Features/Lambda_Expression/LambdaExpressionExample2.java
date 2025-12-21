package Z_Java_8_Features.Lambda_Expression;

interface  Drawable{
    public void draw();
}

 //1). Without Lambda Express
//public class LambdaExpressionExample {
//    public static void main(String[] args) {
//        int width=10;
//        Drawable d = new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing "+width);
//            }
//        };
//        d.draw();
//    }
//}

// 2). Anonymous Function
    public class LambdaExpressionExample2 {
        public static void main(String[] args) {
            int width=10;

            Drawable d = new Drawable() {
                @Override
                public void draw() {
                    System.out.println("Drawing "+width);
                }
            };
            
            d.draw();
            
            lengthInterface l = (str) -> str.length();
            System.out.println("String Length : "+l.stringLength("Yuvraj Singh"));
        }
    }

// 3). With Lambda Express

//public class LambdaExpressionExample {
//    public static void main(String[] args) {
//        int width=10;
//        Drawable d = ()->{
//            System.out.println("Drawing "+width);
//        };
//        d.draw();
//    }
//}



