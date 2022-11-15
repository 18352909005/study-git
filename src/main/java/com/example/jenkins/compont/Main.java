package com.example.jenkins.compont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = asArray(new Integer(1),new Integer(2), new Integer(3));

        System.out.println(Arrays.toString(arr));

        //ClassCastException:

        Integer[] firstTwo = pickTwo(1,2,3);

        System.out.println(Arrays.toString(firstTwo));
    }

    static <K extends Integer> K[] pickTwo(K k1, K k2, K k3) {
        return asArray(k1,k2,k3);
    }

    static <T> T[] asArray(T... objs) {
        return objs;
    }

    public void  te(Main abc){

    }


    public void  te2(){
        Main main = new Main();

        main.te(this);
    }

}
