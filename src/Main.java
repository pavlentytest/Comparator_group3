import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {30, 20, 5, 12, 55};
        Arrays.sort(array);
        for(int a: array) System.out.print(a+" ");
        int x = Arrays.binarySearch(array, -3);
        System.out.println();
        System.out.println(x);

        ArrayList arrayList = new ArrayList(Arrays.asList(array));
        for(int i=0;i<arrayList.size();i++) System.out.print(arrayList.get(i)+" ");
        Collections.sort(arrayList);
        int result = Collections.binarySearch(arrayList, 2);

        class City implements Comparable<City>{
            public String name;
            public int population;

            public City(String name, int population) {
                this.name = name;
                this.population = population;
            }

            @Override
            public int compareTo(City o) {
                return o.population-this.population;
            }
        }
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Moscow",15000000));
        cities.add(new City("Berlin",3000000));
        cities.add(new City("Munich",1500000));
        cities.add(new City("St.Petersburg",5000000));

        Comparator<City> sort_by = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                //return o2.name.compareTo(o1.name);
                return o2.population-o1.population;
            }
        };
        System.out.println();
        Collections.sort(cities);
        for(City c: cities) {
            System.out.println(c.name + " "+c.population);
        }

    }
}