import java.util.Arrays;

public class Sort {
            public static void main(String[] args) {
            int [] mas = {11, 3, 14, 16, 7}; //массив в который юзер может ввести свои данные

            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                    //if(mas[i] < mas[i+1]){     Если нужно в обратном порядке

                        isSorted = false;

                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;
                    }
                }
            }
            System.out.println(Arrays.toString(mas));
        }
    }
