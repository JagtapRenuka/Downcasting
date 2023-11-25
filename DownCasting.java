public class DownCasting { 
        public static void main(String[] args) {
            Circle c=new Circle();
            Rectangle r=new Rectangle();
            Triangle t=new Triangle();
            DownCasting d=new DownCasting();
            d.shapes(c);
            d.shapes(r);
            d.shapes(t);
        }
        void shapes(Shape ref){
            ref.area();
            ref.draw();    
            if(ref instanceof Circle){ 
           ((Circle)(ref)).circum(); 
            }
            else if(ref instanceof Rectangle){    
           ((Rectangle)(ref)).perimeter(); 
            }
            else if(ref instanceof Triangle){    
           ((Triangle)(ref)).hypotomous();    
            }
        
        }
            
        }
        class Shape{
            void draw(){
                System.out.println("draw a shape");
            }
            void area(){
                System.out.println("find area of shape");
            }
        }
        class Circle extends Shape{
            void area(){
                System.out.println("find area of circle");
            }
            void circum(){
                System.out.println("circum of circle");
            }
        }
        class Rectangle extends Shape{
            void area(){
                System.out.println("find area of rectangle");
            }
            void perimeter(){
                System.out.println("peremeter of rectangle");
            }
        }
        class Triangle extends Shape{
            void area(){
                System.out.println("find area of triangle");
            }
            void hypotomous(){
                System.out.println("hypotomous of triangle");
            }
        }

