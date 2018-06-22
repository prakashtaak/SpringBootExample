package com.example.ScalaExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Intf{
    void display();
    default  void display1(){
        System.out.print("Hello");
    }
}
public class Sample {

    int i,j;

    public Sample(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Sample() {
    }

     void  transform(Function<Stream<Sample>, Stream<Sample>> function){
        function.apply(new ArrayList<Sample>().stream()).forEach(System.out::println);
    }
    void test(){
        List<Sample> samplList=Arrays.asList(new Sample(2,3),new Sample(5,7),new Sample(77,43));
        List<Sample> out=new ArrayList<>();
        transform(x -> samplList.stream().sorted(Comparator.comparing( Sample::getJ)));

      //  int result=   samplList.stream().reduce(0,(x,y) -> x.getJ()+y.getJ());

        int[] array = {30, 10, 20, 40};
        int sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
    }
   // static Function<List<Sample>,Integer>  concatObject =  list -> list.stream().reduce(0,(x,y) -> x.getI()+y.getI(),(p,q) -> p+q);
    public static void main(String[] args) {
    Sample obj=new Sample();
    obj.test();
        Intf test= () ->{System.out.print("asdasd");};
        test.display();
    }


}



   /* class Iimpl implements I{

        @Override
        public void display() {
            System.out.print("functional");
        }
    }*/
