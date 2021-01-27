package com.algorithmpractice.other;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StreamsPractice {
    static enum Continent{NORTH_AMERICA, AFRICA, EUROPE};

    public static class Country{
        Continent continent;
        int population;

        public Country(Continent continent, int population){
            this.continent = continent;
            this.population = population;
        }
    }

    public static int findPopulation(List<Country> countries, Continent continent){
        int population = 0;

        for(Country country: countries){
            if(country.continent == continent){
                population += country.population;
            }
        }

        return population;
    }

    public static int findPopulationStreams(List<Country> countries, Continent continent) {
        return countries.stream().filter(c -> c.continent == continent).map(c -> c.population).reduce(0, (a, b) -> a + b);
    }

    @Test
    public void test(){
        Country country1 = new Country(Continent.AFRICA, 1000);
        Country country2 = new Country(Continent.AFRICA, 2000);
        List<Country> countries = Arrays.asList(country1, country2);

        assertEquals(3000, StreamsPractice.findPopulation(countries, Continent.AFRICA));
        assertEquals(3000, StreamsPractice.findPopulationStreams(countries, Continent.AFRICA));
    }
}
